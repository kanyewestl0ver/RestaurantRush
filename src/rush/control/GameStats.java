package rush.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * Running score for one game, revenue, served count, unhappy departures and
 * Revenue is int cents
 */
public class GameStats {

    private int revenueCents;
    private final List<Integer> paidSatisfactions = new ArrayList<>();
    private int servedCount;
    private int unhappyDepartures;
    private int turnsUsed;

    public void recordPayment(int cents, int satisfaction) {
        revenueCents += cents;
        paidSatisfactions.add(satisfaction);
    }

    public void recordServed() {
        servedCount++;
    }

    public void recordDeparture() {
        unhappyDepartures++;
    }

    public void recordTurnPlayed(int turn) {
        turnsUsed = turn;
    }

    /** Average satisfaction recorded at payment, or empty if nobody has paid. */
    public OptionalDouble averageSatisfaction() {
        return paidSatisfactions.stream().mapToInt(Integer::intValue).average();
    }

    public GameResult evaluate(GameConfig c) {
        int paid = getPaidCount();
        int satSum = paidSatisfactions.stream().mapToInt(Integer::intValue).sum();
        boolean paidMet = paid >= c.getTargetPaid();
        boolean revenueMet = revenueCents >= c.getTargetRevenueCents();
        // Compare sums rather than doubles so an exact average of 60 counts.
        boolean satisfactionMet = paid > 0 && satSum >= c.getTargetAvgSatisfaction() * paid;
        return new GameResult(paidMet && revenueMet && satisfactionMet,
                paidMet, revenueMet, satisfactionMet, this, c);
    }

    public int getRevenueCents() {
        return revenueCents;
    }

    public int getPaidCount() {
        return paidSatisfactions.size();
    }

    public int getServedCount() {
        return servedCount;
    }

    public int getUnhappyDepartures() {
        return unhappyDepartures;
    }

    public int getTurnsUsed() {
        return turnsUsed;
    }
}

package rush.control;

public class GameResult {
    private final boolean victory;
    private final boolean paidMet;
    private final boolean revenueMet;
    private final boolean satisfactionMet;
    private final GameStats stats;
    private final GameConfig config;

    GameResult(boolean victory, boolean paidMet, boolean revenueMet, boolean satisfactionMet,
            GameStats stats, GameConfig config) {
        this.victory = victory;
        this.paidMet = paidMet;
        this.revenueMet = revenueMet;
        this.satisfactionMet = satisfactionMet;
        this.stats = stats;
        this.config = config;
    }

    public boolean isVictory() {
        return victory;
    }

    public boolean isPaidMet() {
        return paidMet;
    }

    public boolean isRevenueMet() {
        return revenueMet;
    }

    public boolean isSatisfactionMet() {
        return satisfactionMet;
    }

    public GameStats getStats() {
        return stats;
    }

    public GameConfig getConfig() {
        return config;
    }
}

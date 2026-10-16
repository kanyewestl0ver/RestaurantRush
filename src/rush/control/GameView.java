package rush.control;

import java.util.List;
import java.util.Optional;

/** Bridge between User Interface and Controller */
public interface GameView {
    void showTurnHeader(int turn, int maxTurns);

    //void showState(Restaurant r, GameStats stats);

    //WaiterTask chooseWaiterTask(List<WaiterTask> tasks);

    //Optional<Customer> chooseCustomer(String prompt, List<Customer> options);

    //Optional<Order> chooseOrder(String prompt, List<Order> options);

    //Optional<Order> chooseChefOrder(List<Order> options);

    void showMessage(String message);

    void showError(String reason);

    void showEndOfTurn(int turn, int maxTurns, GameStats stats);

    void showResult(GameResult result);
}

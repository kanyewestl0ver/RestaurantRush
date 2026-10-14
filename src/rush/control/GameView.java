package rush.control;

import java.util.List;

public interface GameView {
    //void showTurnHeader(GameState s);
    //WaiterAction chooseWaiterAction(List<WaiterAction> opts);
    //ChefAction chooseChefAction(List<Order> opts);
    //void showEndOfTurn(GameStats st);
    //void showResult(GameResult r);
    void showError(String reason);
}

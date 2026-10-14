package rush.ui;

import java.io.PrintStream;

import rush.control.GameView;

/** Console implementation of GameView}. */
public class ConsoleUI implements GameView {

    private static final String THICK = "=".repeat(60);
    private static final String THIN = "-".repeat(60);

    private final InputReader input;
    private final PrintStream out;

    public ConsoleUI(InputReader input, PrintStream out) {
        this.input = input;
        this.out = out;
    }

    @Override
    public void showError(String reason) {
        out.println("  ! " + reason);
    }
}

import java.util.Random;

/**
 * UC2 – Toss to Decide First Player and Symbol
 */
public class TicTacToe {

    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        tossAndAssignSymbols();
        displayTossResult();
    }

    // Toss logic
    public static void tossAndAssignSymbols() {
        Random rand = new Random();

        boolean humanStarts = rand.nextBoolean();

        if (humanStarts) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    // Display result
    public static void displayTossResult() {

        System.out.println("Toss Result:");

        if (isHumanTurn) {
            System.out.println("Human plays first");
        } else {
            System.out.println("Computer plays first");
        }

        System.out.println("Human Symbol: " + humanSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}
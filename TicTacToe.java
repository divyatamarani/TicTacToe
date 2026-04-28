import java.util.Random;

/**
 * UC7 – Computer Makes a Random Move
 */
public class TicTacToe {

    // Board
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {

        computerMove();
        printBoard();
    }

    // Computer random move
    public static void computerMove() {

        Random rand = new Random();

        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if valid
            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }
    }

    // Print board
    public static void printBoard() {
        System.out.println("Board after computer move:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
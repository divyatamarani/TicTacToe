/**
 * UC5 – Validate User Move
 */
public class TicTacToe {

    // Board initialization
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 1;
        int col = 1;

        boolean valid = isValidMove(row, col);

        System.out.println("Move valid: " + valid);
    }

    // Validate move
    public static boolean isValidMove(int row, int col) {

        // Check bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}
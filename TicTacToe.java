/**
 * UC6 – Place Move on Board
 */
public class TicTacToe {

    // Board
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        int row = 0;
        int col = 0;
        char symbol = 'X';

        placeMove(row, col, symbol);

        printBoard();
    }

    // Place move on board
    public static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Print board
    public static void printBoard() {
        System.out.println("Updated Board:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
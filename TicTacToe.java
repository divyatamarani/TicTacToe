import java.util.Scanner;

/**
 * UC3 – Accept User Slot Input (1–9)
 */
public class TicTacToe {

    public static void main(String[] args) {

        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    // Method to read user input
    public static int getUserSlot() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }
}
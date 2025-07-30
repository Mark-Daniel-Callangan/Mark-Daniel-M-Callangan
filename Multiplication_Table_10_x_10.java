public class Multiplication_Table_10_x_10 {

    public static void main(String[] args) {
        int size = 10;

        // Print header row
        System.out.print("    ");
        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------------");

        // Print table rows
        for (int i = 1; i <= size; i++) {
            System.out.printf("%2d |", i); // Row label
            for (int j = 1; j <= size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
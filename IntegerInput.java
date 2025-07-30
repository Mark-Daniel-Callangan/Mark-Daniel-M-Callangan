
    import java.util.Scanner;

public class IntegerInput  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {   // Loop for each row
            for (int j = 1; j <= i; j++) { // Print stars in each row
                System.out.print("*");
            }
            System.out.println();  // Move to next line after each row
        }
    }
}
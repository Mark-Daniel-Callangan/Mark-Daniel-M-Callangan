 
    import java.util.Scanner;

public class NumberToMonths{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for month number
        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();
        scanner.close();

        // Switch-case to determine days in the month
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                System.out.println("This month has 31 days.");
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                System.out.println("This month has 30 days.");
                break;

            case 2:  // February
                System.out.println("This month has 28 days.");
                break;

            default:
                System.out.println("Invalid month number. Please enter a number from 1 to 12.");
        }
    }
}

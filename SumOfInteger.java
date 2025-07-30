import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Enter integers to sum them. Enter 0 to stop.");
        
        while (true) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            
            if (num == 0) {  
                break;
            }
            
            sum += num;
        }
        
        scanner.close();
        
        System.out.println("Sum of all entered integers: " + sum);
    }
}
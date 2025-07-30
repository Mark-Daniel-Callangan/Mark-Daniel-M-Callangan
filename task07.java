import java.util.Scanner;

public class task07{

    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public double subtract(double num1, double num2) {
        return num1 - num2;
    }


    public double multiply(double num1, double num2) {
        return num1 * num2;
    }


    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task07 calculator = new task07 ();

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();


        System.out.println("Addition: " + calculator.add(number1, number2));
        System.out.println("Subtraction: " + calculator.subtract(number1, number2));
        System.out.println("Multiplication: " + calculator.multiply(number1, number2));
        System.out.println("Division: " + calculator.divide(number1, number2));

        scanner.close();
    }
}
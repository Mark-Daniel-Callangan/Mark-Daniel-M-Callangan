
 import static java.lang.Math.*;

public class task09 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));


        int num3 = 20;
        int num4 = 7;

        System.out.println("\nAddition (different values): " + add(num3, num4));
        System.out.println("Subtraction (different values): " + subtract(num3, num4));
        System.out.println("Multiplication (different values): " + multiply(num3, num4));
        System.out.println("Division (different values): " + divide(num3, num4));
    }
}
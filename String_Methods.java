    import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a Word: ");
        String input = scanner.nextLine();
        scanner.close();

       
        System.out.println("Length of the Word: " + input.length());

        
        System.out.println("Uppercase: " + input.toUpperCase());

        
        System.out.println("Lowercase: " + input.toLowerCase());

        
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
        } else {
            System.out.println("String is empty.");
        }

        
        if (input.length() > 0) {
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        
        if (input.length() >= 5) {
            System.out.println("Substring (2nd to 5th character): " + input.substring(1, 5));
        } else if (input.length() > 1) {
            System.out.println("Substring (2nd character to end): " + input.substring(1));
        } else {
            System.out.println("Not enough characters for substring.");
        }
    }
}
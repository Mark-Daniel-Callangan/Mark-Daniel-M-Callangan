 import java.util.Scanner;

 public class task04 {

 
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String");
        String inputString =  scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);
        String reverdString = stringBuilder.reverse().toString();

        if (inputString.equals(reverdString)) {
            System.out.println("The input String is palindrome");
        }else {
            System.out.println("the input String is not  a palindrome");
        }
         scanner.close();
        }
    }
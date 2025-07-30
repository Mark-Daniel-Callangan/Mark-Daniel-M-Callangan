
    import java.util.Scanner;

public class StringBuilder{
    public StringBuilder(String inputString) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        
        if (input.trim().isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }

    public Object reverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reverse'");
    }
}
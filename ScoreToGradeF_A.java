    import java.util.Scanner;

 public class ScoreToGradeF_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        scanner.close();

        
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        
        System.out.println("The grade is: " + grade);
    }
}
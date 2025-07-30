public class task08 {
    public static void calculateSums(int... numbers) {
        int totalSum = 0;
        System.out.println("Processing parameters:");
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            totalSum += currentNum;


            int cumulativeSum = 0;
            for (int j = 1; j <= currentNum; j++) {
                cumulativeSum += j;
            }
            System.out.println("Parameter " + (i + 1) + ": " + currentNum + ", Cumulative Sum up to " + currentNum + " = " + cumulativeSum);
        }
        System.out.println("Total Sum of all parameters: " + totalSum);
    }

    public static void main(String[] args) {

        calculateSums(4, 5, 10);
    }
}
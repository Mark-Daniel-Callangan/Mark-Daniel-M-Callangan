public class MyDate {
    public static void main(String[] args) {
        DateTask date1 = new DateTask(1, 1, 1978);       // January 1st, 1978
        DateTask date2 = new DateTask(21, 9, 1984);      // September 21st, 1984

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        if (date2.isLeapYear()) {
            System.out.println(date2.getYear() + " is a leap year.");
        } else {
            System.out.println(date2.getYear() + " is not a leap year.");
        }
    }
}

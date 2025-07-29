public class DateTask {
    
    private int day;
    private int month;
    private int year;

    
    public DateTask() {
        this(1, 1, 1);
    }

    
    public DateTask(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    
    public int setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
            return day;
        } else {
            this.day = 0;
            return 0;
        }
    }

    public int setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
            return month;
        } else {
            this.month = 0;
            return 0;
        }
    }

    public int setYear(int year) {
        if (year > 0) {
            this.year = year;
            return year;
        } else {
            this.year = 0;
            return 0;
        }
    }

    
    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
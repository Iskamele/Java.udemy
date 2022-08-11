package aegis.java.basic.section04_conditional.practice;

import java.util.Scanner;

public class UniversalWeekDayVar1 {
    public static void main(String[] args) {
        // 1
        System.out.println("Enter day number from 1 to 7: ");
        var day = new Scanner(System.in).nextInt();
        boolean isMondayFirst = false;

        // processing
        String result;
        if (day == 1 && isMondayFirst) {
            result = "Monday";
        } else if (day == 1) {
            result = "Sunday";
        } else if (day == 2 && isMondayFirst) {
            result = "Tuesday";
        } else if (day == 2) {
            result = "Monday";
        } else if (day == 3 && isMondayFirst) {
            result = "Wednesday";
        } else if (day == 3) {
            result = "Tuesday";
        } else if (day == 4 && isMondayFirst) {
            result = "Thursday";
        } else if (day == 4) {
            result = "Wednesday";
        } else if (day == 5 && isMondayFirst) {
            result = "Friday";
        } else if (day == 5) {
            result = "Thursday";
        } else if (day == 6 && isMondayFirst) {
            result = "Saturday";
        } else if (day == 6) {
            result = "Friday";
        } else if (day == 7 && isMondayFirst) {
            result = "Sunday";
        } else if (day == 7) {
            result = "Saturday";
        } else {
            result = "Invalid day: " + day;
        }

        // display results
        System.out.println(result);


    }
}

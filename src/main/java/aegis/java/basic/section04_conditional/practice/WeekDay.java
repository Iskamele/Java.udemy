package aegis.java.basic.section04_conditional.practice;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        while (true) {
            // read source data
            System.out.println("Enter day number from 1 to 7: ");
            var a = new Scanner(System.in).nextInt();

            // processing
            if (a == 1) {
                var result = "Monday";
                System.out.println("Monday");
            } else if (a == 2) {
                var result = "Tuesday";
                System.out.println("Tuesday");
            } else if (a == 3) {
                var result = "Wednesday";
                System.out.println("Wednesday");
            } else if (a == 4) {
                var result = "Thursday";
                System.out.println("Thursday");
            } else if (a == 5) {
                var result = "Friday";
                System.out.println("Friday");
            } else if (a == 6) {
                var result = "Saturday";
                System.out.println("Saturday");
            } else if (a == 7) {
                var result = "Sunday";
                System.out.println("Sunday");
            } else {
                System.out.println("Please, enter number from 1 to 7: ");
            }

            // display results
        }
    }
}

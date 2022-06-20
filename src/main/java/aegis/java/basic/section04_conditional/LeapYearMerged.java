package aegis.java.basic.section04_conditional;

import java.util.Scanner;

public class LeapYearMerged {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter year number: ");
            var year = new Scanner(System.in).nextInt();

            boolean isLeap;
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }

            System.out.println(isLeap ? year + " is leap year" : year + " is not leap year");
        }
    }
}
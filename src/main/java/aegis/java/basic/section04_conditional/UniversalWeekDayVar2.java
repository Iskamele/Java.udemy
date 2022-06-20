package aegis.java.basic.section04_conditional;

import java.util.Scanner;

public class UniversalWeekDayVar2 {
    public static void main(String[] args) {
        // read source data
        System.out.println("Enter y/n if Monday is the first day of the week: ");
        char week = new Scanner(System.in).nextLine().charAt(0);

        // processing
        boolean weekcheck;
        String error;
        if (week == 'y') {
            weekcheck = true;
            //System.out.println(result);
        } else if (week == 'n') {
            weekcheck = false;
            //System.out.println(result);
        } else {
            error = "Invalid symbol: " + week;
            System.out.println(error);
        }
    }
}
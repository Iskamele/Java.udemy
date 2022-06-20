package aegis.java.basic.section04_conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter year number: ");
            var year = new Scanner(System.in).nextInt();

            var yearleap = 400;
            var noleap = 100;
            var yearleaptwo = 4;

            String result;
            if (year % yearleap == 0) {
                result = "Leap year";
            } else if ((year % yearleap) % noleap == 0) {
                result = "Common year";
            } else if ((year % yearleap % yearleaptwo) == 0) {
                result = "Leap year";
            } else {
                result = "Common year";
            }

            System.out.println(result);
        }
    }
}

package aegis.java.basic.section05_cycles.practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
        {
            System.out.println("Enter number: ");
            var n = new Scanner(System.in).nextInt();
            var result = 1;

            for (int i = 1; i <= n; i++) {
                result *= i;

            }
            System.out.println(result);
        }
                 */


        System.out.println("Enter number: ");
        var n = new Scanner(System.in).nextInt();
        int result = 1, i = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        if (result > 1) {
            System.out.println("Factorial of " + n + " is: " + result);
        } else if (n == 0) {
            System.out.println("Factorial of 0 is: 1");
        } else if (n < 0) {
            System.out.println("Value should be >=0");
        } else if (result > (Integer.MAX_VALUE+1)) {
            System.out.println("Int overflow");
        }
    }
}
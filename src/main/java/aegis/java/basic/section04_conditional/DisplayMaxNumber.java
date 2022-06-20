package aegis.java.basic.section04_conditional;

import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args) {
        {
            System.out.println("Enter first number: ");
            var first = new Scanner(System.in).nextInt();
            System.out.println("Enter second number: ");
            var second = new Scanner(System.in).nextInt();

            int result;
            if (first > second) {
                result = first;
                System.out.println(result);
            } else if (first < second) {
                result = second;
                System.out.println(result);
            } else {
                System.out.println(first + " == " + second);

            }

        }
    }
}

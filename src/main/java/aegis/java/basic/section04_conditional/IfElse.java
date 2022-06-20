package aegis.java.basic.section04_conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        while (true) {
            var a = new Scanner(System.in).nextInt();
            var b = new Scanner(System.in).nextInt();

            if (a > b) {
                var result = "a > b";
                System.out.println(result);
            }
            // Для двух вариантов ответа
            if (a > b) {
                System.out.println("a > b");
            } else {
                System.out.println("a <=b ");
            }
            //
            if (a > b) {
                System.out.println("a > b");
            } else {
                if (a < b) {
                    System.out.println("a < b");
                } else {
                    System.out.println("a = b");
                }
            }
            System.out.println("after");
            //
            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
            //
            boolean condition = a < b;
            if (condition) {
                System.out.println("condition=true");
            }
            //
            if (condition || a < b && a > 1 || !(b < 7)) {
                System.out.println("Complex condition example");
            }
        }
    }
}
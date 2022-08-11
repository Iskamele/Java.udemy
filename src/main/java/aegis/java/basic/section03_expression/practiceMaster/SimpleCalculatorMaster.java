package aegis.java.basic.section03_expression.practiceMaster;

import java.util.Scanner;

public class SimpleCalculatorMaster {
    public static void main(String[] args) {
        System.out.println("Enter 'a'");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Enter 'b'");
        int b = new Scanner(System.in).nextInt();

        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);

    }
}
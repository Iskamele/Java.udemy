package aegis.java.basic.section05_cycles.theory;

import java.util.Random;
import java.util.Scanner;

public class Aselftask1 {
    public static void main(String[] args) {
        int a = new Random().nextInt(9);
        int b = new Random().nextInt(9);

        boolean guessed = false;
        System.out.print("Enter answer for " + a + " * " + b + " = ");
        for (int i = 1; i <= 3; i++) {
            int userCase = new Scanner(System.in).nextInt();
            if (userCase != (a * b)) {
                System.out.print("No, try again. " + a + " * " + b + " = ");
            } else {
                guessed = true;
                System.out.println("Congratulations! Answer for " + a + " * " + b + " = " + (a * b));
                break;
            }
        }
        if (!guessed) {
                        System.out.println("\n" + "Limit reached");
        }
    }
}




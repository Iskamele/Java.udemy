package aegis.java.basic.section05_cycles.practiceMaster;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberMaster {
    public static void main(String[] args) {
        var number = new Random().nextInt(1000000);

        while (true) {
    var userCase = new Scanner(System.in).nextInt();
    if (number > userCase) {
        System.out.println("Number > " +userCase + ". Try again: ");
    } else if (number < userCase) {
        System.out.println("Number < " +userCase + ". Try again: ");
    } else {
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }
}

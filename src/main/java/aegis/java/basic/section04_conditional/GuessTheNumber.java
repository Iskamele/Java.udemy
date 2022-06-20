package aegis.java.basic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        System.out.println("Enter any number from 0 to 9: ");
        var random = new Scanner(System.in).nextInt();

        String result;
        if (random == number) {
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(result);
    }
}

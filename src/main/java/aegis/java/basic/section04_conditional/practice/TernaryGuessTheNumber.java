package aegis.java.basic.section04_conditional.practice;

import java.util.Random;
import java.util.Scanner;

public class TernaryGuessTheNumber {
    public static void main(String[] args) {
        var number = new Random().nextInt (10);
        var userCase = new Scanner(System.in).nextInt();

        System.out.println(number == userCase ? "Congratulations, you guessed the number!" : "Sorry, but your number is invalid! Try again later...");
    }
}
package aegis.java.basic.section05_cycles.practice;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(10);
        System.out.println("Enter any number from 0 to 9: ");


        while (true) {
            int userCase = new Scanner(System.in).nextInt();
            String result;
            if (number == userCase) {
                result = "Congratulations, you guessed the number!";
            } else if (number < userCase) {
                result = "Number < " + number + ". Try again:";
            } else if (number > userCase) {
                result = "Number > " + number + ". Try again:";
            } else {
                result = "Sorry, but your number is invalid! Try again later...";
                break;
            }
            System.out.println(result);
        }
    }
}

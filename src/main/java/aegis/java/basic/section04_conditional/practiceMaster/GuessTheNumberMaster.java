package aegis.java.basic.section04_conditional.practiceMaster;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberMaster {
    public static void main(String[] args) {
        var number = new Random().nextInt (10);
        var userCase = new Scanner(System.in).nextInt();

        String result;
        if(number == userCase) {
            result ="Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }
        System.out.println(result);
    }
}

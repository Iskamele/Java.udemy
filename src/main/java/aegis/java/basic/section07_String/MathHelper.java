package aegis.java.basic.section07_String;

import java.util.Objects;
import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        System.out.println("Enter cmd: {pi, e, exit or quit}");
        while (true) {
            String answer = "Invalid cmd. Try again!";
            String cmd = new Scanner(System.in).nextLine();
            if (cmd.equals("quit") || cmd.equals("exit")) {
                break;
            } else if (cmd.equals("pi")) {
                answer = "PI = " + Math.PI;
            } else if (cmd.equals("e")) {
                answer = "e = " + Math.E;
            }
            System.out.println(answer);
        }
    }
}


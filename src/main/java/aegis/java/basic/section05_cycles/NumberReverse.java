package aegis.java.basic.section05_cycles;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        String str = new Scanner(System.in).nextLine();

        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
            }

    }
}

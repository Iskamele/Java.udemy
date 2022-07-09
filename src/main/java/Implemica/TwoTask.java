package Implemica;

import java.util.Scanner;

public class TwoTask {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int entrance = 1;
        int level = 1;

        while (true){
            n -= 4;
            if (n > 0){
                level++;
            if (level > 9) {
                entrance++;
                level = 1;
            }}
            if (n < 0) {
                break;
            }
        }
        System.out.println("Подъезд = " + entrance);
        System.out.println("Этаж = " + level);
    }
}


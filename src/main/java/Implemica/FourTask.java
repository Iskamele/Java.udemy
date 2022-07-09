package Implemica;

import java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {
        int luke = new Scanner(System.in).nextInt();
        int n0 = 2;
        int n1 = 1;
        int answer = 0;

        for (int i = 2; i <= luke; i++) {
            answer = n0+ n1;
            n0 = n1;
            n1 = answer;
        }
        System.out.println(luke == 0 ? 1 : answer);



    }
}

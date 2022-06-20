package aegis.java.basic.section02_structure;

import java.util.Scanner;

public class HelloUserMaster {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        var name = new Scanner(System.in).nextLine();

        var result = "Hello, " + name;

        System.out.println(result);
    }
}

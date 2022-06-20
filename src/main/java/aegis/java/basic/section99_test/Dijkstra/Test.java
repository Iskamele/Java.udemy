package aegis.java.basic.section99_test.Dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
while (true) {
    System.out.println(Arrays.toString(connection_cost()));
}
    }

    public static int[] connection_cost() {
        System.out.println("Индекс города и стоимость: ");
        String userEnter = new Scanner(System.in).nextLine();

        //if (userEnter.matches("\\d")) {
        while (!userEnter.matches("(^[1-9])(\\d+)?(\\s)([1-9])(\\d+)?")) {
            System.out.println("Ошибочка, го ещё: ");
            userEnter = new Scanner(System.in).nextLine();
        }

        String[] words = userEnter.split(" "); // сплит - разбиение массива на части
        int[] values = {Integer.parseInt(words[0]), Integer.parseInt(words[1])};

        return values;
    }
}
package aegis.java.basic.section02_structure;

import java.util.Scanner;

public class SctructureOfAnyStudyConsoleProgram {
    public static void main(String[] args) {

        /* 20. Для ускоренной работы, например, поиска ошибки в обработке данных,
        рекомендуется заменять значения из консоли на константы, а оставшийся код комментить */

        var a = 8;//new Scanner(System.in).nextInt();
        var b = 9;//new Scanner(System.in).nextInt();

        var result = a + b * ((5 - 7) * a);

        System.out.println(result);
    }
}

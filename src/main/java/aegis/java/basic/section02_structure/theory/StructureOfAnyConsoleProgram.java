package aegis.java.basic.section02_structure.theory;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {

        // read source data - чтение исходных данных
        System.out.println("Please enter the number:");
        var n = new Scanner(System.in).nextInt();

        // processing - обработка этих исходных данных, чтобы получить результат
        var result = n + 1;

        // display results - отображение результата
        System.out.println(result);
    }
}

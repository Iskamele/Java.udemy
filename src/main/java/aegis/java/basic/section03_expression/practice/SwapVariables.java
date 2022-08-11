package aegis.java.basic.section03_expression.practice;

public class SwapVariables {
    public static void main(String[] args) {
        // НЕПРАВИЛЬНЫЙ ВАРИАНТ
        // считывание исходных данных
        var a = 1;
        var b = 3;
        System.out.println("a = " + a + "; b = " + b);

        // обработка
        a = b;
        b = a;
        // отображение результата
        System.out.println("Swap: a = " + a + "; b = " + b);

    }
}

package aegis.java.basic.section03_expression.theory;

public class OperatorPrecedence {
    public static void main(String[] args) {
        var a = 4;
        var b = 2 + -4 * 5 - a++ / 4 + --a;

        // Восстановление переменной a
        a = 4;
        var c = 2 + ((-4) * 5) - ((a++) / 4) + (--a);

        System.out.println(b);
        System.out.println(c);

        System.out.println("Hello " + 1 + 1);
        System.out.println("Hello " + (1 + 1));
        System.out.println((1 + 1) + " Hello");
    }
}

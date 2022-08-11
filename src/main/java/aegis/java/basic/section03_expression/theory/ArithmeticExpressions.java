package aegis.java.basic.section03_expression.theory;

public class ArithmeticExpressions {
    public static void main(String[] args) {
        {
            var a = 5;
            var b = 3;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b); // Целочисленное деление, остаток откидывается
            System.out.println(a % b); // Возвращает остаток от деления
        }
        {
            var a = 5.;
            var b = 3.;

            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b); // Целочисленное деление, остаток откидывается
            System.out.println(a % b); // Возвращает остаток от деления
        }
    }
}

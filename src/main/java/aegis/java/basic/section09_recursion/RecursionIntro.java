package aegis.java.basic.section09_recursion;

public class RecursionIntro {
    public static void main(String[] args) {
        function1(); // вход в рекурсию
    }

    private static void function1() {
        function2(); // простая рекурсия, когда функция вызывает саму себя явным образом
    }

    private static void function2() {
        function3();
    }

    private static void function3() {
        function1(); // сложная рекурсия, не явным образом
    }
}
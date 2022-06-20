package aegis.java.basic.section03_expression;

public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);
        // Записать в переменную новое значение - переменная (a) = оператор присваивания (= 5)
        a = 5;
        System.out.println(a);
        // Присваивание с обновлением
        a = a + 1;
        System.out.println(a);
        // Присваивание с обновлением можно записать в более сокращённой версии
        a += 1;
        System.out.println(a);
        // Сокращённую версию можно ещё сократить, инкремент
        a++;
        System.out.println(a);
        // Дикремент
        a--;
        System.out.println(a);

        a *= 2;
        System.out.println(a);
        a = a * 2;
        System.out.println(a);

        a /= 3;
        System.out.println(a);
        a = a / 3;
        System.out.println(a);

    }
}

package aegis.java.basic.section03_expression;

public class TypeCast {
    public static void main(String[] args) {
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        System.out.println("Hello " + 1 + 1.1 + true + 'a'); //Левый оперант обязательно должен быть строковым

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sb = Boolean.parseBoolean("true");
        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(2); //На выходе получим букву B

        // Количество байт, которые выделяются для данных типов:
        char ch = 2; // 2 байт
        int i = 4; // 4 байта
        double d = 8; // 8 байт

        // Можно преобразовывать переменные из одного типа в другой
        // Если размерность байта не увеличивается, то всё просто:
        d = i;
        d = ch;

        // В обратную сторону нельзя преобразовывать, нужно явное преобразование,
        // но значение будет обрезано, и результат будет другим
        // Это примитивы
        i = (int) d;
        ch = (char) d;
        ch = (char) i;

        boolean b = true;

    }
}

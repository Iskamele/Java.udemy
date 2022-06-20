package aegis.java.basic.section07_String;

public class ReverseStringBuilderMaster {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringBuilder builder = new StringBuilder();
        {
            // Самый эффективный способ, на собесе пригодится
            for (int i = str.length() - 1; i >= 0; i--) {
                builder.append(str.charAt(i));
            }
            System.out.println(builder.toString());
            builder.delete(0, builder.length());
        }
        {
            // Неэффективный вариант, метод insert вынужден постоянно сдвигать символы вправо
            for (int i = 0; i < str.length(); i++) {
                builder.insert(0, str.charAt(i));
            }
            System.out.println(builder.toString());
            builder.delete(0, builder.length());
        }
        {
            // Неэффективный вариант, метод append копирует всё посимвольно, как первый цикл,
            // и только после этого вызывается метод reverse, который переворачивает строку. + в читаемости
            builder.append(str).reverse();
            System.out.println(builder.toString());
        }
    }
}
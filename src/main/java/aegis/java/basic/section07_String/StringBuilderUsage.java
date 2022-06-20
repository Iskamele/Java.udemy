package aegis.java.basic.section07_String;

public class StringBuilderUsage {
    public static void main(String[] args) {
        // String s = "hello";

        StringBuilder builder = new StringBuilder();
        builder.append("World!");
        builder.insert(0, "Hello");
        builder.insert(5, ' ');

        String result = builder.toString();
        System.out.println(result);

        builder.deleteCharAt(0); // Удаляем первый символ символ

        System.out.println(builder.toString()); // На базе этой строки генерируем новую и сразу же выводим её

        builder.setLength(0); // Обнуляем билдер, либо delete:
        builder.delete(0, builder.length()); // Удаляем всё. Результат идентичный

        System.out.println(builder.toString());
        System.out.println("qwerty");
    }
}

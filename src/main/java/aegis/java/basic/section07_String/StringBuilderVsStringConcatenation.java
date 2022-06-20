package aegis.java.basic.section07_String;

public class StringBuilderVsStringConcatenation {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";

        String res1 = s1 + s2 + s3; // В этом случае компилятор автоматически использует StringBuilder. Поэтому IDEA для конкатенации строк рекомендует использовать этот вариант, т.к. он читабельный
        String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString(); // Но в циклах обязательно должен использоваться только StringBuilder

        System.out.println(res1);
        System.out.println(res2);
    }
}
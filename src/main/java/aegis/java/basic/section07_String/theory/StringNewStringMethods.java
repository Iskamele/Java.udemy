package aegis.java.basic.section07_String.theory;

import java.util.Arrays;
import java.util.Locale;

public class StringNewStringMethods {
    public static void main(String[] args) {
        String s = " Hello world! ";
        String s2 = "HeLlO";

        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s2.toLowerCase() = " + s.toLowerCase());

        System.out.println("s.repeat(2) = " + s.repeat(2));

        System.out.println("s.replace('l', 'j') = " + s.replace('l', 'j'));
        System.out.println("s.replace(\"hello\", \"bye\") = " + s.replace("Hello", "Bye"));

        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 6));

        System.out.println(Arrays.toString(s.split((" "))));

        System.out.println(s.trim());
        System.out.println(s.strip());
    }
}

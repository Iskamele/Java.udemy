package aegis.java.basic.section07_String.theory;

public class ReverseStringBadExample {
    public static void main(String[] args) {
        String s = "Hello World!";

        String res = "";

        for (int i = s.length()-1; i >= 0 ; i--) {
            res = res + s.charAt(i);
        }
        System.out.println(res);
    }
}

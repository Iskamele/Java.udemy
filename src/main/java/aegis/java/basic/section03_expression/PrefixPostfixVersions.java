package aegis.java.basic.section03_expression;

public class PrefixPostfixVersions {
    public static void main(String[] args) {
        var a = 0;
        ++a;
        a++;
        System.out.println(a);

        var b = a++;
        /* Это индентично этой записи
        var b = a;
        a = a + 1;
        */
        System.out.println(b);
         System.out.println(a);
        var c = ++a;
        /*
        a = a + 1;
        var c = a;
        */
        System.out.println(c);
        System.out.println(a);
    }
}

package aegis.java.basic.section03_expression.theory;

public class LogicExpressions {
    public static void main(String[] args) {
        var a = true;
        var b = false;
        var c = 2 > 1;
        var d = 2 == 1;

        System.out.println(!a);
        System.out.println(!b);

        System.out.println(a && b);
        System.out.println(a || b);
        //-------------------------------------------------------
        {
            System.out.println("----------------- && -----------------");
            System.out.println("true \t && \t true \t = \t" + (true && true));
            System.out.println("true \t && \t false \t = \t" + (true && true));
            System.out.println("false \t && \t true \t = \t" + (true && true));
            System.out.println("false \t && \t false \t = \t" + (true && true));
        }
        {
            System.out.println("----------------- || -----------------");
            System.out.println("true \t || \t true \t = \t" + (true || true));
            System.out.println("true \t || \t false \t = \t" + (true || true));
            System.out.println("false \t || \t true \t = \t" + (true || true));
            System.out.println("false \t || \t false \t = \t" + (true || true));
        }
    }
}

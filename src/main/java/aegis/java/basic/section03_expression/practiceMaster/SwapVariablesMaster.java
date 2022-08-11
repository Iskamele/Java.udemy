package aegis.java.basic.section03_expression.practiceMaster;

public class SwapVariablesMaster {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        // Нужно сохранять одну из переменных в промежуточную перед тем, как свайпать её с другой
        var temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b= " + b);
    }
}

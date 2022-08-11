package aegis.java.basic.section04_conditional.theory;

public class TernaryOperator {
    public static void main(String[] args) {
        var a = 5;

        if (a == 5) {
            System.out.println("a == 5");
        } else {
            System.out.println("a != 5");
        }

        System.out.println(a == 5 ? "a == 5" : "a != 5");
    }
}

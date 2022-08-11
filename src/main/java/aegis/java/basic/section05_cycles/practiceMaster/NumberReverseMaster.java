package aegis.java.basic.section05_cycles.practiceMaster;

public class NumberReverseMaster {
    public static void main(String[] args) {
        var number = 123456789;

        var result = 0;
        var temp = number;

        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10; // temp = temp / 10;
        }
        System.out.println("Reverse number: " + result);
    }
}

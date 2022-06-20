package aegis.java.basic.section08_functions;

public class ReturnExample {
    public static void main(String[] args) {
        System.out.println(factorial(-1));
        System.out.println(factorial(5));
        System.out.println(factorial(1000));
    }

    private static String factorial(int value) {
        if (value < 0) {
            return "Value should be >=0";
        } else {
            var result = 1;
            for (int i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i; // result
                if (oldResult != result / i) {
                    return "Int overflow";
                }
            }
            return String.valueOf(result);
        }
    }
}

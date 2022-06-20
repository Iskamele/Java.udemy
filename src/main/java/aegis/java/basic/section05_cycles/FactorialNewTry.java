package aegis.java.basic.section05_cycles;

public class FactorialNewTry {
    public static void main(String[] args) {
        /*
        int value = 5;
        int sum = 1;
        int oldsum = 1;
        String finalResult;

        for (int i = 1; i <= value; i++) {
            oldsum = sum;
            sum *= i;
            if (sum != oldsum) {
                finalResult = "Int overflow";
                break;
            }else
                System.out.println(sum < 0 ? "Value should be >=0" : sum);
            }
        }
         */

        int value = 5;
        int result = 1;
        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >=0";
        } else {
            for (int i = 1; i <= value; i++) {
                int oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
                finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
            }
            System.out.println(result);
        }
    }
}
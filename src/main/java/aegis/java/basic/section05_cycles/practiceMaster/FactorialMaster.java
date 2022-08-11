package aegis.java.basic.section05_cycles.practiceMaster;

public class FactorialMaster {
    public static void main(String[] args) {
        // Read source data
        var value = 9;

        // Processing
        String finalResult;
        if (value < 0) {
            finalResult = "Value should be >=0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }

        // Display results
        System.out.println(finalResult);
    }
}

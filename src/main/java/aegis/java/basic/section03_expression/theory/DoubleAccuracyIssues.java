package aegis.java.basic.section03_expression.theory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        {
            var a = 2;
            var b = 1.1;
            var c = a - b;
            System.out.println(c);
        }
        {
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b);
            System.out.println(c);
        }
        {
            System.out.println(22./7.);
            // .setScale(20) - указываем, сколько нам нужно символов, после запятой
            // .divide - делим
            System.out.println(new BigDecimal("22").setScale(20).divide(new BigDecimal("7"), RoundingMode.HALF_UP));
        }
    }
}

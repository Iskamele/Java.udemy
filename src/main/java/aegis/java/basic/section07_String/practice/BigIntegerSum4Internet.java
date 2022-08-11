package aegis.java.basic.section07_String.practice;

import java.math.BigInteger;

public class BigIntegerSum4Internet {
    public static void main(String[] args) {
        //String input1 = "123456789012345678901234567890123456789012345678901234567890";
        //String input2 = "12345678901234567890123456789012345678901234567890";

        String input1 = "1";
        String input2 = "999999999999999999999999999999999999999999999999999999999999";

        //String input1 = "123456789012345678901234567890123456789012345678901234567890";
        //String input2 = "12345678901234567890123456789012345678901234567890";

        BigInteger sum;

        BigInteger a  = new BigInteger(input1);
        BigInteger b  = new BigInteger(input2);

        sum = a.add(b);

        System.out.println(sum);
    }
}

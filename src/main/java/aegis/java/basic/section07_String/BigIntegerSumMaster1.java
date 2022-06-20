package aegis.java.basic.section07_String;

import aegis.java.basic.section02_structure.In;

public class BigIntegerSumMaster1 {
    public static void main(String[] args) {
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        var a1 = a.length() > b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var b1 = b.length() > a.length() ? b : "0".repeat(a.length() - b.length()) + b;

        StringBuilder res = new StringBuilder();
        int prevDegit = 0;
        for (int i = a1.length()-1; i >=0 ; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int sum = digit1+digit2 + prevDegit;
            if (sum >9) {
                prevDegit = 1;
                sum = sum%10;
            } else {
                prevDegit=0;
            }
            res.insert(0, sum);
        } if (prevDegit != 0){
            res.insert(0, prevDegit);
        }
        System.out.println(res.toString());
    }
}

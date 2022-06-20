package aegis.java.basic.section07_String;

public class BigIntegerSum3 {
    public static void main(String[] args) {
        //String a = "123456789012345678901234567890123456789012345678901234567890";
        //String b = "12345678901234567890123456789012345678901234567890";

        String a = "1";
        String b = "999999999999999999999999999999999999999999999999999999999999";

        //String a = "123456789012345678901234567890123456789012345678901234567890";
        //String b = "12345678901234567890123456789012345678901234567890";

        int bigInt = 0;
        int smallInt = 0;
        int result;

        String bigStr = "";
        String smallStr = "";

        boolean check = false;

        StringBuilder big = new StringBuilder(a);
        StringBuilder small = new StringBuilder(b);
        StringBuilder answer = new StringBuilder();

        if (big.length() < small.length()) {
            big = new StringBuilder(b);
            small = new StringBuilder(a);
        }
        for (int i = big.length() - 1; i >= 0; i--) {
            bigStr = String.valueOf(big.charAt(i));

            if (!check) {
                bigInt = Integer.parseInt(bigStr);
            } else if (bigInt == 9) {
                bigInt = Integer.parseInt(bigStr);
                answer.insert(0, (bigInt + 1) % 10);
                big.setLength(big.length() - 1);

                if (big.length() <= 1) {
                    answer.insert(0, 1);
                }
            } else {
                bigInt = Integer.parseInt(bigStr) + 1;
            }


            for (int j = small.length() - 1; j >= 0; j--) {
                smallStr = String.valueOf(small.charAt(j));
                smallInt = Integer.parseInt(smallStr);
                small.setLength(small.length() - 1);

                result = bigInt + smallInt;
                if (result >= 10 && result != 0) {
                    answer.insert(0, result % 10);
                    check = true;
                } else if (result < 10 && result != 0) {
                    answer.insert(0, result);
                    check = false;
                } else if (small.length() >= 1) {
                    answer.insert(0, 0);
                    check = false;
                } else {
                    answer.insert(0, bigInt);
                    check = false;
                }
                break;
            }
        }
        System.out.println(answer.toString());
        System.out.println(answer.toString().equals("123456789024691357802469135780246913578024691357802469135780"));
        System.out.println(answer.toString().equals("1000000000000000000000000000000000000000000000000000000000000"));
        System.out.println(answer.toString().equals("10987654322098765432209876543220987654322098765432"));
    }
}
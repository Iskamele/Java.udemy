package aegis.java.basic.section07_String.practice;

public class BigIntegerSum2 {
    public static void main(String[] args) {
        String a = "123456789012345678901234567890123456789012345678901234567890";
        String b = "12345678901234567890123456789012345678901234567890";

        // StringBuilder builderA = new StringBuilder(a);
        StringBuilder builderB = new StringBuilder(b);
        StringBuilder builderR = new StringBuilder();

        int max = a.length();
        int maxB = builderB.length();

        if (max < maxB) {
            max = maxB;
        }
        int intA = 0;
        int intB;
        int result;

        String test;
        String test2;

        boolean check = false;

        for (int i = a.length() - 1; i >= 0; i--) {
            test = String.valueOf(a.charAt(i));
            if (check) {
                intA = Integer.parseInt(test) + 1;
            } else {
                intA = Integer.parseInt(test);
            }
            if (builderB.length() >= 1) {
                for (int j = builderB.length() - 1; j >= 0; j--) {
                    test2 = String.valueOf(builderB.charAt(j));
                    intB = Integer.parseInt(test2);
                    builderB.setLength(builderB.length() - 1);
                    //builderB.delete(0, builderB.length() - 1);

                    result = intA + intB;
                        if (result >= 10 && result != 0) {
                            builderR.insert(0, (result % 10));
                            intA = result / 10;
                            check = true;
                            break;
                        }
                        if (result < 10 && result != 0) {
                            builderR.insert(0, result);
                            intA = 0;
                            check = false;
                            break;
                        } else {
                            builderR.insert(0, 0);
                            check = false;
                            intA = 0;
                            break;
                        }

                }
            } else {
                builderR.insert(0, intA);
            }
        }
        System.out.println(builderR.toString());
        System.out.println(builderR.toString().equals("123456789024691357802469135780246913578024691357802469135780"));
    }
}
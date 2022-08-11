package aegis.java.basic.section06_array.practice;


import java.util.ArrayList;

public class ArrayElementStatistic {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};


        var tempNumber = 0;
        var tempCount = 0.;

        String resultTemp;
        String result = "Stats: " + "\n";
        for (int i = 0; i < array.length; i++) {
            if (tempNumber != array[i]) {
                tempNumber = array[i];
                tempCount = 0.;
                for (int j = 0; j < array.length; j++) {
                    if (tempNumber == array[j]) {
                        tempCount += 1.;
                        }
                    }
                resultTemp = String.valueOf(tempNumber) + " = " + String.valueOf(tempCount / array.length * 100) + "%" + "\n";
                result += resultTemp;
            }
        }
                System.out.println(result);
    }
}
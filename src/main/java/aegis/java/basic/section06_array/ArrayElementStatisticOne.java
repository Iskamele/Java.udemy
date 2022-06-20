package aegis.java.basic.section06_array;

public class ArrayElementStatisticOne {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};

        var resultTwo = 0.;
        var resultThree = 0.;
        var resultFour = 0.;
        var resultFive = 0.;

        for (int i : array) {
            if (i == 2) {
                resultTwo += 1.;
            }
            if (i == 3) {
                resultThree += 1.;
            }
            if (i == 4) {
                resultFour += 1.;
            }
            if (i == 5) {
                resultFive += 1.;
            }
        }
        resultTwo = resultTwo / array.length * 100;
        resultThree = resultThree / array.length * 100;
        resultFour = resultFour / array.length * 100;
        resultFive = resultFive / array.length * 100;

        System.out.println("2: " + resultTwo + "% \n" + "3: " + resultThree + "% \n" + "4: " + resultFour + "% \n" + "5: " + resultFive + "%");
    }
}
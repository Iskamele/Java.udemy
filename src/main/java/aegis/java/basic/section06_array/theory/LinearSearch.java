package aegis.java.basic.section06_array.theory;

public class LinearSearch {
    public static void main(String[] args) {
        /*
        Задача: пройти по массиву и вывести в консоль индекс искомого числа. Если этого числа нет в массиве, то выводить в консоль -1
         */

        // read source data
        //             0  1   2  3  4  5   6   7   8   9
        int[] array = {5, 10, 7, 5, 9, 15, 16, 12, 11, 99};
        var query = 99;

        //processing
        var index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                index = i;
                break;
            }
        }
        // display results
        System.out.println(index);
    }
}

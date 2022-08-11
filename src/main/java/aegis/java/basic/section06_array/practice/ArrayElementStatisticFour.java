package aegis.java.basic.section06_array.practice;

public class ArrayElementStatisticFour {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];

        int count = 0;
        boolean check = true;

        for (int i = 0; i < array.length; i++) {
            for (int u : unique) {
                if (u == array[i]) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }

            for (int j : array) {
                if (!check && array[i] == j) {
                    count++;
                }
            }
            unique[i] = array[i]; // Добавляем элемент в массив
            counts[i] = count; // Добавляем счётчик в массив counts
            count = 0;
            System.out.print(counts[i] == 0 ? "" : unique[i] + " = " + ((double) counts[i] * 100 / array.length) + "%" + "\n");
        }
    }
}
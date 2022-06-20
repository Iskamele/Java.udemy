package aegis.java.basic.section06_array;

public class ArrayElementStatisticThree {
    public static void main(String[] args) {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];

        int count = 0;

        for (int i = 0; i < array.length; i++) { // Проходим по исходному массиву
            // for (int u = 0; u < unique.length; u++) { // Проверяем наличие [i] элемента в массиве unique
            for (int u : unique) {
                if (unique[u] == array[i]) {
                    break;
                } else {
                    for (int k : array) { // Если нет, считаем количество вхождений элемента в массив
                        if (k == array[i]) {
                            count++;
                        }
                    }
                }
                unique[i] = array[i]; // Добавляем элемент в массив
                counts[i] = count; // Добавляем счётчик в массив counts
                count = 0; // Обнуляем счётчик
                break;
            }
            System.out.print(unique[i] + " = " + ((double) counts[i] * 100 / array.length) + "%" + "\n");
        }
    }
}
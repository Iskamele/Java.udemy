package aegis.java.basic.section07_String;

import java.math.BigInteger;

public class BigIntegerSum {
    public static void main(String[] args) {
String a = "123456789012345678901234567890123456789012345678901234567890";
String b = "12345678901234567890123456789012345678901234567890";

        // 123456 789012345 678901234 567890123 456789012 345678901 234567890
        //            12345 678901234 567890123 456789012 345678901 234567890
        // 1023580235913469124802458013691356902580246791469135780 - результат
        // 123456789024691357802469135780246913578024691357802469135780 - нужно было

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder res = new StringBuilder();
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 2; i++) {

        }

        for (int i = a.length() - 1; i >= 0; i--) { // Проходим по строке a
            count1++;
            builder1.insert(0, a.charAt(i)); // Добавляем в билдер символы
            if (count1 == 9) { // Проверяем, если счётчик равняется 9
                int intA = Integer.parseInt(builder1.toString()); // То инициализируем int и парсим туда билдер
                for (int j = b.length() - 1; j >= 0; j--) { // После чего запускаем второй цикл со строкой b
                    count2++;
                    builder2.insert(0, a.charAt(j)); // Добавляем во второй билдер символы
                    if (count2 == 9) { // Проверяем, если второй счётчик равняется 9
                        int intB = Integer.parseInt(builder2.toString()); // То инициализируем второй int и парсим туда второй билдер
                        int intResult = intA + intB; // Инициализируем int для результата, в котором складываем первые два интеджера
                        res.insert(0, Integer.toString(intResult)); // В билдер результата добавляем по первому индексу наш спарсенный последний интеджер
                        count1 = 0;
                        count2 = 0;
                        builder1.setLength(0);
                        builder2.setLength(0);
                        break;
                    }
                }
            }
        }
        System.out.println(res.toString());
    }
}
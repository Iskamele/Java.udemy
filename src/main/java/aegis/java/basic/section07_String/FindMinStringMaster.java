package aegis.java.basic.section07_String;

public class FindMinStringMaster {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};

        String min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}

package aegis.java.basic.section99_test;

import java.util.ArrayList;
import java.util.Arrays;

public class list {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add(0, "gdansk");
        cities.add(1, "bydgoszcz");
        cities.add(2, "torun");
        cities.add(3, "warszawa");

        System.out.println(cities);
    }
}

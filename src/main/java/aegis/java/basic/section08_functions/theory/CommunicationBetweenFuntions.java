package aegis.java.basic.section08_functions.theory;

public class CommunicationBetweenFuntions {
    public static void main(String[] args) {
        int[] a = {9};
        funtion1(a);
        System.out.println(a[0]);
    }

    public static void funtion1(int[] a) {
        a[0]++;
        System.out.println(a[0]);
    }
}

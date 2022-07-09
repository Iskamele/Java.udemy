package Implemica;

public class OneTask {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;

        System.out.println("x = " + x + "\n" + "y = " +y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println();
        System.out.println("x = " + x + "\n" +"y = " + y);
    }
}

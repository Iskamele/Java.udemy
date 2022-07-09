package Implemica;

public class ThreeTask {
    public static void main(String[] args) {
        int[] array = {6, 18, 36, 27};
        int answer = array[0];
        while (true) {
            answer += array[0];
            if ((answer % array[1] == 0 && (answer % array[2] == 0 && (answer % array[3]) == 0))) {
                break;
            }
        }
        System.out.println(answer);
    }
}
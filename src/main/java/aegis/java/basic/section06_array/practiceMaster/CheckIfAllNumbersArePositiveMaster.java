package aegis.java.basic.section06_array.practiceMaster;

public class CheckIfAllNumbersArePositiveMaster {
    public static void main(String[] args) {
        int[] array = {1,2,3,-4,5};
        
        var allPositive = true;

        for (int value : array) {
            if (value < 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive ? "All positive" : "Not all positive");
    }
}

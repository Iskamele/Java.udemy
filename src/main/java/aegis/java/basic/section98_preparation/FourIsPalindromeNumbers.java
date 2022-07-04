package aegis.java.basic.section98_preparation;

import org.junit.Test;

public class FourIsPalindromeNumbers {
    /*public static void main(String args[]) {
        int[] array = {1, 2, 3, 4, 5, 4, 4, 3, 2, 1};
        boolean pal = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                pal = false;
            }
        }
        System.out.println(pal);
    }*/

    public static void main(String[] args) {
        System.out.println(isPalindrome(new int[]{1,2,3,4,5,4,3,2,1})); //true
        System.out.println(isPalindrome(new int[]{1,2,3,3,4,3,2,1})); //false
        System.out.println(isPalindrome(new int[]{1,4,1})); //true
        System.out.println(isPalindrome(new int[]{99, 3, 1})); //false

    }

    public static boolean isPalindrome (int[] array){
        boolean pal = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                pal = false;
            }
        }
        return pal;
    }
}

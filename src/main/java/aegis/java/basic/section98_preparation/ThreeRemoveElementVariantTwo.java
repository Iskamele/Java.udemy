package aegis.java.basic.section98_preparation;

import java.util.Arrays;

public class ThreeRemoveElementVariantTwo {
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeElement(array, 3)));
    }

    public static int[] removeElement(int[] nums, int value) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                offset++;
            } else {
                nums[i-offset] = nums[i];
            }
        }

        int[] newArray = new int[nums.length - offset];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nums[i];
        }
        return newArray;
    }
}

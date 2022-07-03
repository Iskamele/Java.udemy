package aegis.java.basic.section98_preparation;

import java.util.Arrays;

public class ThreeRemoveElementVariantThree {
    public static void main(String[] args) {
        int array[] = {0, 1, 2, 2, 3, 0, 4, 2};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeElement(array, 3)));
    }

    public static int[] removeElement(int[] nums, int value) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                count++;
            }
        }

        int[] newArray = new int[nums.length - count];

        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                offset++;
            } else {
                newArray[i - offset] = nums[i];
            }
        }

        return newArray;
    }
}

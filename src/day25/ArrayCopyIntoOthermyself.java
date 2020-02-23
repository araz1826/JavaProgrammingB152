package day25;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ArrayCopyIntoOthermyself {
    public static void main(String[] args) {
        int[] nums = {13, 31, 8, 4, 5, 3, 1};

        int[] copy = new int[nums.length];

        for (int a = 0; a < nums.length; a++) {
            copy[a] = nums[a];
        }
        System.out.println(Arrays.toString(nums));



        Arrays.sort(copy);
        if (Arrays.equals(copy, nums)) {
            System.out.println("already sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}

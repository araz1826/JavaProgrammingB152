package day24;

import java.util.Arrays;

public class ArraysSortToString {
    public static void main(String[] args) {
        int[] scores= {99,44,66,23,19,55};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
    }
}

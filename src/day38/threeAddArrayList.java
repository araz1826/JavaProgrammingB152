package day38;

import java.util.ArrayList;            //addAll adding everything in 1 shot
import java.util.Arrays;

public class threeAddArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>();      //HOW TO ADD NUMS 2 TO NUMS1
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);

        ArrayList<Integer> nums2=new ArrayList<>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);

        nums1.addAll(nums2);
        System.out.println(nums1);
        System.out.println(nums2);
        //add new 4 item to nums2 List
        nums2.addAll(Arrays.asList(3,4,5));  // or add all new list
        System.out.println(nums2);

    }
}

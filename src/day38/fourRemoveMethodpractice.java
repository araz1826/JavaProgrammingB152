package day38;

import java.util.ArrayList;
import java.util.Arrays;

public class fourRemoveMethodpractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>();      //HOW TO ADD NUMS 2 TO NUMS1
        nums1.add(1);
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(5);                 //removeAll removes multiple items    BOTH(removeAll &addAll works with Arrays.asList
        nums1.add(6);
                       //remove 2 and 3
        nums1.removeAll(Arrays.asList(2,3));
        System.out.println(nums1);



    }
}

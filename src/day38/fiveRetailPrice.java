package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
                                                          //important: RETAINALL (gets the common items)
                                                //create a new 2 classes and find the common numbers.
public class fiveRetailPrice {
    public static void main(String[] args) {
        ArrayList<Integer> nums1=new ArrayList<>();
        nums1.add(100);
        nums1.add(200);
        nums1.add(300);
        nums1.add(400);
        nums1.add(500);
        nums1.add(600);
        System.out.println(nums1);

       List<Integer> nums2=new ArrayList<>(Arrays.asList(200,300,600,700,800));
        System.out.println(nums2);



       nums1.retainAll(nums2);    //RETAINALL, get the common number
        System.out.println(nums1);
        nums2.retainAll(nums1);         //you can switch num1 with num2, same thing
        System.out.println(nums2);

        System.out.println(nums1.equals(nums2));  //EQUALITY: this check the equal or not
    }
}

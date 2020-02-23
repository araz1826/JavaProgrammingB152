package day38;

import java.util.*;
//Collection is coming from java util class.


public class sixCollectionORsort {
    public static void main(String[] args) {
        List<Integer> nums2=new ArrayList<>(Arrays.asList(500,300,600,400,800));
        System.out.println(nums2);

        Collections.sort(nums2);          // put this in order
        System.out.println(nums2);

        Collections.sort(nums2, Comparator.reverseOrder());  //reverse order but sorts then put in reverse order
        System.out.println(nums2);


    }
}

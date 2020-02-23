package day38;

import java.net.CookieHandler;             //Collections.reverse()   //Collections.sort(num, Comparator.reverseOrder()
import java.util.*;

public class sevenReverseList {
    public static void main(String[] args) {
        List<Integer> nums2=new ArrayList<>(Arrays.asList(500,300,600,400,800));     //reverse the list

        Collections.reverse(nums2);  //this reverse the number, do not care the order
        System.out.println(nums2);

        Collections.sort(nums2, Comparator.reverseOrder()); //this method sort and then reverse the number
        System.out.println(nums2);

        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,3,2,4));
        Collections.reverse(numbers);
        System.out.println(numbers);

        Collections.sort(nums2, Comparator.reverseOrder());
        System.out.println(numbers);
    }
}

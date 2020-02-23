package day36;

import java.lang.reflect.Array;
import java.util.Arrays;

public class twoARRAYlist {
    public static void main(String[] args) {
        int [] nums={1,5,3,4,7,2};
        System.out.println("before"+ Arrays.toString(nums));  //print in ARRAY

        nums[0]=100;   //switch 1st number in array to 100
        System.out.println("after changing 1st number to 100: "+Arrays.toString(nums));

        int [] nums1={1,5,3,4,7,2};  //Note: Nums1 is reference variable(anything we store in primitive type),
                                     // {1,5,3,4,7,2}; these are array object

        //INTERVIEW: java is a pass by value language   ex: int x=10, y=x, y=100, x=?  it is passing by value which is 10
    }

}

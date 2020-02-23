package day37;

import java.util.ArrayList;
import java.util.List;

public class sevenArraylistFINALnUMBER {
    public static void main(String[] args) {
        //create a method accept final number as int, return Arraylist of Integer contain numbers starting from 1 to final num.

        System.out.println(getListfrom1toFinalNumber(10));
        System.out.println(getListfrom1toFinalNumber(20));

        List<Integer> myList=getListfrom1toFinalNumber(25);
        System.out.println(myList);
    }

    public static List<Integer> getListfrom1toFinalNumber(int finalNumber){
        List<Integer> nums=new ArrayList<>();
        for (int i = 1; i <finalNumber; i++) {
            nums.add(i);
        }
        //System.out.println(nums);
        return nums;
    }
}

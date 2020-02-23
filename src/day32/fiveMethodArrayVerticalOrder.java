package day32;

import java.util.Arrays;

public class fiveMethodArrayVerticalOrder {
    public static void main(String[] args) {

        arrayprinter(new int[] {1,2,3,4});                  // note: whe it is array you put ex: new int[] {1,2,3,4}  or one below
                //or
        int [] score={1,2,3,4,5,5,};
        arrayprinter(score);

    }
      public static void arrayprinter(int[] nums){    //create a method has int Array as a parameter, called array printer

          System.out.println(Arrays.toString(nums));


      }

}

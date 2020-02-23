package day30;

import java.util.Arrays;

public class fourCarSplit {
    public static void main(String[] args) {
        String car="Lexus-IS-F";                      // split and print in array

        String splitter[]=car.split("-");
        System.out.println(Arrays.toString(splitter));
                                                        // print out model

        System.out.println(splitter[1]);
    }
}

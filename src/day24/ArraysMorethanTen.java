package day24;

import java.util.Arrays;

public class ArraysMorethanTen {
    public static void main(String[] args) {
        int[] scores= new int[]{156,101,76,87,187,110};   //

        int count=0;
        for(int a=0; a<scores.length; a++) {
            if (scores[a] > 100) {
                count++;

            }

            }

        String finalresult="";
        System.out.println(" = " +count);
        if(count==scores.length){
           finalresult="yes"; // or you can put sout("yes")
        }else{
           finalresult="no";
        }
        System.out.println(finalresult);
        }
}

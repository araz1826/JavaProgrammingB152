package day22;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] number = {95,70,88,100};

        //Arrays.sort(number); //put in order then reverse

        //reverse
        for(int a=number.length-1; a>=0; a--){
            System.out.print (number[a]+" ");
        }
    }
}


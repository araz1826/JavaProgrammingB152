package day26;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String sentence="Everything is awesome!!!";
        String [] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(String item: words){
            System.out.println(item);   // each word in different sentence

        }



    }
}

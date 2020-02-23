package day23;

import java.util.Arrays;

public class SplitMethod2 {
    public static void main(String[] args) {
        String sentence="Everything is awesome!!!";
        String [] allwords= sentence.split("e"); // split by "e"
        System.out.println(Arrays.toString(allwords));
        for(String item: allwords){
            System.out.println("each one=<"+item+">");    // print each in next sentence
        }
        String [] is= sentence.split("is");
        System.out.println("is = " + Arrays.toString(is));

        for(String item: is){
            System.out.println("each word indifferent sentence:" +item);
        }

    }
}

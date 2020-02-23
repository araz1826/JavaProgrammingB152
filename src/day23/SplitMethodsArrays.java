package day23;

import java.util.Arrays;
                                        //length mean how many items
public class SplitMethodsArrays {
    public static void main(String[] args) {
        String sentence="I love java";
        String[] allwords= sentence.split(" ");
        System.out.println("Arrays.toString(allwords) = " + Arrays.toString(allwords));
        System.out.println("allwords = " + allwords.length); // gives you how many words in array

        System.out.println("last word = " + allwords[allwords.length-1]); // gives you last item

        
        String name="salam men araz";
        String [] newname= name.split(" ");
        System.out.println("Arrays.toString(newname) = " + Arrays.toString(newname));
    }
}

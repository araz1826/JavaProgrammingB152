package day23;

import java.util.Arrays;

public class LongestWordSplit {
    public static void main(String[] args) {
        String sentence="We trying to find the longest word";
        String [] allwords= sentence.split(" ");
        System.out.println(Arrays.toString(allwords));



        String longestword="";


        for(String item: allwords){
            if(item.length()>longestword.length()){
                longestword=item;

            }
        }

        System.out.println(longestword);


    }
}

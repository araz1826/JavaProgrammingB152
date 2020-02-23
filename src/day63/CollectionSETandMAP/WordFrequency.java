package day63.CollectionSETandMAP;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//# of words and frequency
public class WordFrequency {
    public static void main(String[] args) {
        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

       Map<String, Integer> lst= new HashMap<>();
       String [] splitter= str.split(" ");
        for (int i = 0; i <splitter.length ; i++) {
            if(!lst.containsKey(splitter[i])){
                lst.put(splitter[i],1);
            }else{
                lst.replace(splitter[i],lst.get(splitter[i])+1);
            }
        }
        System.out.println(lst);
    }
}

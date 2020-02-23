package day63.CollectionSETandMAP;

import java.util.*;

public class FrequencyCOUNT {                       //Frequency of letter and counts
    public static void main(String[] args) {

       String name="AAABBBBCCCCDDDEEEE";
        Map<Character, Integer> chrfreq=new HashMap<>();

        for (int i = 0; i <name.length() ; i++) {
            if(!chrfreq.containsKey(name.charAt(i))){         //if we do not have it
                chrfreq.put(name.charAt(i),1);
            }else {
                chrfreq.replace(name.charAt(i), chrfreq.get(name.charAt(i))+1);
            }
        }
        System.out.println(chrfreq);

    }
}

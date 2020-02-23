package day63.CollectionSETandMAP;

import java.util.HashMap;          //make a method and get the frequency of  words
import java.util.Map;

public class CreatingMethod {
    public static void main(String[] args) {
        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words";

        System.out.println(getFrequency(str));

    }

    public static Map<String, Integer> getFrequency(String str){
        Map<String, Integer> wordFreqMap=new HashMap<>();
        String [] allWords= str.split(" ");

        for (String word: allWords) {
           if (!wordFreqMap.containsKey(word)){
               wordFreqMap.put(word,1);
           }else {
               wordFreqMap.replace(word, wordFreqMap.get(word)+1);
           }
        }
        return wordFreqMap;
    }
}
/*   Map<String, Integer> lst=new HashMap<>();

        for (String each:splitter) {
            if(!lst.containsKey(splitter)){
                lst.put(each,1);
            }else{
                lst.put(each,lst.get(each)+1);
            }
        }

        System.out.println(lst);
* */
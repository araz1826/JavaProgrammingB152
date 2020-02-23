package day26;

import java.util.Arrays;

public class TaskArrayReverse {
    public static void main(String[] args) {

        String[] name={"araz", "aynar", "hasan", "khayala"};
        String words= Arrays.toString(name);
        System.out.println(words);

        for(int a=0; a>name.length; a++){
            System.out.println(name[a]);


        }

        //System.out.println(Arrays.toString(name));

    }
}

// 3 , given a String with multiple word. get an array of words then reverse the array
// 4 , OPTIONAL : reverse each word in a sentence after getting an array of words
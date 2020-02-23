package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] nameChars={'A','D','C','R','F'};
        System.out.println("before order " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting:"+ Arrays.toString(nameChars));


        char[] letters={'A',' ','d','R','9'};
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters));


    }

}

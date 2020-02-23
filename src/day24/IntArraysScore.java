package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntArraysScore {
    public static void main(String[] args) {
        int[] scores1={2,5,6,7,3,34,6};
        int[] scores2={22,45,46,7,3,34,6};
        int[] scores3={2,5,6,7,3,34,6};
        System.out.println(scores1==scores2);
        boolean eqaulity= Arrays.equals(scores1,scores3); // sort first each content and their order have to be a same.
        System.out.println(eqaulity);
        boolean equal= Arrays.equals(scores1,scores2);
        System.out.println(equal);

        // sorting score2 and score3 then find quality

        Arrays.sort(scores2);
        Arrays.sort(scores1);


    }
}

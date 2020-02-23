package day24;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethodsToString {
    public static void main(String[] args) {
        String[] superHereos={"superman", "aquaman", "flash", "cyborg","WonderWoman"};
        //String heroes=Arrays.toString(superHereos);
        //System.out.println(heroes);
        //String name=Arrays.toString(superHereos);
        //System.out.println(Arrays.toString(superHereos));

        for(int a=superHereos.length-1; a>=0; a--){      //reverse
            System.out.println(superHereos[a]);
        }

        int[]nums={1,2,3,4,5};
        String numbers= Arrays.toString(nums);
        System.out.println(numbers);
        System.out.println(Arrays.toString(nums));

    }
}

package day29;

import java.util.Arrays;

public class sevenHerosForEach {
    public static void main(String[] args) {
        String[] hero1={"Superman-Clark J Kent","batman","superman" };
       // System.out.println(Arrays.toString(hero1));  optional it print in array
        for( String item: hero1){
            System.out.println(item);
        }
    }
}

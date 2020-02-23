package day26;

import java.util.Arrays;

public class SelfPracticeSelfNumbertoChar {
    public static void main(String[] args) {
        /// pick up your own name and turn in into char array and use for each loop to loop over them

        String name="araz";
        char[] letter= new char[name.length()];

        for(char a=0; a<name.length(); a++){
            letter[a]=name.charAt(a);
        }
        System.out.println(Arrays.toString(letter));
    }
}


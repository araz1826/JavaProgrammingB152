package day26;

import java.util.Arrays;

public class StringCharArrays {
    public static void main(String[] args) {
        String name="Complete B15 Online 1 Month Survey";
        char[] letter= new char[name.length()];
        for(int a =0; a<name.length(); a++){

            letter[a]=name.charAt(a);

        }
        Arrays.sort(letter);
        System.out.println(Arrays.toString(letter));
        System.out.println(name.split(" "));

    }
}

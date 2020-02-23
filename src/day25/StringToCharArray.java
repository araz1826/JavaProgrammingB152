package day25;

import java.util.Arrays;

public class StringToCharArray {
    public static void main(String[] args) {
        String name = "Alesya";
        char[] namesChar = new char[name.length()];
        for (char a = 0; a < name.length(); a++) {
            namesChar[a] = name.charAt(a);        // how to store chars of the name. each char of the name.


        }
        System.out.println("namesChar" + Arrays.toString(namesChar));
    }
}

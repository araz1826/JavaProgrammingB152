package day29;

import java.util.Arrays;

public class selfStudy {
    public static void main(String[] args) {
     String name="Araz";
     char[] letter= new char[name.length()];

     for(int a=0; a<name.length(); a++){
         letter[a]=name.charAt(a);
     }
        System.out.println(Arrays.toString(letter));
    }
}

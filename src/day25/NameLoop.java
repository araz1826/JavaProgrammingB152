package day25;

import java.util.Arrays;

public class NameLoop {
    public static void main(String[] args) {
        String name="Araz";
        int count=0;
        char[] character= new char[name.length()];


        for(int a=0; a<character.length; a++){
            character[a]=name.charAt(a);
            if(name.substring(a,a+1).equalsIgnoreCase("a")){  //how many a and print out each letter
                count++;
            }
        }
        Arrays.sort(character);
        System.out.println("chars:"+ Arrays.toString(character));
        System.out.println("a counts:" +count);
    }
}

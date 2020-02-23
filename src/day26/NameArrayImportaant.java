package day26;

import java.util.Arrays;

public class NameArrayImportaant {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";   // put in array, then print out each name with-.
        String[]names= students.split(",");
        System.out.println(Arrays.toString(names));

       for(int a=0; a<names.length; a++){
           for(int b=0; b<names[a].length(); b++){
               System.out.print(names[a].charAt(b)+"-");
           }

       }
    }

}










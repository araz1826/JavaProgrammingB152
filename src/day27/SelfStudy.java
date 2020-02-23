package day27;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),
                scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()};

        String nameofShortest=str[0];
        int shortest=str[0].length();
        for(int a=0; a<str.length;a++){
            for(int b=0; b<str[a].length(); b++){
                if(str[a].length()<shortest){
                    shortest=str[a].length();
                    nameofShortest=str[a];

                }
            }
        }
Arrays.sort(str);

        System.out.println(nameofShortest);

}
}

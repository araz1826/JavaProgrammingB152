package day29;

import java.util.Arrays;

public class threeStringILoveJava {
    public static void main(String[] args) {   //Create an array with size 300 and fill it up with I love Java
     String[] loveJava= new String[300];

        for(int a=0; a<loveJava.length; a++){
            loveJava[a]="I love Java";         //if you do not want to start from 0, then LoveJava[a]= (a+1)+"I love Java"

        }
        System.out.print(Arrays.toString(loveJava));
    }
}

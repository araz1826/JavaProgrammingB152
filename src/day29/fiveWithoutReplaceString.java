package day29;

import java.util.Arrays;

public class fiveWithoutReplaceString {
    public static void main(String[] args) {       // print out: Superman-********** (number of stars eqauls # of char Clark J Kent)
        String hero1="Superman-Clark J Kent";
        String[] splitter= hero1.split("-");
        System.out.println(Arrays.toString(splitter));              //(split if then find the length of the words then print that # of star)

        String firsthalf=splitter[0];
        String secondhalf=splitter[1];
        int length= secondhalf.length();

        System.out.println(length);
        String star="";
        for(int a=0; a<length;a++){
            star+="*";
        }
        System.out.print(splitter[0]+"-"+star);
    }
}

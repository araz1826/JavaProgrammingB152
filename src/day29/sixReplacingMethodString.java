package day29;

import java.util.Arrays;

public class sixReplacingMethodString {
    public static void main(String[] args) {       //print out: Superman-************   replace with REPLACE method
        String hero1="Superman-Clark J Kent";
        String[] splitter= hero1.split("-");
        System.out.println(Arrays.toString(splitter));
        String firsthalf=splitter[0];
        String secondhalf=splitter[1];

        String star="";
        for(int a=0; a<hero1.split("-")[0].length();a++){               //a<hero1.split("-)[1].length  shortcut
            star=star+"*";
        }
        System.out.println(firsthalf+"-"+star);
    }
}

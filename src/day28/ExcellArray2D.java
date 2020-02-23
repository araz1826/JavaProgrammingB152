package day28;

import java.util.Arrays;
import java.util.Scanner;

public class ExcellArray2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        int shortestword = str[0].length();
        String shortIndex ="";
        for (String eachWord : str) {
            if (shortestword > eachWord.length()) {
                shortestword = eachWord.length();
                shortIndex=eachWord;
            }
        }
        System.out.println(shortestword);
        System.out.println(shortIndex);


    }
}
/*Cell(1,1)= 78	Cell(1,2)= 54	Cell(1,3)= 100	Cell(1,4)= 84
Cell(2,1)= 33	Cell(2,2)= 44	Cell(2,3)= 77	Cell(2,4)= 123
Cell(3,1)= 12	Cell(3,2)= 88	Cell(3,3)= 52	Cell(3,4)= 76
Cell(4,1)= 67	Cell(4,2)= 33	Cell(4,3)= 98	Cell(4,4)= 67
Cell(5,1)= 12	Cell(5,2)= 88	Cell(5,3)= 52	Cell(5,4)= 45
Cell(6,1)= 67	Cell(6,2)= 33	Cell(6,3)= 98	Cell(6,4)= 34	*/
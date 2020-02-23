package day27;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MultiDStringArray {
    public static void main(String[] args) {
        String[][] names={{"araz", "hasan"},{"aynar", "khayala"}};

        System.out.println(Arrays.toString(names[0]));  //this print out arrays
        System.out.println(Arrays.toString(names[1]));

        System.out.println(names[0][1]);   //this print out exact names in array

        names[1][1]="dilshat";         //replace the name
        System.out.println(names[1][1]);

        System.out.println(Arrays.deepToString(names)); //DEEPtoString  prints all
    }
}

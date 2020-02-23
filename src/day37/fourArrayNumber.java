package day37;

import java.util.ArrayList;
import java.util.List;

public class fourArrayNumber {
    public static void main(String[] args) {
        List<Integer> lst= new ArrayList<>();

        lst.add(44);
        lst.add(14);
        lst.add(34);
        lst.add(41);
        lst.add(19);
                                            //insert  100 right after 34   NOTE: USE indexof 34,and add 1 to get after that
        lst.add(lst.indexOf(34)+1, 100);
        System.out.println(lst);

                                            //add five 100 infront of 44
        lst.add(0, 100);   // OR do this 5 times lst.add(0, 100);
        lst.add(lst.indexOf(100)+1, 100);
        lst.add(lst.indexOf(100)+1, 100);
        lst.add(lst.indexOf(100)+1, 100);
        lst.add(lst.indexOf(100)+1, 100);

        System.out.println(lst);

                                            // easy way with LOOP
        for (int i = 1; i <=5 ; i++) {
            lst.add(0,100);

        }
        System.out.println(lst);
    }
}

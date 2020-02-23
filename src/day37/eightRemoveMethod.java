package day37;

import java.util.ArrayList;
import java.util.List;

public class eightRemoveMethod {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(14);
        list.add(34);
        list.add(41);
        list.add(19);

        System.out.println(list);
        list.remove(2);        //remove index 2
        System.out.println(list);

        list.remove(Integer.valueOf(2));  //this remove INTEGER OBJECT 2
        System.out.println(list);



    }


}

package day62.CollectionSET;            //Index is only for LIST interface, rest of them does not have index

import java.util.HashSet;
import java.util.Set;

                                        //Set is a data type store unique elements, NO DUPLICATE
    //INTERVIEW: what kind of collection u use to store unique element:
public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> myNums=new HashSet<>(); //polymorphisim here; use supertype as reference type, UPCAST, all polymorphisim ar upcast
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(10);
        myNums.add(20);
        myNums.add(33);
        System.out.println("myNums = " + myNums);
        
        
    }
}

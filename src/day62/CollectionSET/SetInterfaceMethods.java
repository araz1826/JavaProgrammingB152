package day62.CollectionSET;

import java.util.HashSet;
import java.util.*;

public class SetInterfaceMethods {
    public static void main(String[] args) {
        Set<String> state=new HashSet<>();
        state.addAll(Arrays.asList("AZ","WY","MI"));
        state.add("CA");
        state.add("CA");
        state.add("CO");
        state.add("CO");
        state.add("NW");
        state.add("NA");
        System.out.println("state = " + state);
        state.remove("CA");

        //if u have a letter A remove it

     Iterator<String> str=state.iterator();   // you can modify with ITERATOR // for iterator you don not have to care about index
     while (str.hasNext()){
         if (str.next().contains("A")){
             str.remove();
         }
     }
        System.out.println("removed with A: "+state);


     /*SortedSet<Integer> lst= new TreeSet<>();  // has uniqu set, no dups and you can SORT
     lst.add(70);
     lst.add(70);
     lst.add(60);
     lst.add(40);
        System.out.println(lst);
        System.out.println(lst.first()); //firts item
        System.out.println(lst.last()); //last item
*/
    }
}

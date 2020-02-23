package day60.Collection;

import javax.print.attribute.standard.MediaSize;
import java.sql.Array;
import java.util.ArrayList;    //List is the only data Structure has index, like get()
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionLIST {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();  //Instead of List you can say Collection, because Collection is parent of list, it is polymorphisim

        Collection<String > name=new ArrayList<>(); //more super type, more specific, so you can access less. beacuse collection includes list, queue, map set ..
        name.add("araz");
        name.add("aynar");
        name.add("abdulla");
        name.add("sevim");
        name.add("hasan");
        name.add("lorin");
        name.addAll(names);  // you adding duplicating, you can can pass anything is collection
        System.out.println("name = " + name);

        name.removeAll(Arrays.asList("araz"));  // you can remove as much as you can even add more names
        name.remove("hasan");

        //OR
        //Collection<String> toRemove=Arrays.asList("abdulla");   you create a collection and remove at below
       // name.removeAll(toRemove);
        for (String eachName: name) {
            System.out.println( "eachname: "+eachName);

        }
      //lambda expression: easy and shortcut of for each loop

        name.forEach(each-> System.out.println("each: "+each));

    }
}

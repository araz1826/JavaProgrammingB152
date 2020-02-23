package day61.CollectionList.Comparable;

import java.util.*;
import java.util.LinkedList;

public class JobHunter {
    public static void main(String[] args) {

        //this is how you compare
        Job j1= new Job("GA",120000,"Bofa");
        Job j2= new Job("VA",110000,"Amazon");
        Job j3= new Job("CA",120000,"Apple");
        System.out.println("compare to j1 to j2 = " + j1.compareTo(j2));
        System.out.println("compare to j1 to j3= "+j1.compareTo(j3));



        List<Job> lst =new LinkedList<>();
        lst.add(new Job("Denver",120000,"Dish Network"));
        lst.add(new Job("La",130000,"Dish Network"));
        lst.add(new Job("Atlanta",100000,"Dish Network"));
        lst.add(new Job("San Fransisco",140000,"Dish Network"));
        lst.add(new Job("New York",90000,"Dish Network"));

        System.out.println("Before sorting"+lst);

        Collections.sort(lst); // low to high, salaries
        System.out.println("after sorting"+lst);

        //Collections.sort(lst, Comparator.reverseOrder()); reverse order
        Collections.sort(lst,Collections.reverseOrder()); //another way , reverse the salary
        System.out.println(lst);

    }
}

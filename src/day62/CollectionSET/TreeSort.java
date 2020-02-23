package day62.CollectionSET;

import java.util.SortedSet;
import java.util.TreeSet; //SET NO DUPS,  sorted order Tree hashset

public class TreeSort {
    public static void main(String[] args) {

        SortedSet<Integer> lst= new TreeSet<>();  // has uniqu set, no dups and you can SORT
        lst.add(70);
        lst.add(70);
        lst.add(60);
        lst.add(40);
        System.out.println(lst);
        System.out.println(lst.first()); //firts item
        System.out.println(lst.last()); //last item
    }
}

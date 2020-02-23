package day61.CollectionList.Comparable;

import java.util.List;     //Interview: Difference between ArrayList and LinkedList: ArrayList operation performance is faster
                            // practically you will not feel the difference just a millisec difference
//LinkedList is fast for adding and deleting elements, but slow to access a specific element.
// ArrayList is fast for accessing a specific element , just needs index but linkedlist does does not jump, goes step by step and ask neighborhood

//Arraylist is backed by array     //LinkedList is backed by node
   //Big O Notation: this is a performance of algorithm
public class LinkedList {
    public static void main(String[] args) {
        List<String> lst= new java.util.LinkedList<>();  //Linkedlist is people holding eachother hand example
        lst.add("Zeynep");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");
        System.out.println("lst = " + lst);
        lst.remove("Ershat");
        System.out.println("lst = " + lst);
    }
}

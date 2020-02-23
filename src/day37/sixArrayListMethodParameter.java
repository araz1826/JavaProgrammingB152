package day37;

import java.util.ArrayList;
import java.util.List;

public class sixArrayListMethodParameter {
    public static void main(String[] args) {  //create a method that accept a List of String as argument
                                            // print all Vertically and return nothing

        ArrayList<String>name=new ArrayList<String>();
        name.add("Rukhshona");
        name.add("Farzona");
        name.add("Aziza");
        name.add("Mahliyyoh");
        name.add("Ulugbek");
        name.add("Olim");
        name.add("Inobat");

        arrayList(name);

        System.out.println(longesitem(name));

    }
    public static void arrayList(ArrayList<String> lst){    //NOTE: if you put arraylist, you have to array list in main method. If you put list the put list in main methid
        for (int i = 0; i <lst.size() ; i++) {
            System.out.println("name: "+lst.get(i));

        }
        /*for (String each:lst) {     //another way
            System.out.println(each);

        }*/
    }
    public static String longesitem(ArrayList<String> name){ //create method and find the longest
        int longest=name.get(0).length();
        String longestname=name.get(0);

        for (int i = 0; i <name.size() ; i++) {
            if(name.get(i).length()>longest){
                longest=name.get(i).length();
                longestname=name.get(i);
            }
        }
return longestname;
    }

}

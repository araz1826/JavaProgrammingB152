package day36;

import java.util.*;


public class fiveINTERVIEWarraylistVSarray {

    public static void main(String[] args) {  //INTERVIEW: difference between ARRAYLIST and ARRAY
                                      //arraylist only stores object and array store anything you store

        ArrayList<String> lst1= new ArrayList<>(); //only stores object, NO primitive type

        ArrayList<Integer> lst2= new ArrayList<>(); // create a arraylist to store whole numbers

        List<String> lst3=new ArrayList<>();

        //EXAMPLE:  CREATe arraylist object of long and assing it to a variable

        ArrayList<Long> lst4= new ArrayList<>(); //add, read, update, insert, remove, check he location, delete
        lst4.add(12L);  //only store an object
        lst4.add(13L);
        lst4.add(15L);
        lst4.add(16L);
        System.out.println(lst4);
        int sum=0;

        for (int i = 0; i <lst4.size() ; i++) {   //how to get SUM
            sum+=lst4.get(i);
        }
        System.out.println(sum);


        long max=lst4.get(0);
        for (int i = 0; i <lst4.size() ; i++) {   //how to get MAX
            if(lst4.get(i)>max){
                max=lst4.get(i);
            }
        }
        System.out.println(max);


        lst4.set(0,1L);              //this update/change the valuse of any number in arraylist
        System.out.println(lst4);

        System.out.println(lst4.get(0)); //this get the first item in list

        System.out.println(lst4.size()); //this give how many numbers in arraylist

        lst4.remove(0); //this remove the item you want it
        System.out.println(lst4);

        lst4.clear();         //this delete all the items inside
        System.out.println(lst4);


    }
}

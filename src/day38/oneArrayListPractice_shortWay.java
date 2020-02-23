package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;                          //NOTES BELOW.

public class oneArrayListPractice_shortWay {
    public static void main(String[] args) {  //List is larger than ArrayList
        //List<String> superman= new ArrayList<>(SuperHereos); // add from method class
        //OR
        //List<String> topics= Arrays.asList("araz", "isa", "Hasan");  //ASLIST method to add directly

                // create List of 6 double in short way

        List<Double> number=Arrays.asList(1.2, 3.2,4.3,5.4,5.6,6.7);
        System.out.println("old numbers"+ number);
int count=0;
        for (int i = 0; i <number.size() ; i++) {      //how many number greater than 5.
            if(number.get(i)>5){
                count++;
            }

        }
        System.out.println(count);

        for (Double item:number) {     //another way of counthing with each loop
            if(item>5){
                count++;
            }
        }
        System.out.println(count);

        //create an arrayList and 2 more items:

        ArrayList<Double> newPrices=new ArrayList<>(number);
        newPrices.add(1.9);                       //add adds to the very last item in list, but remove removes very first item
        newPrices.remove(5.6);       //newPrices.remove(you can even put the index number or exact amount.)
        System.out.println("new Numbers"+newPrices);

        //create an Arraylist object in one shot, another way. you do not have to know.
        ArrayList<Double> oneShot=new ArrayList<>(Arrays.asList(1.2, 3.2,4.3,5.4,5.6,6.7));
        oneShot.add(1,10.9);  //add 10.9 after 1st item
        oneShot.remove(2);   //remove item 3
        System.out.println(oneShot);
    }
}

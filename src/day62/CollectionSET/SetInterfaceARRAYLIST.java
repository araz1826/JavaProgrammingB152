package day62.CollectionSET;

import java.util.*;        //for SET for hashset, there is no order, just prints random

public class SetInterfaceARRAYLIST {
    public static void main(String[] args) {

        List<Integer> numlist= Arrays.asList(10,10,20,20,20,30,30,30);  //create an arraylist Integer
        System.out.println(numlist);

        Set<Integer> myNums=new HashSet<>(numlist); //copy everything to list, and will eliminate the duplicates
        System.out.println("myNums = " + myNums);
        //create a set of String called state, and add bunch of states with some duplicates
        //Iterate over them(how many way u know)

        Set<String> state=new HashSet<>();
        //state.addAll(Arrays.asList("az","az","co"));
        state.add("florida");
        state.add("florida");
        state.add("colorado");
        state.add("boston");
        state.add("newyork");
        state.add("california");
        System.out.println("state = " + state);

        System.out.println("number of states: "+state.size());

        //HOW MANY ITERATOR YOU KNOW IT

        for (String item:state) {             //create foreach to print out
            System.out.print(item+" ");
        }
        //for loops does not work beacause no index for SET interface

        Iterator<String> setItr=state.iterator();    //creating iterator and print out. ITERATOR has next and hasnext method
        while (setItr.hasNext()){
            System.out.println(setItr.next());
        }

        state.forEach(each-> System.out.println(each)); //lambda expression for foreach method
    }
}

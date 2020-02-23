package day60.Collection;
                                     //ITERATOR METHODS BELOW : has 3 methods  (hasNext, Next, remove)

                                //INTERVIEW: what is the best way to remove the item: ITERATOR. it works with collections
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {

        Collection<Integer> nums=new ArrayList<>(Arrays.asList(10,4,5,6,7,22,33));

        //below you duplicate the arraylist and apply the methods. modifying

        //how to remove numbers greater than 10
        Iterator<Integer> myIter=nums.iterator();  //you assign all nums into iterator

        //methods: 1. hasNext(it checks that u have item or not)
        System.out.println(myIter.hasNext());

        //methods: 2. Next(it checks the list 1 by 1 what is next item)
        System.out.println(myIter.next());  //10
        System.out.println(myIter.next());  //4
        System.out.println(myIter.next());  //5  each time you get next item

        //methods: 3. Remove
        myIter.remove(); //it will remove where is your current location
        System.out.println(nums);

        //remove numbers less than 10

        while (myIter.hasNext()){
            if(myIter.next()<10){
                myIter.remove();

            }
        }
        System.out.println(nums);
    }
}

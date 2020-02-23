package day38;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoArrayListBulkOperation {      //create a groceries List and add item in 1 shot
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("eggs","milk","butter", "apple", "salmon"); //you can not add or remove item with asList
        System.out.println("groveries:"+ groceries);

                                                //so create an arraylist add top items and extras
        ArrayList<String> newList=new ArrayList<>(groceries);
        newList.add("cola");
        newList.add("sugar");

        System.out.println("newlist:"+newList);

        //create another list in 1 shot

        List<String> veryNewList= Arrays.asList("oil","butter");

            //add all new items inside to newList

        newList.addAll(veryNewList);  //addALL method adds 1 list to another
        System.out.println(newList);




    }
}

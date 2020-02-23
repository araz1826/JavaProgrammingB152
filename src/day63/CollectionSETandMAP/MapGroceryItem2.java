package day63.CollectionSETandMAP;
/*Create a Map of grocery items
String , Double
// add 7 items :
// try to add duplicate keys and see
// try to use putIfAbsent
// print them out in one shot
// Observe if there is any predictable order
// get the 3rd item value and print
// double the price of the first and last item
// try to remove tomato
// OPTIONALLY : USING THE PREVIOUS CLASS STRING
// TRY TO GET A charFrequencyMap
// your map should store character and it's frequency
//  AAABBCDDDD  -->> {'A'=3 , 'B'=2 , 'C'=1 ,'D'=4 ,  }*/
import java.util.HashMap;
import java.util.Map;

public class MapGroceryItem2 {
    public static void main(String[] args) {

        Map<String , Double> groceryList=new HashMap<>();
        groceryList.put("tomato", 3.4);
        groceryList.put("apple", 4.4);
        groceryList.put("tomato", 3.4);
        groceryList.put("banana", 1.4);
        groceryList.put("kiwi", 5.4);
        groceryList.put("strawberry", 8.4);
        groceryList.put("kiwi", 5.4);
        System.out.println("whole lits: "+groceryList);
        System.out.println("size: "+groceryList.size());

        groceryList.putIfAbsent("grape",3.3);
        System.out.println(groceryList);

        System.out.println(groceryList.get("kiwi"));  //third item . just check the list and add name. so get index here

        //groceryList.replace("banana",1.4*2);
        groceryList.replace("banana",groceryList.get("banana")*2);   //how to update the price of banana
       groceryList.replace("apple", groceryList.get("apple")*2);

       if(groceryList.containsKey("tomato")) {
           groceryList.remove("tomato");
           System.out.println("no more tomato");
       }

        System.out.println(groceryList);
    }
}

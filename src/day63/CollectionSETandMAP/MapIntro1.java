package day63.CollectionSETandMAP;
                                         //Map: store key-value pair item in diamond operator
                                        //is not a sub interface of Collection interface, but still in the collection framework.
import java.util.HashMap;                //difference is all are in sigle value, Map is a key pair
                                            // key values are uniqe, no dups. beacuse when u search by key value u get 1 unique value
import java.util.Map;
                           //Hashmap is not puttin in order, so u can use LinkedHasMap keep in order, based on your enters. (insertion order)

public class MapIntro1 {
    public static void main(String[] args) {    //MAP and METHODS
          //just an example
     Map<String, String> nameSate=new HashMap<>(); //all collection framework is polymorphisim
        Map<Integer, String> groupNumName= new HashMap<>();
        Map<String, Double> groceryNamePrice=new HashMap<>();
        Map<String, Boolean> voteNameEligibility= new HashMap<>();

        Map<String, Integer> nameAge=new HashMap<>();   //in <> first one is key, main then value it belongs to key
        nameAge.put("araz",34);    //put method is adding
        nameAge.put("aynar",8);
        nameAge.put("hasan",3);
        nameAge.put("khayala",33);
        System.out.println("nameAge = " + nameAge);
        System.out.println("size: "+nameAge.size());

        System.out.println("how to get aynar age = " + nameAge.get("aynar")); // get method, add name to get the age
        System.out.println("containskey: " +nameAge.containsKey("araz"));  //containsKey method
        System.out.println(nameAge.containsValue(34));

        //HOW TO only add new item does not already exist in the list

        nameAge.putIfAbsent("aynar",23);  //putIfAbset method: it will check it, if it is not in the list then will be added
        System.out.println(nameAge);

        //updating the element in the MAP   // you can only remove and add, no change on key only on value, use REPLACE

        nameAge.replace("aynar",9);  //replace method: will replace only the value, it means updating
        System.out.println(nameAge);

        nameAge.replace("aynar",9,10);








    }
}

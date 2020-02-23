package day61.CollectionList.Comparable;
                                //Collection is Interface, Collections is class so you can sort

                                //List (interface): ArrayList and LinkedList are implementation
import java.util.*;

public class CollectionArrayList {
    public static void main(String[] args) {
        //collection interface is a supertype(polymorphism)
        Collection<Integer> nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,6,4,5,7,8)); //Arrays.aslist is not resizable
        System.out.println("nums = " + nums);

        //List<Integer> lst=new ArrayList<>(nums); you can even pass like this
        List<Integer> nums2=new ArrayList<>(Arrays.asList(10,7,4,11,67,8));
        Collections.sort(nums2);
        //Collections.sort(nums2,Collections.reverseOrder());
        System.out.println("nums2 = " + nums2);
        
    }
    
}

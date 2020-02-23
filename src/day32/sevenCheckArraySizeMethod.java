package day32;    /**
 * compare2arraySize
 * create a method that accept 2 String array object
 * and compare the item counts inside these 2 arrays
 * if arr1 is more then print array 1 has more item
 * if arr2 is more then print array 2 has more item
 * else print they have same item count
 */

public class sevenCheckArraySizeMethod {         //create a method that accepts 2 string array object

    public static void main(String[] args) {
        compare2arraysize(new String[]{"araz", "Aynar"}, new String[]{"hasan", "khayala"});
        //or
        String[] names1={"araz", "aynar"};
        String []names2={"hasan"};
        compare2arraysize(names1,names2);

    }
    public static void compare2arraysize(String[] arr1, String[] arr2){
        if(arr1.length>arr2.length){
            System.out.println("array 1 has more item");
        }else if(arr2.length>arr1.length){
            System.out.println("array 2 has more item");
        }else{
            System.out.println("they have a same count");
        }

    }
}

package day53Polymorphisim;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    public static void main(String[] args) {
        Apple a1= new Apple("sweet","red", "fuji");

        //Fruit is reference type and Apple is object type, a1 is reference varibale
        //a1 can access to Apple reference type, whatever Apple has
        Fruit f2= new Orange("sour","orange",12);
        Fruit f3=new Orange("cripsy","red",10);

    // new ile baslayanlar object, digeri reference type

        System.out.println(a1.taste +"  "+a1.color+"   "+a1.type);

        a1.getdigested(); //reaches getdigested method under apple

        System.out.println("/////////////////////");

        Fruit f1=a1; //new Apple("sweet","red", "fuji");this is polymorphisim
        System.out.println(f1.color);
        System.out.println(f1.taste);
        //f1.type . you can not do type because fruit class does not have type
        f1.getdigested();
        //reassing, you  tell that f1 will be orange object from now on
        f1=new Orange("sour-sweet","reddish",2);
        f1.getdigested();
        System.out.println(f1.toString());

        Fruit[] myFruits={f1,f2,f3};
        for (Fruit each: myFruits) {
            each.getdigested();

        }
          // with this arraylist you can not add remove anything, it is not resizeble
        //List<Fruit> fruitList= Arrays.asList(f1,f2,f3);

        List<Fruit> fruitList=new ArrayList<>(Arrays.asList(f1,f2,f3));
      // you can add remove antything here
        for (Fruit each: fruitList) {
            System.out.println(each.toString());
            System.out.println("class name"+each.getClass().getSimpleName());//just class name

        }

    }

}

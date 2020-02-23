package day32;

                                        // create a static method called givememyname. it returns your name

import java.util.Arrays;

public class eightReturnType {
    public static void main(String[] args) {
        System.out.println(name());
// or
        //String nam=nammmm();
        //System.out.println(nam);

        System.out.println(doubleTheNumber(4));

        // or     int result= doubleTheNumber(3);
        //        System.out.println(result);

    }
    public static String name(){
        String myname ="araz";
        return myname;
    }

    public static String nammmm(){    //another way
        return "araz";
    }
    public static int doubleTheNumber(int num){
        int number= num*2;
        return number;
    }

}

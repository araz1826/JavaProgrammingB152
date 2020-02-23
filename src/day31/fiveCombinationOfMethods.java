package day31;
public class fiveCombinationOfMethods {
                                              // Calling one method into another
    public static void main(String[] args) {     //method that WAKEUP and DRINKCOFEE at the SAME TIME,
     //
        combineThem();

         }

         public static void combineThem(){ // in order to combine them: make another public class
                                           // put both classes under this class
        wakeUp();
        drinkcofee();

         }

    public static void wakeUp(){
        System.out.println("Open you eyes");
        System.out.println("hear your alarm");

    }
    public static void drinkcofee(){
        System.out.println("put coffee in your machine");
        System.out.println("enjoy your cofee");
    }

}

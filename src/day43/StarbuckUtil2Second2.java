package day43;

import day42.Movie3;

public class StarbuckUtil2Second2 {    //IMPORTANT: if it is non stativ method it means it is a instance field.
    //we use static to call direct and no need to create an object: if it is non static, then it is instance, we have to create
             //an object to call it
    public static void main(String[] args) {

        Coffee2 c=new Coffee2("Blonde", 5, 1.6);
        printCoffeeInfo(c);

        //String myString=new String("Hello");
        //System.out.println(myString);
        printStringInfo("hello");

        Coffee2 c1=new Coffee2();
      printCoffeeInfo(c1);
      printCoffeeInfo(new Coffee2("frapucinno",10)); //this is another way to call


    }
    //Create a static method to accept  a Coffee2(previous class) object and print its infomations
    //Like this this cofee is: name, price is : price, cafeeine level is: level

    public static void printCoffeeInfo(Coffee2 co){  //input from Coffee2 class  IMPORTANT
        System.out.println("This coffee is:"+co.getType());
        System.out.println("Price is:"+co.getPrice());
        System.out.println("CaffeineLevel is:"+co.getCaffeineLevel());
    }

    //a static method to print out first and last character of a String
    public static void printStringInfo(String str){
        System.out.println("first char:"+str.charAt(0));
        System.out.println("last char:"+str.charAt(str.length()-1));
    }
    //lengt of the movie from day42
    public static void movieall(Movie3 abc1, Movie3 abc2){ //MOVIE3 class from day42
        System.out.println("name:"+abc1.getName());
        System.out.println("length:"+abc1.getLength());

    }
    public static void printShorterMovieDuration(Movie3 a1, Movie3 a2){
        if(a1.getLength()<a2.getLength()){
            System.out.println(a1.getName());
        }else {
            System.out.println(a2.getName());
        }
    }


}

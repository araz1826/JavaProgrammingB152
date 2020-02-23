package day45;

public class Apple extends Fruit{

    //I want to reuse the functionality already written in SUPER class(Fruit)
    public Apple(){
       //super(); //this is how you call SUPER class constructor, it is not inherit
       //use "super" keyword to call it.  only for the first constructor

        super("test"); // how to call constructor with 1 arg inside

        //NOTE: you can not call both super, you have to call one at a time, that is why // above super

        System.out.println("Message from Apple constructor");

        //even If you not put it will print the super () as default like no arg inside
    }
//I want to reuse the functionality already written in SUPER class(Fruit)
    public static void main(String[] args) {
        Apple a1= new Apple();
//Note: even if you do not have any constrructor, you will always call default constructor autoaticall
    }
}

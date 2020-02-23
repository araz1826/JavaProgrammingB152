package day45;

public class Fruit {

    public Fruit(){
        System.out.println("Fruit constructor message");
    }
    public Fruit(String str){
        System.out.println("one arg Fruit constructor");
    }

}
//ALWAYS ADD NO ARG CONSTRUCTOR in super class to avoid unnecessary error in sub class

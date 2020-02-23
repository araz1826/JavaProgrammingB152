package day49.Interface.Interface;
//interface does not have a constructor. each class have constractor
   //but interface is not a class
public interface Edible {

    public abstract void eat(); //you can not have body
    public static final boolean IS_HUMAN_FOOD=true;

    void drink(); //if method does not have a body, it is automatically defined this public abstract

    public default void digest(){//default method, only exist at INTERFACE
        //this is not a abstract you do not

        //this is not a access modifier, it is just a default method
    //purpose is: you do not have to override, so that do not break the coe
    }
}

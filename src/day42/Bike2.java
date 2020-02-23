package day42;

import org.w3c.dom.ls.LSOutput;

public class Bike2 {

    int speed;
    int gear;
    //I do not want empty gear when object is created
    //I want the bike come with gear set to 1


    public Bike2(){  //this is Constructor . it is not a method
        System.out.println("message from constructor");
        gear=1;
    }
    public Bike2(int newGear){  //you can have multiple constructorwith same name
        // but with different paremeter(Constructor overloading)
        gear=newGear;

    }
    //I want the bike object with both speed ad gear set to
    // the value I speify

    public Bike2(int gear, int speed){
        this.gear=gear;  //put "this" to understand the exact in instance variable
        this.speed=speed;

    }
    public Bike2(String str){
        System.out.println("accept string@!!");
    }
}

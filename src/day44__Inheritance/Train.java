package day44__Inheritance;

public class Train extends Vehicle {  //sub class

    int wagonCount; //u can add your own attribute that super class does not have

    public void makeChoChoSound(){

        System.out.println("choo chooo");
    }

    public static void main(String[] args) {
        //How to call choo choo sound
        Train t1= new Train();
        t1.makeChoChoSound();

        t1.make="thomas";
        t1.setYear(1999); //use this if you put private there
        //t1.year=1999;  // if you do not have private front of int year, then us this
        //call the method from Vehiv
        t1.start();
        t1.goForward();
    }
}

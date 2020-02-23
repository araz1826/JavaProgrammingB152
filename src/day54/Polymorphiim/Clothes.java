package day54.Polymorphiim;
/*interface Wearable
interface Cosmetics
class : Clothes  , Watch , Perfume , MakeUps and so on
        Clothes  , Watch , Perfume , MakeUps IS-A Wearable
        Perfume , MakeUps IS-A Consmetics*/

import day52Polymorphisi.Circle;

public class Clothes implements Wearable {
    int size;


    public static void main(String[] args) {//main method
        //try out all polymorphic assignment
        Clothes c1=new Clothes();
        Wearable w3=new Clothes();
        Object o1= new Clothes(); // object is a main class of java

        Wearable w1=new Watch();
        Wearable w2=new Perfume();

        Cosmetics c2=new Perfume();
        c2= new Makeups();
        Object o2= new Perfume();

        Makeups m1= new Makeups();
        Wearable m2= new Makeups();
        Cosmetics m3= new Makeups();
        Object o4= new Makeups();




    }

    }
class Watch implements Wearable{

}
class Perfume implements Wearable,Cosmetics{

}
class Makeups implements Wearable, Cosmetics{

}

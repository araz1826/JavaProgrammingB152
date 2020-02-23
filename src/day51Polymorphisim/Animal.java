package day51Polymorphisim;

public class Animal {

    public void makeNoise(){
        System.out.println("general animals make noise");
    }

}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Wof");
    }

}
class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Neinee");
    }

}
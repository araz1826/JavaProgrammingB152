package day54.PolyInterfAbstrat;

public abstract class Animal {
    public abstract void speak();

}
class Dog extends Animal implements IndoorPet{
    String name;

    public void speak(){
        System.out.println("bark");
    }
    public void play(){
        System.out.println("running and playing");
    }
}


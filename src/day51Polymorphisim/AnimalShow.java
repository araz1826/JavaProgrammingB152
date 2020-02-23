package day51Polymorphisim;

public class AnimalShow {
    public static void main(String[] args) {
        Animal a1=new Dog(); //a1 is a container reference to Animal
        a1.makeNoise();

               a1=new Horse(); //Animal a2= new Horse(); you can even put like that
               a1.makeNoise();

        Animal a2=new Horse();
        a2.makeNoise();

        Dog d1= new Dog();

        Animal a3=d1; //IMPORTANT

       // Dog d1=new Horse(); you can not do that because dog is not horse,
                  //they do not have a relationship

    }
}

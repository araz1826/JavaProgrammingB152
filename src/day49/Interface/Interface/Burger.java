package day49.Interface.Interface;

public class Burger implements Edible, Juicy{


    public Burger(){ //constructor, each class have it

        super();//we do not see but we have
    }
    @Override
   public void eat(){

        System.out.println("eating burger");
   }

    @Override
    public void drink() {

        System.out.println("drink soda");
    }
    public void melt(){

        System.out.println("juicy is melting");
    }

}

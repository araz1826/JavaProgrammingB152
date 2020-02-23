package day49.Interface.Interface;

public class IceCream implements Edible {

    @Override
    public void eat(){
        System.out.println("eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink if it is melted");

            }
            @Override
    public void digest(){
                System.out.println("digesting burger");
    }

    public static void main(String[] args) {
        IceCream i1=new IceCream();
        i1.eat();
        i1.drink();
        //System.out.println(i1.toString()); //you will get hascode

        i1.digest();

    }

}


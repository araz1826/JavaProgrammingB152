package day43;

public class PetStatic {
    public static void main(String[] args) {
        // if you are on same class call with name
        //but if you are on different class call with classname and method
        Pet.showGeneralPetInfo();//class name+method name if you are in different class
        Pet p1=new Pet("cat", "yumyum");
        System.out.println("p1 name = " + p1.getName());
        p1.speak();
    }
}

package day45;

public class Dog {  //OVERRIDING: you can copy and add here or..

   public void speak(){// this is ovverride


       System.out.println("Bark");
   }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.speak(); //in sub class you can override and give your own fun
                        //give your own functionality


   }
}

package day48Interface;
 //we build relationship between class and interface
  //using implements keyword, like an extends, it build relationship with flyable
public class Plane implements Fylable {

 String name;
 int capacity;
 int speed;

 @Override
 public void fly(){ // you have to add this method like abstract
  System.out.println("plane is flying");
 }

  public static void main(String[] args) {
   Plane p1=new Plane();
   p1.fly();  // it will refer to method above

   p1.name="boing";
   p1.capacity=100;
   p1.speed=500;


   System.out.println(Fylable.HAVE_WING); // it is static so class and method
  }
}

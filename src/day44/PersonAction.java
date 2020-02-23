package day44;

public class PersonAction {
    public static void main(String[] args) {

        Person p1=new Person("Jon snow", 27);
        p1.species="human";
        System.out.println("p1 = " + p1);

        Person p2=new Person("Arya Stark", 18);
        p2.species="humanoid";  //this and below field will be humanoid
        System.out.println("p2 = " + p2);

        Person p3= new Person("Dani",25);
        System.out.println("p3 = " + p3);

        //how to access to static field
        System.out.println("person species: "+ Person.species);
    }
}

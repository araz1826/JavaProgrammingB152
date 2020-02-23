package day34;

public class sixMethodOverloading {
    public static void main(String[] args) {

        String name="overloading";                               //name.then you will see how many method overloading it has.
        System.out.println(name.substring(6));
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o", 2)); // different version of indexof . it find o after index

        sayHello("araz", "aynar");

    }
    public static void sayHello(){               // you can make a same METHOD NAME as long as you have a different paramenters
        System.out.println("Hello world");          //This is a called OVERLOADING
    }
    public static void sayHello(String name){
        System.out.println("hello"+ name);
    }
    public static void sayHello(int a){
        System.out.println("hello"+ a);
    }
    public static String sayHello(String nam, String nam1){
        return nam+nam1;
    }
}

package day31;

import javax.xml.namespace.QName;

public class sixAddingNewThingtoMethod {
    public static void main(String[] args) {    //
        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("kids");
    }
    public static void sayHelloTo(String name ){
        System.out.println("Hello "+name);


    }

    public static void sayHello(){

        System.out.println("Hello B15");
    }
}

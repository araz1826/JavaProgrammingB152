package day45;

    public class BookOVERRIDING extends Object {  // OBJECT is super class of all classes in Java

    public static void main(String[] args) {
        BookOVERRIDING b1= new BookOVERRIDING();
        System.out.println("b1: "+b1.toString());// you inherit from you parent functionality"OVERRIDE"

    }
    @Override// this is called annotation(whatever put @ in front)
    public String toString(){
        return "my own version of toString";  //
    }
}

//INTERVIEW: difference between overriding and overloading:
//overloading:same method name different prmt list in the same class
//overriding: happen in parent child realtionship (super and sub), same method and same parameter
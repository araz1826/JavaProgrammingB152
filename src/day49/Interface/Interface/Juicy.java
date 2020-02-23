package day49.Interface.Interface;

public interface Juicy {
    public abstract void melt();

    //static method has body, not inherited, belongs to class
    public static void squeeze(){

        System.out.println("static squeezing");
    }


    //I created below main method only to call static method above
    public static void main(String[] args) {

        Juicy.squeeze();  //like static way to call
    }
}

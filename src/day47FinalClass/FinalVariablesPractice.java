package day47FinalClass;

public class FinalVariablesPractice {
    public static void main(String[] args) {
        int a = 100;
        a = 200;  // you can re assing a value


        final int x = 100; // YOU CAN NOT reassing bacause final make it unchangable
        //x=200;  you can not re assing, because final make it unchangable

        //if it is a method has to have a () {} otherwise it is a field

        //IMPORTANT
        final String name="araz";
        //name="aynar";  final can not be  re assign
    }

    public static void print(final int x){
        //x=x*2; it is final you can not re assign
        System.out.println("x*2="+ x*2);
    }
    //interview question, typ of final
    //final variable, final class and final final method:  you can not change , you can not re assign


}
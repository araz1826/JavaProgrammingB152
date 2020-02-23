package day37;

public class nineMethodOVERLOADING {
    public static void main(String[] args) {
        printNum(100);          //if you put 100, it will print the 1st method (int)
        printNum(Integer.valueOf(50));//if you put VALUEof, that will chose the second method below (Integer)

    }
    public static void printNum(int x){
        System.out.println("printing primitve int x: "+x);  //
    }
    public static void printNum(Integer x) {
        System.out.println("printing primitve Integer object: " + x);
    }
}

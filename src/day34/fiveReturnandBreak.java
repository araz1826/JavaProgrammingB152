package day34;

public class fiveReturnandBreak {
    public static void main(String[] args) {    //return vs break; return terminate the method, break is out for loop.
        printChar("aynar");
        printChar("jon");
        System.out.println("jiz");

    }
    public static void printChar(String name){  //if the name has less than 4 chars get out of the method
        if(name.length()<4){
            System.out.println("invalid name");
            return;  // this return means get out the method. terminate it. this stop it like a BREAK.
        }
        System.out.println(name);
    }
}

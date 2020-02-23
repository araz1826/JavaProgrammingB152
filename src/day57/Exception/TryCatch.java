package day57.Exception;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("before try catch");

        try{
            int result=10/0;
            System.out.println("after 10/0 line"); // will skip this because an error
        }catch (ArithmeticException e){ // you can put the PARENT class exception here
            System.out.println("exception happened and handeled");
        }
        System.out.println("after try catch");


        try{
            System.out.println("in second try block");
            String str="java is fun";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));  //StringBound exceptions

        }catch (Exception e){
            System.out.println("exception happened and handeled");
        }
        System.out.println("after second try catch");
    }
}

















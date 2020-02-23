package day58.Exception;
//Thread.sleep just pauses the application then continues after certain time,

//There are 2 CHECKED EXCEPTIONS
//1. HANDLE: TRY CATCH     or   2.DECLARE: throws Exception  ex: public static void main(String[] args) throws Exception {
//Finally: code will run if there is any exceptions or not

//The Heap Space contains all objects are created, but Stack contains any reference to those objects.
//stack memory is used to store local variables but heap memory is used to store objects in Java.

//INTERVIEW: how do I programatically trhow exceptions myself?  we use THROW keyword followed by excp. object EX: throw e2;
public class CheckedExceptionDemo {
    public static void main(String[] args)  {
        System.out.println("checked exception in next line");
        //Thread.sleep(1000);// 1000 milli second = 1 second (it means that pause for 1 sec)
        System.out.println("java");
        //Thread.sleep(5000); wait for 5 sec then running

        try{
            Thread.sleep(3000); // line throw a checked exception: must be handeled

        }catch (Exception e){
            System.out.println("exception handled");
        }
        System.out.println(" after thread.sleep");
    }

}

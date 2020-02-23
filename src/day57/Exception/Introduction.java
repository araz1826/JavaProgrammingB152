package day57.Exception;
 //Exceptions: that disrupts the normal flow of the program's instructions
public class Introduction {
//INTERVIEW QUESTIONS: what kind of exception you throw? usually ARITHMETIC eceptions.  ex:  int a=10/0;
        // Arithmetic exceptions are class in java, during run time error object is created out of this class and thrown and cause to program stop
    //STACK TRACE: exception message druing the runtime is called stack trace

    //THROWABLE: parent class of all exceptions in Java

    //EXCEPTIONS has 2 types:
    // 1.checked exceptions: compile time, java knows and gives u error(must handled or declared otherwise code will not be compile).
    // 2.Unchecked exceptions: during runtime

    //how to handle the EXCEPTIONS:
    //try and catch blocks

     //WHY WE SUE MULTI CATCH: because you want to catch very specific exception,
     //THROW VS THROWS (declaring): throws is to document something,
            //throws: ex:  public static void main(String[] args) throws InterruptedException { , you can put multiple exceptions after throws, with comma(,) sign
            // throw:  ex: it throw the exception to the run time, it can throw anything is throwable

    public static void main(String[] args) {
        System.out.println("araz");
        String str="aynar";
        //System.out.println(str.charAt(10)); // NO compile error, but RUN time error (happens when u run it)
        //exceptions are object that has been created during error run time.
        //int num=2.5; compile error
        int [] nums=new int[3];
        nums[0]=23;
        nums[33]=40;// runtime exception error... thrown exception
              try{
            String str1="aynar";
            System.out.println(str.charAt(10));
        }catch (Exception e){
            System.out.println("exception error try again");
        }


    }
}

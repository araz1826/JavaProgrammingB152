package day47FinalClassEXPLANATION;

public  class Sport{
    //each class have a super class like OBJECT but not visible
    //public class Sport  extends Object{

//you can not extend the final class like below
    /*public final class Sport{
        public class ExtremeSport extends Sport {
    }*/
    public  void doSomething(){
        System.out.println("doing regular sport");
    }
    public final void doSomethingElse(){ // you can still it but no override
        System.out.println("something else");

    }

}
//FINAL class: WHY DO I NEED IT: because its needed as its.
            //it just lock the doors
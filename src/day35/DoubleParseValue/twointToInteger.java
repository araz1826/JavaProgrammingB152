package day35.DoubleParseValue;

public class twointToInteger {
    public static void main(String[] args) {

        int b=12;  //this is an int value
        Integer c=12; //this is an object
        Integer d=new Integer(12); // this is an object

        Integer num1=100; //auto boxing, 100 become new Interger(100)  num1 is a object has has action. when you put dot next to it you will see methods are coming
        int num2=Integer.valueOf("100"); //auto unboxing into 200

                                                                    //Maybe INTERVIEW
        String caseNumber="IPR2012-00001";  // How to get year 2012 out of string. code always starts with 3 digit codes then year

       String stryear=caseNumber.substring(3,7);
       int year=Integer.parseInt(stryear);
        System.out.println(year);

        //or
        System.out.println(Integer.parseInt(caseNumber.substring(3,7)));

        System.out.println(getYear("ara2012-001"));

    }
    public static int getYear(String caseNumber){                           //this is how you type in return type
        return Integer.parseInt(caseNumber.substring(3,7));
    }
}

package day35.DoubleParseValue;
                                       //All waraper classes are static method
public class oneWrapperIntroduction {
    public static void main(String[] args) {  // each primitive types have one corresponding wrapper classes
                                        // we create wrapper clases to represent the primitive types,, All are Uppercase

        Short s1= new Short("123");
        Short s2= new Short((short)123);

        Integer s3= new Integer(123);  // it means old way, it is deprecated (line on it). but nothing wrong, use Value of method

        Integer s4= Integer.valueOf(123);    // this is a easy way,  VALUEOF method
        Integer s5= Integer.valueOf("123");

        Boolean s=Boolean.valueOf("true");
        Boolean s6=Boolean.valueOf(true);

        int x=10;
        Integer num1=Integer.valueOf(10);   // this is Integer object, not int value. DIFFERENT THAN parsInt. Parst int in int value
        Integer num2=Integer.valueOf("10"); //basically this turn Integer object to integer value

        Float a= new Float("2.13");
        Float b= new Float(3.12f);  //Note: It is a static method because after a or b put dot you will seee methods


        float value=Float.parseFloat("3.15");    // how to turn String value into Float value
        //Float value1=Float.valueOf(3.15); // this is not the way you turn into float value. this is turn in to float object
        System.out.println(value);
        System.out.println();


    }
}

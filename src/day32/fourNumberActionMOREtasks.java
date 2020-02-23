package day32;

public class fourNumberActionMOREtasks {
    public static void main(String[] args) {
        numberComparision(3,3);
        stringrepeater("i love java", 5);
        skipcountigby3from0to50();
        countdownbyEvenNumberFrom50to10();
        print1toX(10);
    }

    public static void numberComparision(int num1, int num2){        //create a static void method; numbercomparision, has 2 parameters called num1 and num2
                                                                      // if num1>num2 print out or opposite  or equals
        if(num1>num2){
            System.out.print(num1 +" is greater than "+num2);
        }else if(num2>num1){
            System.out.print(num2 +" is greater than "+num1);
        }else{
            System.out.print("they are equal");
        }

    }

    public static void stringrepeater(String repeat , int count){        // repeat the word as number of count, count and word will be added on main method

        for(int a=0; a<count; a++){
            System.out.print(repeat);
        }

    }
    public static void skipcountigby3from0to50(){
        for(int a=0; a<=50; a+=3){
            System.out.print(a+" ");
        }

    }
    public static void countdownbyEvenNumberFrom50to10(){
        for(int a=50; a>=10; a--){
            if(a%2==0){
                System.out.print(a+" ");
            }
        }

    }
    public static void print1toX(int x){   //count from 1 to int number x
       for(int a=1; a<=x; a++){
           System.out.print(a+" ");
       }
    }
}
/* * Create static void methods as below
 *
 * numberComparision
 * this method has 2 parameters called num1 and num2
 * if num1 is more than num2 print num1 is more than num2
 * if num2 is more than num1 print num2 is more than num1
 * if num2 are equals num1 print they are equal
 *
 * String repeater
 * this method has 2 parameters
 *     String strToRepeat and int count
 *    repeat printing the string as many time as <count> number define
 *
 * skipCountBy3From0to50
 *
 * * create a method that has no parameter
 * and skip count by 3 from 0 to 50
 *
 * countDownByEvenNumberFrom50to0
 * * create a method that has no parameter
 * and count Down By Even Number From 50 to 0
 * for example 50 , 48 , 46 .....0
 *
 * print1toX
 * * create a method that has 1 int parameter called x
 * print from 1 to that number in one line
 * print an empty line after the print.
 *
 *
 */
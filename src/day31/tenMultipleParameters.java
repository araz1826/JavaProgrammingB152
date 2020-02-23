package day31;

public class tenMultipleParameters {   // create a method add 2 numbers with CHAR, then calculate.
    public static void main(String[]  args){
       calculator('*',2,3);  // put the thing inside in order matter, in sequaltial order that you put in parameters () below

    }
    public static void calculator(char operator, int num1, int num2){  //


        switch(operator){   ////it can be +,*,/,-
            case '+':
                System.out.println("addition result "+ (num1+num2));
                break;
            case '-':
                System.out.println("subtraction result "+ (num1-num2));
                break;
            case '*':
                System.out.println("addition result "+ (num1*num2));
                break;
            case '/':
                System.out.println("addition result "+ (num1/num2));
                break;
            default:
                System.out.println("invalid char");
        }
    }
}

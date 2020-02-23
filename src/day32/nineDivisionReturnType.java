package day32;

public class nineDivisionReturnType {
    public static void main(String[] args) {   // division but number divide by ZERO is UNDEFINED and will print out Inifinty

        System.out.println(division(6,0));
    }
    public static double division(double a, double b){    // in order to print NO INFINITY put if condition
        if(b==0){
         return 0;
        }else{
            return a/b;
        }


    }              //SeniorCitizenChecker


}

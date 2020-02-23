package day34;  //what is MethodOverloading: using the same method name for with type of parameters INTERVIEW questions
                                              //overloading method: method reusability with different parameters
                            //Basically you have another method that represents the same method with different parameters

//Method Signature: is method name +parameters list. Method overloading only care about Method signature
//Note: We do not have to import aything from Java.lang class.

public class WarmupINTERVIEW {                                // write a method  has 3 parameters int a,b,c. it will return
                                                                // 3 digit number , digits agre etween 0-9, otherwise return to 0
    public static void main(String[] args) {

        System.out.println(digitcaller(3,-1,6));
        int result1= digitcaller(6,4,0);
        int result2=digitcaller(6,14,0);
        System.out.println(result1+result2);                    //if you want to find the sum of top two operation

         }

        public static int digitcaller(int a, int b, int c ){
        if(a<0 || a>9){
            a=0;
        } else if(b<0 || b>9) {
            b = 0;
        } else if(c<0 || c>9) {
            c = 0;
        } else{

        }
        return a*100+b*10+c;
    }

}

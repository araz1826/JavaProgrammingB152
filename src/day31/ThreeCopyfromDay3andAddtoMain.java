package day31;

public class ThreeCopyfromDay3andAddtoMain {

        public static void main(String[] args) {
        day3();     // you do not need println
        // or alternatively --- CopyfromDay3andAddtoMain.day3()

            calculator();
            // or  CopyfromDay3andAddtoMain.calculator();

            // you can call static method from other classes

            TwoMethodIntro.sayHello();  // you can call from other class with its classname and method together, previous class

    }
    public static void day3(){      //you create a method
        // 3 print line statement
        System.out.println("Hello world line 1 ");
        System.out.println("Hello world line 2 ");
        System.out.println("Hello world line 3 ");
// 2 print statement
        System.out.print("Hello world line 4 ");
        System.out.print("Hello world line 5 ");
// 2 print line statement
        System.out.println("Hello world line 6 ");
        System.out.println("Hello world line 7 ");
    }

    public static void calculator(){   //you create a method
        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f;
        double result1 = num1 + num2;
        double result2 = num1 - num2;
        double result3 = num1 * num2;
        double result4 = num1 / num2;
        float result5 = num1 / num3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}

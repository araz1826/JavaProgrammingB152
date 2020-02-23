package day34;

import day31.eightSeasonChecker;

import java.util.Arrays;
                                                                // ctrl + shift+I= takes you that class you want to see in after highlited
// callling the static methods of other classes
                                                            //( double shift is for search, and split vertically is see both at the same time)
public class oneCallingOtherClasses {
    public static void main(String[] args) {
        //call your task we solved during warmup.  //Note:Class Name then Method name. HOVER OVER you will see from import option

        /*int result1= digitcaller(6,4,0);
        int result2= digitcaller(6,14,0);
        System.out.println(result1+result2);*/

        int result1= WarmupINTERVIEW.digitcaller(6,4,0);   //WarmupInterview is Class, and digitCaller is method
        int result2= WarmupINTERVIEW.digitcaller(6,14,0);
        System.out.println(result1+result2);

        // in order to call array class, either import java.util. package or in order to call
        // static method we need classname.methodname(like above). such as: Arrays.toString
        int [] nums={2,3,4,5};
        System.out.println(Arrays.toString(nums));

        //Exampple. how to call static method  called calculate in Calculator under day 31

        eightSeasonChecker.decideSeasonAction("summer"); //use double shift and split vertically to see it better
     //// ctrl + shift+I= takes you that class you want to see in after highlited (decideSeasonAction)

    }
}

package day35.DoubleParseValue;

public class WarpumDefinations {
    public static void main(String[] args) {  //store String to int.  parseInt method takes String and turned into int

        String str="100";                //parseInt. turn string to int
        int num=Integer.parseInt(str);
        System.out.println("number"+num);

       // String str1="FB-15";
        //int num1=Integer.parseInt(str1);   // does not work for this one, it works only for NUMBERS.
        //.out.println(num1);

        String name="FB-15";                        //get the number out of string, INTERVIEW questions
        String [] splitter= name.split("-");
        String adstring=splitter[1];
        int number=Integer.parseInt(adstring);
        System.out.println(number);

        String twoNumbers="100,600"; // add them numerically, these are string
        String[] splitter1= twoNumbers.split(",");
        String part1=splitter1[0];
        String part2=splitter1[1];
        int num1=Integer.parseInt(part1);   // this give you int, valueof give you Integer
        int num2= Integer.parseInt(part2);
        System.out.println(num1+num2);


        /*String twoNumbers="100,600";
        int num1=Integer.parseInt(twoNumbers.split(",")[0]);  //shortcut solution
        int num2=Integer.parseInt(twoNumbers.split(",")[1]);
        int sum=num1+num2;*/


    }

}

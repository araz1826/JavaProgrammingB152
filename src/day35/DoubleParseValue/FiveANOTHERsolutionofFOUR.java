package day35.DoubleParseValue;
                                                         //INTERVIEW QUESTION
public class FiveANOTHERsolutionofFOUR {
    public static void main(String[] args) {
          //if string contain number add them if not zero and make a method

        sum("abc123");

    }
    public static void sum(String name){
        String any="";
        for(int a=0; a<name.length(); a++){
            if(Character.isDigit(name.charAt(a))){
                any+=name.charAt(a);      //these are character



            }
        }
        System.out.println(any);
        int num=Integer.parseInt(any);   // turn  char to int
        //System.out.println(num);


        int sum=0;
        for(int a=0; a<any.length(); a++){
            sum+=Integer.parseInt(any.substring(a,a+1));


        }
        System.out.println(sum);

    }
}
//another solution
/*public static int sumOfNumberInString(String str){
        String num="";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i)))
            num+=str.charAt(i);
        }
        String [] numArr=num.split("");
        int sum=0;
        for (int i = 0; i <numArr.length ; i++) {
            sum+=Integer.parseInt(numArr[i]);
        }
        return sum;
    }
}*/
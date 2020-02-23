package day35.DoubleParseValue;

public class fourCharacterStoreIntoINTINTERVIEW {
    public static void main(String[] args) {    //isDIGIT method
        //character class lots of static methods(this means when you put dot it pulls all static methods)

        System.out.println(Character.isDigit('A'));  // it gives you false because A is not a number "isDigit only recognize numbers"
        System.out.println(Character.isDigit(' '));  //false
        System.out.println(Character.isDigit('6'));  //true

        String str="A34B123C4X";  //TASK: get the numbers out of this and store into int object

        String result="";
        for(int a=0; a<str.length();a++){
            //System.out.println(" all letters "+ a+ ":"+ str.charAt(a));
            if(Character.isDigit(str.charAt(a))){     //this only prints out numbers not letters
                //System.out.println(" all letters "+ a+ ":"+ str.charAt(a));
                result+=str.charAt(a);
            }
        }
        System.out.println(result);

        Integer num=Integer.valueOf(result);
        System.out.println(num);



    }
}

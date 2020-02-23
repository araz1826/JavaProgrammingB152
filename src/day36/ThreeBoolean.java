package day36;

public class ThreeBoolean {
    public static void main(String[] args) { //create a static method accept a String and Return Boolean.
                                        //return true if String includes at least 1 number,

Boolean result=checkString("araz123abc");
        System.out.println(result); //return true

        Boolean result2=checkString("hasanismayil");
        System.out.println(result2); //return false

    }
    public static Boolean checkString(String str){
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                return  Boolean.valueOf(true);
            }

            }

        return Boolean.valueOf(false);    //always put else after for loop
    }


}

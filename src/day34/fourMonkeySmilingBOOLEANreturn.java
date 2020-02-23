package day34;

public class fourMonkeySmilingBOOLEANreturn {     //if both are true or false, I mean same   //Interview questions  think?
    public static void main(String[] args) {    // method return true only if both  monkeys are smiling or not smiling

        System.out.println(monkeySmiling(true, true));
        System.out.println(monkeyTrouble(true, false));

    }
    public static boolean monkeySmiling(boolean aSmile, boolean bSmile ){
        if( (aSmile && bSmile) || (!aSmile&&!bSmile)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean monkey1Trouble(boolean aSmile, boolean bSmile) {  //another solution
        if(aSmile && bSmile){
            return true;
        } else if( !aSmile && !bSmile ){
            return true;
        } else {
            return false;
        }
    }
    public static String monkeyTrouble(boolean aSmile, boolean bSmile){     //with string return method
        if( (aSmile && bSmile) || (!aSmile&&!bSmile)){
            return "yes";
        }else{
           return "no";
        }
    }
    public String frontTimes(String str, int n) {
        return str.substring(0,3)+str.substring(0,3);


    }
}

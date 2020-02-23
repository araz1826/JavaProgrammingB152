package day14;

public class JavaPasswordPractice {
    public static void main(String[] args) {
        String  password ="Abaz_1826@";
boolean min8max16 = password.length()>=8 && password.length()<=16;

boolean mustcontain_$= password.contains("_") ||password.contains("$");

boolean nospace = ! password.contains(" ");
boolean startaswithAb= password.startsWith("Ab");



            if(min8max16 && mustcontain_$ && nospace && startaswithAb){
                System.out.println("valid");
            } else{
                System.out.println("invalid");
            }



    }
}

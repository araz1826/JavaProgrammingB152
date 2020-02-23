package day19.day17;

public class StringPhoneAlexander {
    public static void main(String[] args) {
        String  name = "Alexander";

        int x=0;
        int len = name.length();
        while(x<len){

            System.out.println(name.charAt(x));
            x++;
        }
    }
}

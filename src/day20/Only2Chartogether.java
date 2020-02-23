package day20;

public class Only2Chartogether {
    public static void main(String[] args) {

       String name="Ismayilo";
       for(int a=0; a<name.length(); a++){
           System.out.println(name.substring(a,a+2));
           a++;
       }
    }
}

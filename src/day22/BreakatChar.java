package day22;

public class BreakatChar {
    public static void main(String[] args) {
        String name="my name is araz";


        for(int a=0; a<name.length(); a++){

            if(name.substring(a,a+1).equalsIgnoreCase("a")){
                break;
            }
            System.out.print(name.charAt(a));
        }
    }
}

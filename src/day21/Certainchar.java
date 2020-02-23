package day21;

public class Certainchar {
    public static void main(String[] args) {
        String name="arazb";
        for(int a= 0; a<name.length(); a++) {

            String currentChar= name.substring(a,a+1);
            if(currentChar.equalsIgnoreCase("b")){
                break;
            }
            System.out.println(currentChar);
        }
    }
}

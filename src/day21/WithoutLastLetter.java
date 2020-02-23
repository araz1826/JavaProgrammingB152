package day21;

public class WithoutLastLetter {
    public static void main(String[] args) {
        String name="arazb";
        for(int a= 0; a<name.length(); a++){
            if(name.substring(a,a+1).equalsIgnoreCase("b")){
                break;
            }
            System.out.println(name.charAt(a));
        }
    }
}

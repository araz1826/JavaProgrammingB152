package day21;

public class ExitbeforeLetter {
    public static void main(String[] args) {
        String name="arazarazb";
        for(int a= 0; a<name.length(); a++) {
            String current =name.substring(a,a+1);

            if(current.equalsIgnoreCase("b")){
                break;
            }
            System.out.println(current);
        }
    }
}

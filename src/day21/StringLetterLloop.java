package day21;

public class StringLetterLloop {
    public static void main(String[] args) {
        //exit before b
        String name="arazb";
        for(int a= 0; a<name.length(); a++){

            if(name.charAt(a)=='b'){
                System.out.println("found it");
                break;
            }
            System.out.println(name.charAt(a));
        }

    }
}

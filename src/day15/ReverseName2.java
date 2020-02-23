package day15;

public class ReverseName2 {
    public static void main(String[] args){
        String name = "araz Ismayilov isa oglu";
        int len =name.length();

        for(int a=len-1; a>=0; a--){
            System.out.print(name.charAt(a));
        }


    }
}

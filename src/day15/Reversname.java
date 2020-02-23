package day15;

public class Reversname {
    public static void main(String[] args) {
        String name ="Araz";

        int len = name.length();


        for(int a= len-1; a>=0; a--){
            System.out.print(name.charAt(a));


        }
    }
}

package day19.day17;

public class ReversWhile {
    public static void main(String[] args) {
        String name = "araz";
        int len = name.length();
        while(len>0){
            len--;
            System.out.print(name.charAt(len));

        }
    }
}

package day19.day17;

public class ReverseName {
    public static void main(String[] args) {
        String name ="araz";
        int len = name.length();

        for(int a = len-1 ; a>=0; a--){
            System.out.println(name.charAt(a));
        }

    }
}

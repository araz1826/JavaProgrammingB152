package day12;

public class WarmupTask3 {
    public static void main(String[] args) {
        int num =34;
        if(num%5==0 && num%3==0){
            System.out.println("FizzNumber");
        }else if (num%5==0){
            System.out.println("Buzz number");
        }else if (num%3==0){
            System.out.println("FizZ Number");
        }else {
            System.out.println("not my number");
        }
    }
}

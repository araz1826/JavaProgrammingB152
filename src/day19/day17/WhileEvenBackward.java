package day19.day17;

public class WhileEvenBackward {
    public static void main(String[] args) {
        int x=100;
        while(x>0){
            x--;
            if(x%2==0){
                System.out.print(x+ ",");
            }
        }
    }
}

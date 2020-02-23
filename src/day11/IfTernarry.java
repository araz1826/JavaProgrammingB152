package day11;

public class IfTernarry {
    public static void main(String[] args) {
        int score = 95;
        if(score >70){
            System.out.println("you have passed");
            if(score >80){
                System.out.println("good score");
                if(score >90){
                    System.out.println("perfect score");
                }
            }
        }else{
            System.out.println("failed");
        }
    }
}

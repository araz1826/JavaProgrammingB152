package day11;

public class IfTernary {
    public static void main(String[] args) {
       int x = 7;

       if(x >4 || x>2 || x<6){
           System.out.println("correct");
       } else if(x >4 && x>2 && x>3){
           System.out.println("perfect");
       } else {
           System.out.println("no");
       }
    }
}

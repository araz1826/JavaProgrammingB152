package day19.day17;

public class EvenOddLoop {
    public static void main(String[] args) {
      int x=0;
      while(x<50){
          x++;
          if(x%2==0){
              System.out.println(x + " even number");
          }else{
              System.out.println(x+ " odd number");
          }

      }

    }
}

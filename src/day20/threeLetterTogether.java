package day20;

public class threeLetterTogether {
    public static void main(String[] args) {
      String name= "ismayilov";
      for(int a=0; a<name.length()-1; a++){
          System.out.println(name.substring(a,a+3));
      }
    }
}

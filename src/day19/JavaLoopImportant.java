package day19;

public class JavaLoopImportant {
    public static void main(String[] args) {
        int counter=0;
        for(int a=1; a<=100; a++){
            if(a%15==0){
                System.out.print(a+ ",");
                ++counter;
            }
        }
        System.out.println("counter: " + counter);
    }
}

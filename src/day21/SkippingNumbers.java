package day21;

public class SkippingNumbers {
    public static void main(String[] args) {
        for(int x=0; x<=100; x++) {
            if(x%5==0){
                System.out.println("skipped: "+x);
                continue;

            }

            System.out.println(x);
        }
}
}

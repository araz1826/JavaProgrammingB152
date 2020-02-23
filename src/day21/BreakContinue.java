package day21;

public class BreakContinue {
    public static void main(String[] args) {
        //exit before 40usd
        int sum=0;
        for(int i=1; i<=10;i++) {

            sum=sum+i;
            System.out.println(sum);
            if(sum+i>40){

            break;

            }
           sum=sum+i;
        }
        System.out.println(sum);

    }
}


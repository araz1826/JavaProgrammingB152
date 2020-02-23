package All.Important.Together;

public class OddAndEvenSumCount {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int x=0; x<=100; x++){
            if(x%2==0){
                System.out.print(x+ ", ");
                sum =sum+x;
                count++;


            }


    }
        System.out.println();
        System.out.println(sum);
        System.out.println(count);
    }
}

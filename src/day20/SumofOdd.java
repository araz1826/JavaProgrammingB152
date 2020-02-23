package day20;

public class SumofOdd {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for(int a=10; a<=100; a++ ){
            if(a%2!=0){
                sum=sum+a;

                count+=1;
            } else{
                sum=sum+a;
            }
        }
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(count);
    }

}

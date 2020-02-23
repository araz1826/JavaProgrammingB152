package day21;

public class Max10Usd {
    public static void main(String[] args) {
        int sum=0;
        for (int a=0; a<=10; a++){
            sum =sum+a;
            System.out.println(sum);
            if(sum+a>16){
                break;
            }
        }
        System.out.println(sum);
    }

}

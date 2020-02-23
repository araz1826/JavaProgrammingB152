package day08;

public class ternaryPractice {
    public static void main(String[] args) {

        int bill =1200;
        int quantity =10;
        int discount =15;



        if(bill > 1000){
            if(quantity>9){
                discount=10;
            }else{
                discount = 9;
            }
        }else{
            discount =5;
        }
}
}

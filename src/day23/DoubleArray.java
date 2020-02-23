package day23;

public class DoubleArray {
    public static void main(String[] args) {
        double[] prices={99.23,11.99, 100.23, 99.99,56.23};
        for(int a=0; a<prices.length; a++){
            System.out.println("each price: "+prices[a]);

        }
        System.out.println();
        for(double item:prices){

            System.out.println("prices:"+item);
        }

    }
}

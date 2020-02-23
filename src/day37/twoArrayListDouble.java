package day37;

import com.sun.source.tree.UsesTree;

import java.util.*;

public class twoArrayListDouble {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        priceList.set(2,10.0);          //update 3rd item to 10
        priceList.set(0,priceList.get(0)+4);    //add 4 to 1st item
        priceList.set(priceList.size()-1,priceList.get(0)+priceList.get(1));  //update last item to sum of 1st and 2nd
        priceList.set(1,priceList.get(1)*0.4); //update 2nd item 60% off
        System.out.println(priceList);

        for (int i = 0; i <priceList.size() ; i++) {                    //How to double the each number
            System.out.print(priceList.set(i, (priceList.get(i)*2))+",");

        }
        System.out.println("**********************");
                                        // cut the price half if the price is more than 20 usd
        for (int i = 0; i <priceList.size() ; i++) {
            if(priceList.get(i)>20){
                System.out.print(priceList.set(i, priceList.get(i)/2)+",");
            }

        }
        System.out.println("\t*********");
                                                // swap last with first value
        double temp=priceList.get(priceList.size()-1);
            priceList.set(priceList.size()-1, priceList.get(0));
        priceList.set(0,temp);
        System.out.println(priceList);

    }
}

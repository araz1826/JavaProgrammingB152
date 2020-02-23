package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitClass_1 {
    public static class day39 {                                    //get each item in the arraylist with for and foreach loop
        public static void main(String[] args) {
            ArrayList<String> productLst = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                    "iPhone 6s Plus,549,22.88",     //(brand price and monthly payment)
                    "iPhone X,1149,56.16",
                    "MacbookPro,1499.99,79.49",
                    "ThumbDrive,39.99,2.68",
                    "Beats HeadPhones,349.99,15.12",
                    "Mouse,79.99,8.98",
                    "Charger,39.99,4.56",
                    "iPad,429,18.31",
                    "Dyson Vacuum,399,16.25",
                    "TV,2199,89.49",
                    "Apple Watch,559,21.18"));

            String product="Iphone 6s";   //split the item with space and convert to Parse Double

            System.out.println(product.split(" ")[0]);
            System.out.println(product.split(" ")[1]);


            for ( String eachproduct: productLst) {
                String namePart= eachproduct.split(" ")[0];   //get each name of each item in the list
                System.out.println(namePart);
            }

            for (int i = 0; i <productLst.size() ; i++) {
                String namePart=productLst.get(i).split(" ")[0];// get each item in the array list
                System.out.println("each namePart = " + namePart);
            }
            for (String eachProduct: productLst) {             //print all the prices more than 500
               double price=Double.parseDouble(eachProduct.split(",")[1]); //you can use parseDouble too,
               if(price>500){
                   System.out.println("price = " + price);
               }

            }
                                                    //print the average price
            double sum=0;
            double average=0;
            for (String eachProduct: productLst) {
                double price=Double.parseDouble(eachProduct.split(",")[1]);
                sum+=price;

            }
            average=sum/productLst.size();
            System.out.println("sum"+sum);
            System.out.println("average = " + average);

                                                  //print the items has less tha 20$ monthly payment
            for (String eachProduct: productLst) {
                double monthly=Double.parseDouble(eachProduct.split(",")[2]);
                if(monthly<20){
                    System.out.println("monthly = " + monthly);
                }

            }
                                                //print all the iphones

            for (String eachProduct: productLst) {
            String name=eachProduct.split(",")[0];
                if(name.contains("iphone")){
                    System.out.println("Iphone name = " + name);
                }

            }
                                                                       //most expensive number  and details
            double max=Double.parseDouble(productLst.get(0).split(",")[1]);

            for (String eachProduct: productLst) {
                double price=Double.parseDouble(eachProduct.split(",")[1]);
                if(price>max){
                    max=price;
                }
        }
            System.out.println("Max price = " + max);

            int maxIndex=0;
            double max1=Double.parseDouble(productLst.get(0).split(",")[1]);  //location of max price and max price
            for (int i = 0; i <productLst.size() ; i++) {
                double price=Double.parseDouble(productLst.get(i).split(",")[1]); //this is how to get each price out
                if(price>max){
                    max=price;
                    maxIndex=i;

                }

            }
            System.out.println("max1 = " + max1);
            System.out.println("maxIndex"+maxIndex);
            System.out.println("details of index"+ productLst.get(maxIndex));

            System.out.println("index of that item"+ productLst.indexOf(max1));


                                                                          //update DYSON price to 80%

            for (int i = 0; i <productLst.size() ; i++) {

               double price=Double.parseDouble(productLst.get(i).split(",")[1]);
               if(productLst.get(i).startsWith("Dyson")){   //OR productLst.get(i).split(",")[0].contains("Dyson")
                   price=price*0.2;

                   System.out.println("price 80 % off= " + price);
               }
            }
                                                                    // count the items more than average items

            int count=0;
            for (String eachProduct: productLst) {
                double price=Double.parseDouble(eachProduct.split(",")[1]);
                if(price>average){
                    count++;
                }

            }
            System.out.println("count = " + count);

                                                    // remove all the item with price more tahn averga price

            for (int i = 0; i <productLst.size() ; i++) {
                double price=Double.parseDouble(productLst.get(i).split(",")[1]);
                if(price>average){
                    productLst.remove(i);
                    --i;// we do this beacuse we have to go back to start again
                }

            }
             //  * Create 3 more ArrayList objects to separately store
    //         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :




    }
    }
}

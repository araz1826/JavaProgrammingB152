package day56MIX_TASK;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {

        List<Product> productList=new ArrayList<>();
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Sumsung 10", 499) ) ;

        System.out.println("product lise size "+productList.size()); //size

        //check wheter I have a sony TV  with price 499
        boolean result=false;
        for(Product each: productList){
           if(each.getName().equals("Sony TV") && each.getPrice()==499){
                result=true;

                //if(each.equals(new Product("Sony TV", 499) )); you can also do that
                 // result=true;
            }
        }

        System.out.println("has sony th with price 499 or not : "+result);

        boolean result2= productList.contains(new Product("Sony TV", 499) ); // you can also do that
        System.out.println("result 2: "+result2);
        System.out.println(productList.indexOf(new Product("Sont tv", 399)));

        


    }

}

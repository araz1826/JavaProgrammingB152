package day24;

public class WarmupArrayFruits {
    public static void main(String[] args) {
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};
        for( String fruits: groceryItems){
            System.out.print(fruits+ " ");
        } // print out only odd index and index together
        System.out.println();
        for(int a=0; a<groceryItems.length;a++){
            if(a%2==1){
                System.out.println(groceryItems[a]+""+a);

            }
        }//reverse order
        for(int a=groceryItems.length-1; a>=0;a--){
            System.out.print(groceryItems[a]+" ");

        }// find idex location of strawberry
        for(int a=0; a<groceryItems.length;a++){
           if(groceryItems[a].equals("strawberry")){
               System.out.println("index of strawberry"+a);
           }

        }//contains berry, count it
        int count=0;
        for(int a=0; a<groceryItems.length;a++){
            if(groceryItems[a].contains("berry")){
                count++;
            }
        }
        System.out.println(count);
    }
}

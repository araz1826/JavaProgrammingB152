package day13;



public class NestedIf {
    public static void main(String[] args) {
        boolean doYouWantToShop = true;
        String preference ="Store";

        if (doYouWantToShop == true){

            if(preference.equalsIgnoreCase("Store")){
                System.out.println("going to store for shopping");
            } else{
                System.out.println("going to online for shopping");
            }

        }else{
            System.out.println("Good job stay home coding");
        }
    }
}

package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carBrand="corolla";
        int carPrice =45000;
        int budget = 40000;

        if(carBrand.equals("corolla") && carBrand.equals("tesla") && carPrice<=budget){
            System.out.println("Car acquired");
        }else{
            System.out.println("This not I am looking for");
        }
    }
}

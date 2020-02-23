package day45;

public class Electronic {
    String brand;
    static boolean useElectricty=true;

    public void showBrand(){
        System.out.println("brand: "+brand); // brand belongs to all beacuse it is not a static
    }
    public static void displayElectricity(){
        System.out.println("use electricity: "+useElectricty); // since it is static it only belogs to static
    }
}

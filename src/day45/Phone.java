package day45;

public class Phone extends Electronic{

    double size;
    double price;


    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.size=12;
        p1.price=399;
        p1.brand="apple";

        System.out.println(Electronic.useElectricty); //is it static you do not have to create a object. classname+varibale

        //sub class inherit everyfield, like below
        System.out.println(Phone.useElectricty);// subclass can inherit all instance and static method

        p1.showBrand();
        displayElectricity();// static method call directly
        Phone.displayElectricity(); // with above class since it was inherited
        Electronic.displayElectricity(); //

    }

}

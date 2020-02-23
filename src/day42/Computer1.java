package day42;

public class Computer1 {
    //Attriutes: Instance field/variable
    private String brand;
    private int ram;//between 1-128
    private double price;

    //behaviors: runProgram---> print brand is running program in the ram (size)

    // calculate---> brand is calculationg
    //add getters an setter all the field

    // ram is between 1-128, price not less than 20
    //add toString method

public void runProgram(){

    System.out.println(this.brand+" is running program with ram size "+ram);
}
public void calculate(){
    System.out.println(brand+" is calculating");

}
    public String getBrand() {

    return brand;
    }

    public void setBrand(String brand) {

    this.brand = brand;
    }

    public int getRam() {

    return ram;
    }

    public void setRam(int ram) {
       if(ram>0 && ram<129){
           this.ram=ram;
       }
    }
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price) {
      if(price>20){
          this.price=price;
      }
    }
    public String toString()
    {
        return "brand: "+ brand+" ram: "+ram+" price: "+price;
    }
}

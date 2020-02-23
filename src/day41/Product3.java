package day41;

public class Product3 {
    //encapsulate your product nobody can have access, make it private
//provide public getter and setter
    private String name;
    private double price;

    public String getName(){
        return name;

    }
    public void setName(String newName){
        name=newName;

    }
    public double getPrice(){
        return price;
    }
    //if newprice is more than 1 then set the price
    public void setPrice(double newPrice){
        if(newPrice>1){
            price=newPrice;
        }
    }
    public String toString(){
        return "name: "+ name+ " price: "+price;
    }
    //THIS method

    //public void setName(String name) {
        //this.name = name;
   // }  this.name means that we talk about the name in
        //instance variable.

    //public double getPrice(){
    //        return this.price;
}
//NOTE, click right, then get generate then getter setter then chooose all
//will print all
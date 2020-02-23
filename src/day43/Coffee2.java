package day43;

import jdk.swing.interop.SwingInterOpUtils;

public class Coffee2 {
    private String type;
    private int caffeineLevel;
    private double price;
    //create 3 args constructor
    //do not let the price go below zero,
    //if it is less than zero make it 1$
    public Coffee2() {
        System.out.println("no arg constructor");

    }

    public Coffee2(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructor");
    }

    public Coffee2(String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        // only set the value if the price is valid
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 1;
        }
        System.out.println("3 args constructor");
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getCaffeineLevel()
    {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {

        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price) {
        //
        this.price = price;
    }
}
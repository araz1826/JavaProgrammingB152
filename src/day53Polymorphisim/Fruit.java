package day53Polymorphisim;

public abstract class Fruit {// make your fruit abstract

    String taste;
    String color;

    public Fruit(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }
    public abstract void getdigested(); // abstract class does not have body


}


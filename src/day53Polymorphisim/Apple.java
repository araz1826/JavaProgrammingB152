package day53Polymorphisim;

public class Apple extends Fruit {
    String type;

    public Apple(String sweet, String taste, String color) {

        super(taste, color);
        this.type=type;
    }

    @Override
    public void getdigested() {
        System.out.println(type+" apple is "+color+" color "+
                                   " and it has "+ taste+ " when u eat");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

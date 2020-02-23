package day53Polymorphisim;

public class Orange extends Fruit {
    int vcLevel;

    public Orange(String taste, String color, int i) {
       super(taste, color);
       this.vcLevel=vcLevel;
    }

    @Override
    public void getdigested() {
        System.out.println(" Orange vitamin c level "+vcLevel+" color "+ color+
                " and it has "+ taste+ " when u eat");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

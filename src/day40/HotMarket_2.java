package day40;

public class HotMarket_2 {
    public static void main(String[] args) {

        ScapeShip_2 s1 = new ScapeShip_2();
        s1.name = "Orville";

        s1.setInitialPosition(1, 5);
        s1.setDirection("up");
        s1.move1Block();
        System.out.println("s1 " + s1);

        s1.setDirection("left");
        s1.move1Block();

        System.out.println("s1 " + s1);


    }
}

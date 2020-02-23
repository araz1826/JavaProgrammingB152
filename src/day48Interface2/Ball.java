package day48Interface2;

public class Ball implements Bouncable{
    String shape;
    String color;

    public void bounce(){
        System.out.println("ball is bouncing"+
                shape+color+GRAVITY);

    }

    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}

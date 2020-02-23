package day48Interface2;

public class Kangroo implements Bouncable,BoxerWithBellyPouch {  //HOW to interface more tahn 1 class
    String name;
    int JumpDistance;

    @Override
    public void box(){
        System.out.println("kangroo with name"+name);

    }
    @Override
    public  void CarryChildinThePocket(){
        System.out.println("kangroo with me"+name+"carry chold");

    }

    public void bounce(){
        System.out.println("kangroo is bouncing");
    }

    public Kangroo(String name, int jumpDistance) {
        this.name = name;
        JumpDistance = jumpDistance;
    }

    @Override
    public String toString() {
        return "Kangroo{" +
                "name='" + name + '\'' +
                ", JumpDistance=" + JumpDistance +
                '}';
    }
    public void eat(){
        System.out.println("Kangroo eat grass");
    }

}

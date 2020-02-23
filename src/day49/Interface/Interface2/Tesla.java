package day49.Interface.Interface2;

public class Tesla extends Vehicle implements Autonomous{
    int horsePower;
    String model;


    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    public Tesla(int i, String c1) {
        super(2019);
    }

    @Override
    public void start(){
        System.out.println("car starts");
    }
    @Override
    public void goForward(){
        System.out.println("tesla go forward");

    }
    public void selfDrive(){
        System.out.println("self Drive"+model);
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

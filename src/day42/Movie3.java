package day42;

public class Movie3 {

    //create a costructor and to set all the fields value.. create a movie object, it means
    private String name;
    private double length;
    private String type;

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public Movie3(){
        System.out.println("empty movie");
    }

    public Movie3(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }
    public String toString(){
        return "name: "+name+" length: "+length+" type: "+type;
    }
}

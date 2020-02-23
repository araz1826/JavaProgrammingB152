package day44;
                       //Important see String species below
public class Person {
    private String name;
    private int age;
    public static String species; //static make for all
    //public String pecies;// if you do not static it will print
                    // human for species for p1 and null for p2

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}

package day48;

public abstract class Employee {
    String name;
    int id;

    public Employee(){

    }
//why do I have constructor here: to reuse the code at subclass again and again
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract void calculateAnnualSalary();

    public abstract String toString();
}

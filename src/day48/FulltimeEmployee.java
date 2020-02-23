package day48;

public class FulltimeEmployee extends Employee{

    double monthlySalary;

    public FulltimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    public void calculateAnnualSalary(){
        System.out.println("annual salary"+monthlySalary*12);
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id + " yearly="+monthlySalary*12+
                '}';
    }
}

package day48;
//what making the class abstrac: abstraction keyword, abstract method only exist in abstract class
// you can not create a any object
// you provide a buluprint for sub class, and there is no body for abstract method
// you have to override method to subclass and remove abstract keyword

//if our class is Concrete class(sub class of abstraction) like below, give error
       //we have to override the methods
public class HourlyEmployee extends Employee{
    //instance fields: hourly wage, and numsOfHours, name, id
    //intance method, calculate AnnualSalary, and toString


    double hourlyWage;
    double numsOfHours;//entire year

    public HourlyEmployee(String name, int id1, int i, int id) {
        super(name, id); //this calls from super class
    }

    public void calculateAnnualSalary(){
        System.out.println("CalculateAnnual salary"+hourlyWage*numsOfHours);
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

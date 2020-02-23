package day48;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee e1= new HourlyEmployee("araz",101,55,3000);
        //e1= it is a variable store data
        e1.calculateAnnualSalary();
        System.out.println("e1: "+e1);

        HourlyEmployee e2=new HourlyEmployee("aynar",102,60,2080);
        e1.calculateAnnualSalary();
        System.out.println("e2: "+e2);

        FulltimeEmployee f1=new FulltimeEmployee("Hasan",103,7000);
        f1.calculateAnnualSalary();
        System.out.println("f1="+f1);

    }
}

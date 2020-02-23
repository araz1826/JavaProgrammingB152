package day39;

public class Creation_3 {
    public static void main(String[] args) {   //in Student class we created instance variable and set the values here
                                                    //primitive valuea are 8 type. rest are reference values: scanner etc...

        //LOCAL VARIABLE: everything inside the method( main or any method) is local var.
        //INSTANCE VARIABLE:is out of the any method (it is under class name, we create a instance variable)

        Student s1= new Student();
        s1.name="Karima";
        s1.age=18;
        s1.gender='F';
        System.out.println(s1.name+s1.age+s1.gender);

        Student s2=new Student();
        s2.name="Juma";
        s2.age=34;
        s2.gender='M';
        System.out.println(s2.name);

        int oldage=s2.age;
        s2.gender=28;
        System.out.println("difference between ne and old age:"+(oldage-28));
    }
}

package day44_2Inheritance;


import day44__Inheritance.Vehicle;

public class Car extends Vehicle { //if you in different package will give error
                            // you have to import as above
    int mileage;

    public static void main(String[] args) {
        Car c1=new Car();
        c1.mileage=13000;
        c1.make="mercedes"; //PROTECTED at other package that is why you see it.
        System.out.println("mileage: "+c1.mileage);
         // you can not call make because it has a default access modifier
            //deafult only accessible for same package.
                //use setter and getter
        c1.setYear(2016);
        System.out.println("year: "+c1.getYear());

    }
}

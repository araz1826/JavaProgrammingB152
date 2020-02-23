package day41;

public class Person2 {
    private String name;    //all of them are default access modifier
    private int age;
    private long ssn;

    //write a method to give value to the field
    public void setAll(String newName, int newAge, long newSSN){
        name=newName;
        age=newAge;
        ssn=newSSN;

    }
    public String toString(){
        return "name: "+name+ "  age: "+age+ "  ssn: "+ssn;
    }

//what if I only want to get the name
    public String getName(){
        return name;

            }
    //what if I only want to change the name
    public void setName(String newName){
        name=newName;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age=newAge;
    }

public long getSsn(){
        return ssn;
        }

        public void setSsn(long newSsn){
        ssn=newSsn;
        }
}

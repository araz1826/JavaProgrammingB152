package day50.IinterfaceAbstract;

public class Addition extends Question {

    public void calculate(){
        answer=num1+num2;
        this.calculted=true; // if you caculated, do this. means that you calculated
                                // if you ask you if calculated do....
    }
    public Addition(int num1, int num2){
        super("addition question","+");
        this.num1=num1;
        this.num2=num2;
    }
    @Override
public String toString(){
        if(calculted==true){
            return super.toString()+num1+ operator+num2+" = "+answer;
// you can do super.toString to call the toString of super class
        }else {
            return num1+operator+num2+" = "+"";
        }
}


}

package day50.IinterfaceAbstract;

public class Subtraction extends Question {
    public void calculate(){

        answer=num1-num2;
        calculted=true;// it means that to make sure that it is calculated or not

    }
    public Subtraction(int num1, int num2){
        super("subtraction question","-");

        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        this.num1=num2;
        this.num2=num1;
    }
    public String toString(){
        if(calculted==true){
            return num1+ operator+num2+" = "+answer;

        }else {
            return num1+operator+num2+" = "+"";
        }
    }
}

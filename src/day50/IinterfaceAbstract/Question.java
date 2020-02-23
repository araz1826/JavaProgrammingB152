package day50.IinterfaceAbstract;

public abstract class Question {
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculted;
    String questionsType="Unknown";

    public abstract void calculate();

    public Question(String operator, String questionsType) {
        this.operator = operator;
        this.questionsType = questionsType;
    }

    @Override
    public String toString() {
        return "questions type is"+questionsType;
    }
}

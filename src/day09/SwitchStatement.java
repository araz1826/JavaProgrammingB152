package day09;



public class SwitchStatement {
    public static void main(String[] args) {

        int number =2;
        String language = "";

        switch (number) {
            case 1:
                language = "Hello";
                break;
            case 2:
                language = "Salam";
                break;
            case 3:
                language = "Hola";
                break;

            default:
                System.out.println("This is not a valid entry");
                break;
        }
        System.out.println(language);

    }

}


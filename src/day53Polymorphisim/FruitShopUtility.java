package day53Polymorphisim;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);
        displayFruit(f1);

    }
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Display fruit \n"+ anyFruit.toString());
    }
  //below methods are created after all these......
    public static void digestBetter(Fruit otherFruit){  //get digested 4 times

        otherFruit.getdigested();
        otherFruit.getdigested();
        otherFruit.getdigested();
        otherFruit.getdigested();
        displayFruit(otherFruit);
    }

    public static Fruit getMyFavoriteFruit(){

        return new Apple ("sweet", "red","aport");
    }
}
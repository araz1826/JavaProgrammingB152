package day52Polymorphisim;

public class PaperBook extends Book implements Readable{
    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight=weight;

    }

    @Override
    public String toString() {  //directly print out
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void displayBookInfo(){  //same with toString, just copy and paste, onyl difference is you have to call
        System.out.println("PaperBook{" + "weight=" + weight + ", name='" + name +
                '\'' + ", author='" + author + '\'' + '}');
    }
    public void takeNote(){
        System.out.println("Bookmark take note"+name);

    }
    public void showTableOfContent(){

    }

    @Override
    public void Read() {

    }
}

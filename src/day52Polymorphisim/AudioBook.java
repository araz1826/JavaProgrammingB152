package day52Polymorphisim;

public class AudioBook extends Book implements Readable {
    double duration;


    public AudioBook (String name, String author, double duration) {
      super(name,author);
      this.duration=duration;
    }
    public void displayBookInfo(){


    }
    public void Listen(){
        System.out.println("listen the audio boook "+name+ "by"+author);
    }

    @Override
    public void takeNote() {

    }

    @Override
    public void showTableOfContent() {
        System.out.println("showtable of content: "+name);

    }

    @Override
    public void Read() {

    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

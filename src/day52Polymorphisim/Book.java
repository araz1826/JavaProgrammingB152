package day52Polymorphisim;
//Abstract: book, instance field
// concerete = paperbook: int wight
//concrete= AudioBook: double duration

//add constructor  to set the fields
//abstract void method displayBookInfo()

//create an interface KnowledgeBank
  //abstract method takeNote();
//default method

//create another interface called readable,
//abstract method read();

//NOTE: book implements knowledgeBank,       audiobook,paperbook extends book

//create a List<Book> add all of your book

public abstract class Book implements KnowLedgeBank, Readable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
    public abstract void displayBookInfo();

    }



package day43; //IMPORTANT: we use non static method to give behavior to attributes

public class Pet {
    /*attributes  //Encapsulate your field
     type
    name
    constructor :
    no arg constructor
    set the type to "unknown"
    set the name to "noname"
            2 args constructor
    set the name and type to what the caller passed
    behaviours
            getters , setters , toString
    speak it is void
    accept no parameter
    according to the type speak following
    cat --> meow
    dog --> woof
    cow --> mooo
    horse --> neinei*/

    /*Create another class called PetStore with main method
            Create 8 Pet objects with initial value
    Store them into a List<Pet>
	1, print out all info
	2, print out only name
	3, print out only cats*/

    private String type;             // right click and get all from CONSTRUCTOR
    private String name;

    public Pet(){
        type="unknown";
        name="noname";
    }

    public void speak(){
        if (type =="cat"){              //case insensitive, do type.eqaualsgnoreCase()
            System.out.println("meow");
        }else if (type=="dog"){
            System.out.println("woof");
        }else if(type=="cow"){
            System.out.println("mooo");
        }else if(type=="horse"){
            System.out.println("neinei");
        }else{
            System.out.println("Unknown animal");
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static void showGeneralPetInfo(){ //this for PetStatic class
        System.out.println("PETS ARE FRIEND OF HUMANS");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

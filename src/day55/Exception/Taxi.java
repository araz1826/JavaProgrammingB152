package day55.Exception;

//Taxi Engine -Driver --Passenger

public class Taxi {                         //TAXI CLASS
    int plateNumber;
    Engine eng; // you have a engine class below so you can use as a data type here, just like String
    Driver dr; //you have a Taxi class below and u can use like this as String

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr=dr;
    }

    public Taxi(int i, Engine e1) {
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng +
                ", dr=" + dr +
                '}';
    }

    public static void main(String[] args) {                      //MAIN METHOD HERE
        Engine e1= new Engine("V6", 400);

        Taxi t1= new Taxi(12345,e1); // instead of engiine type, you already decleared on engine class just put e1.

        Driver d= new Driver("pedro", 12345);

        System.out.println( "t1= "+t1);
    }

}
class Engine{    //ENGINE CLASS
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
 class Driver {               //DRIVER CLASS
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

     @Override
     public String toString() {
         return "Driver{" +
                 "name='" + name + '\'' +
                 ", driverID=" + driverID +
                 '}';
     }
 }
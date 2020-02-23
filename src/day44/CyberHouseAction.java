package day44;

public class CyberHouseAction {
    public static void main(String[] args) {

        CyberHouse.showNeihghboorhood(); //static class
        CyberHouse.neighboorhoodName="Brooklyn";
        CyberHouse c1= new CyberHouse(5, "vintage");
        c1.showAllInfor();
        CyberHouse c2=new CyberHouse(10, "classic");
        c1.showAllInfor();



    }
}

package day44;

public class CyberHouse {
    private String desing;
    private int houseNum;

    static String neighboorhoodName="Cybertek ave"; //you can initialize or not

    //static olmazsa void olur yani instance method. you can only access with same class.


    public static String getNeighboorhoodName() {
        return neighboorhoodName;
    }

    public static void setNeighboorhoodName(String neighboorhoodName) {
        CyberHouse.neighboorhoodName = neighboorhoodName;
    }

        public CyberHouse(int houseNum, String desing) {
        this.houseNum = houseNum;
        this.desing = desing;
    }
    public void showAllInfor(){
        System.out.println("houseNum: "+this.houseNum+" desing: "+this.desing+ " neighboorhoodName: "+neighboorhoodName);
    }
    public static void showNeihghboorhood(){
        System.out.println("neighboorhoodName: "+neighboorhoodName);
    }
    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getDesing() {
        return desing;
    }

    public void setDesing(String desing) {
        this.desing = desing;
    }
}

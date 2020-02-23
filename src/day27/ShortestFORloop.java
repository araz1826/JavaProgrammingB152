package day27;

public class ShortestFORloop {
    public static void main(String[] args) {   // find shortest name in array

        String[] developersTeam={"Vladislav", "Hasan","Tolkun","Abide" };
        String[] testerTeam={"Zhib","Mohamed", "Nursultana"};
        String[] businessAnalysitTeam= {"Lisaf", "Ershad", "Araza"};

        String [][] scrumTeam={developersTeam,testerTeam,businessAnalysitTeam};
        String shortestword=scrumTeam[0][0];
        int shortest=scrumTeam[0][0].length();
        for(int a=0; a<scrumTeam.length; a++){
            for(int b=0; b<scrumTeam[a].length; b++){
                if(scrumTeam[a].length<shortest){
                    shortest=scrumTeam[a].length;
                    shortestword=scrumTeam[a][b];
                }
            }
        }
        System.out.println(shortestword);
    }
}

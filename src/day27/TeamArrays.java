package day27;

public class TeamArrays {
    public static void main(String[] args) {                    //Scrum Team example
        String[] developersTeam={"Vladislav", "Hasan","Tolkun","Abide" };
        String[] testerTeam={"Zhib","Mohamed", "Nursultana"};
        String[] businessAnalysitTeam= {"Lisa", "Ershad", "Araz"};
                                                                  //how to store single dimensial to MultiD array
        String[][] scrumTeam= {developersTeam, testerTeam, businessAnalysitTeam};
                                                                    // find the longest name
        int maxLength=scrumTeam[0][0].length();
        String longestString="";

        for(String [] item:scrumTeam){
            for(String each: item){
                if(each.length()>maxLength){
                    maxLength=each.length();
                    longestString=each;

                }
            }

        }



    }
}

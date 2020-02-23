package day33;

public class oneNameSpellerwithDashReturn {
    public static void main(String[] args) {
        System.out.println(getSpelled("araz"));    //Note:YOU DO NOT PRINT ANYTHING, SO NO PRINT AT RETURN METHOD
        System.out.println(namespeller("araz"));
    }
    public static String getSpelled(String name) {      //First solution
        String result="";
        for (int a = 0; a < name.length(); a++) {

            result=result+name.charAt(a);
            {
                if (a != name.length() - 1) {
                    result=result+"-";
                }
            }
        }



        return result;
    }
    public static String namespeller(String name){     //Second solution
        String result="";

        for(int a=0; a<name.length()-1; a++){
            result=result+name.charAt(a)+"-";


        }
        String result2=result+name.charAt(name.length()-1);
        return result2;
        //or return result +name.charAt(name.length()-1);
    }
    public static String nameDash(String name){     //easy solution
        String dash="";
        for(int a=0; a<name.length(); a++){

            if(a!=name.length()-1){
                dash=dash+name.charAt(a)+"-";
            }
        }
        return dash+name.charAt(name.length()-1);
    }
}




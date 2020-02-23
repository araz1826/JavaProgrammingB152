package day35.DoubleParseValue;

public class FiveANOTHERsolutuionOFfive {
    public static void main(String[] args) {
        String name="araz123";
        String newone="";
        for (int i = 0; i <name.length() ; i++) {
            if(Character.isDigit(name.charAt(i))){
                newone+=name.charAt(i);
            }

        }
        System.out.println(newone);
        int x=Integer.parseInt(newone);
        int sum=0;
        String [] splitter= newone.split("");
        for (int a=0; a<splitter.length; a++){
            sum+=Integer.parseInt(splitter[a]);

        }
        System.out.println(sum);
        int sum2=0;
        for(int a=0; a<newone.length(); a++){
            sum2+=Integer.parseInt(newone.substring(a,a+1));
        }
        System.out.println(sum2);


    }


}
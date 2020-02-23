package day21;

public class SearchFor2letter {
    public static void main(String[] args) {
        String name="araz araz araz araz";
        int count=0;
        for(int a=0;a<name.length()-2;a++){
            String newNAME=name.substring(a,a+3);
            if(newNAME.equalsIgnoreCase("ar")){
                System.out.println(a);
                count++;
            }

        }
    }
}
/* for (int i = 0; i <myName.length()-2 ; i++) {
                String currentName=myName.substring(i,i+3);
                if(currentName.equalsIgnoreCase("ara")){
                    System.out.println("Index Of A: "+i);
                    count++;
                }
            }
        System.out.println(count);*/
package All.Important.Together;

public class ReverseName {
    public static void main(String[] args) {

        String name="araz";
        for (int a=name.length()-1; a>=0; a--){
            String newName=name.toUpperCase();
            System.out.print(newName.charAt(a));
        }
    }
}

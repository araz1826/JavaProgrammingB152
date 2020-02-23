package day22;

public class ArrayPracticeAges {
    public static void main(String[] args) {
        int[] ages= new int[]{3,5,11,33,57,18};
        int itemcount=ages.length;
        System.out.println("itemcount = " + itemcount);

        for(int x=0; x<ages.length;x++){
            System.out.print(ages[x]+" ");
        }

    }
}

package day33;

//public class fiveFor {
    /*public static void main(String[] args) {
        int testAge = calculateAndReturnAge(1991);
        System.out.println(testAge);
        int [] testArray = {1999,122,2019,1987,1964,3999,2004};
        for (int i = 0; i < testArray.length; i++) {
            int age = calculateAndReturnAge(testArray[i]);
            System.out.println(age);
        }
    }
    public class ReturnKeyWordPractice {
        public static int calculateAndReturnAge(int year){
            if(year < 1900 || year > 2020){
                return 0;
            }else{
                int birthYear = (2020 - year);
                return birthYear;
            }
        }
}
/***calculateAndReturnAge
 * write a method that accepts a birth year and return the age
 * birthyear in the range of 1900-2020
 * if not return 0
 *
 * optionally test code against an array of birth years
 * {1999,122,2019,1987,1964,3999,2004}
 */
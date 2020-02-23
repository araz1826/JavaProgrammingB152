package day54.Interface;

public class Automation {
    public static void main(String[] args) {
        Webdriver c1=new ChromeDriver(); //this is how you make a polymorpism
    c1.openBrowser();
    c1.navigateTo("cybertek.com");
    c1.maximize();
    c1.closeBrowser();

    System.out.println(" running of firefox");

    c1=new Firefoxdriver();
    c1.navigateTo("wwww.cybertekschool.com");
    c1.closeBrowser();
    c1.openBrowser();
    c1.maximize();




    }
}
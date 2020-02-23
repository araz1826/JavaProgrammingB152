package day54.Interface;

public class Firefoxdriver implements Webdriver {
    @Override
    public void openBrowser() {
        System.out.println("opening firefox");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("navigate to "+ url);
    }

    @Override
    public void maximize() {
        System.out.println(" max firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox");
    }
}

package day54.Interface;

public interface Webdriver {

    public abstract void openBrowser();

    public abstract void navigateTo(String url);

    public abstract void maximize();

    public abstract void closeBrowser();
}

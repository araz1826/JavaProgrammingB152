package day54.Interface;

class ChromeDriver implements Webdriver {
    @Override
    public void openBrowser() {
        System.out.println("opening ChromeBrowser");
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigate to: "+url);
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close the browser");
    }
}

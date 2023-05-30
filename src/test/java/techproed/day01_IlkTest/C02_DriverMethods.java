package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://techproeducation.com");

        String title = driver.getTitle();
        System.out.println(title);

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);


        //getWindowHandle gidilen sayfanın handle degerini verir.
        //Bu handle degerini sayfalar arası geçiş için kullanırız.
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);


    }
}

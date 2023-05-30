package techproed.day03_Locators;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Submit {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        //Arama kutusunu locate edip iphone aratalım
        //Sayfayı kapatalım

        driver.get("https://amazon.com.tr");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("iphone");
        Thread.sleep(1500);
        searchBox.submit();//Keys.ENTER

        driver.close();






    }
}

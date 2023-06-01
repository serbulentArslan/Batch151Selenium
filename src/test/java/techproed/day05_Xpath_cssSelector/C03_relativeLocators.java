package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Benzer özelliklere sahip welelementler için relative locator kullanabiliriz.
        SYNTAX:
        driver.findElement(with(By.tagname).below().above().to_left_of().to_rigth_of().near() vb)
         */

        //amazona gidelim
        driver.get("https://amazon.com");

        //city bike aratalım
        WebElement searchBox = driver.findElement(By.xpath("//*[@name='field-keywords']"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        //relative locator kullanarak hybrid bikes altındaki elemente tıklayınız.
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        WebElement eletricBikes = driver.findElement(with(By.tagName("a")).below(hybridBikes));
        eletricBikes.click();
    }
}

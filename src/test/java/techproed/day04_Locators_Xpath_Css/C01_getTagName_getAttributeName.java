package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_getTagName_getAttributeName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1- amazon.com'a gidip arama kutusunu locate edin
        // 2- arama kutusunun tagName'inin input oldugunu test edin
        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        // 4- sayfayı kapatınız

        driver.get("https://www.amazon.com.tr/");

        WebElement cookies = driver.findElement(By.id("sp-cc-accept"));
        cookies.click();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        String actualTagName = searchBox.getTagName();
        String exceptedTagName = "input";
        if (actualTagName.equals(exceptedTagName)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        String actualTagNameAttribute = searchBox.getAttribute("name");
        String exceptedTagNameAttribute = "field-keywords";
        if (actualTagNameAttribute.equals(exceptedTagNameAttribute)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.close();

    }
}

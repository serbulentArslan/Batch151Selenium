package techproed.day04_Locators_Xpath_Css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class C02_Webelement_Locator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //WebElement cookies = driver.findElement(By.id("sp-cc-accept"));
        //cookies.click();

        // arama kutusuna "city bike" yazıp aratın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        // sonuc yazısını yazdırın
        List<WebElement> resultText = driver.findElements(By.className("sg-col-inner"));
        System.out.println(resultText.get(0).getText());

        // sonuc sayısını yazdırın
        String[] numberOfResult = resultText.get(0).getText().split(" ");
        System.out.println("Number of results : " + numberOfResult[2]);

        // ilk ürünün locatini alın
        List<WebElement> products = driver.findElements(By.className("s-image"));
        WebElement firstProduct = products.get(0);

        // ilk ürünün, görünür olup olmadıgını true, false seklinde yazdırın
        boolean firstProductIsDisplayed = firstProduct.isDisplayed();
        System.out.println(firstProductIsDisplayed);

        // ilk ürünün, erisilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(firstProduct.isEnabled());

        // ilk ürünün, secilebilir olup olmadıgını true, false seklinde yazdırın
        System.out.println(firstProduct.isSelected());

        // ilk urune tıklayın
        firstProduct.click();

        // sayfayı kapatın


        /*
        //ARAMA KUTUSUNUN HTML KODLARI
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
         placeholder="Search Amazon" class="nav-input nav-progressive-attribute" dir="auto"
         tabindex="0" aria-label="Search Amazon" spellcheck="false">
         */
        //Relative Xpath syntax -->  //tagname[@attributeName='attributeValue']

        //input[@type='text']
        //                           (//input[@type='text'])[1]
        /*
        Aldigimiz xpath unique olmadigi zaman xpath' imizi parantez icine alarak index belirtebiliriz.
        Boylelikle webelementi List' e atip istedigimiz elementi almakla ugrasmayiz
         */






    }
}

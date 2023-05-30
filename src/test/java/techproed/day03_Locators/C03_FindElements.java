package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com.tr");

        //Sayfadaki linklerin sayısını ve linkleri yazdıralım
        /*
        findElement ile bir webelemente ulaşabilirkern, birden fazla webelement'e ulasabilmek icin
        findElements() methodunu kulalnırız.Bu webelementlerin sayısına ulaşmak için ya da bu webelementlerin
        yazısını konsola yazdırabailmek için List<WebElement> linklerListesi = driver.findElements(By.locator("locator degeri))
        olarak kullanırız Olusturmuş oldugumuz List'i loop ile konsola yazdırabiliriz.
         */



        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi : "+linksList.size());
/*
        for (WebElement w:linksList) {
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }
        }

 */

        //lambda ile yazdıralim

        linksList.forEach(link -> {if (!link.getText().isEmpty()){
            System.out.println(link.getText());}});


        driver.close();




    }
}

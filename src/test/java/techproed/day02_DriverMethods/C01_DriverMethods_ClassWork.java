package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa baslıgının Amazon içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        //Url'in https://www.amazon.com oldugunu test edelim
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }


        //Sayfayı kapatalım.
        driver.close();
        //driver.quit(); birden fazla browser varsa hepsini kapatır.


        /*
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.
        */



    }
}

package techproed.day06relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C01_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
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
        System.out.println(hybridBikes.getText());
        WebElement eletricBikes = driver.findElement(with(By.tagName("a")).below(hybridBikes));
        System.out.println(eletricBikes.getText());
        WebElement completeBike = driver.findElement(with(By.tagName("a")).below(eletricBikes));
        System.out.println(completeBike.getText());

        //Bikes altındaki linklerin hepsinin adını yazdırınız
        List<WebElement> linksList = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));

         /*
            XPATH kullaniminda bir sayfadaki webelementlere mudehala etmek istedigimizda xpath ile locate aldigimizda birden fazla sonuc
        verebilir. [position()>=9 and position()<=15] bu kullanimla aralik belirterek istedigimiz webelementleri secip mudehale edebiliriz.
         */

        //lambda
        linksList.forEach(t-> System.out.println(t.getText()));
        System.out.println();

        //foreach
        for (WebElement w:linksList) {
            System.out.println(w.getText());
        }
        System.out.println();

        //Bu linklerin hepsini tıklayalım ve sayfa başlıklarını alalım
        for (int i = 0; i < linksList.size(); i++) {
            linksList = driver.findElements(By.xpath("(//*[@class='a-list-item'])[position()>=9 and position()<=15]"));
            System.out.println(linksList.get(i).getText());
            linksList.get(i).click();
            Thread.sleep(1500);

            driver.navigate().back();

            Thread.sleep(1500);
        }





    }
}

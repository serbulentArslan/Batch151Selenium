package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chorme.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://amazon.com");

        // arama kutusuna "city bike"  yazıp aratın
        WebElement searchBox = driver.findElement(By.xpath("//*[@name='field-keywords']"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        // Hybrid Bikes bölümüne tıklayın
        WebElement hybridBikes = driver.findElement(By.xpath("//*[text()='Hybrid Bikes']"));
        hybridBikes.click();

        // sonuc sayısını yazdırın
        WebElement searchText = driver.findElement(By.xpath("//*[@class='sg-col-inner'][1]"));
        String[] searchTextNumber = searchText.getText().split(" ");
        System.out.println(searchTextNumber[0]);


        // ilk ürününe tıklayın
        WebElement firstProduct = driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal'][1]"));
        firstProduct.click();

        // Sayfayı kapatınız
        driver.close();

    }
}

package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Techproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com");//driver.get() ile aynı
        Thread.sleep(3000);

        //Sonra Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");//driver.get() ile aynı
        Thread.sleep(3000);


        //Amazon sayfasının başlığını yazdıralım
        String amazonTitle = driver.getTitle();
        System.out.println("Amazon Title = "+amazonTitle);
        Thread.sleep(3000);


        //Techproeducation sayfasına geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);


        //Sayfa baslıgını yazdıralım
        String title = driver.getTitle();
        System.out.println("Techproeducation Title = "+title);
        Thread.sleep(3000);


        //Amazon sayfasına tekrar gidip  url'ı yazdıralım
        driver.navigate().forward();
        String url = driver.getCurrentUrl();
        System.out.println("Amazon url = "+ url);
        Thread.sleep(3000);


        //Amazon sayfasındayken sayfayı yenileyelim.
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.close();



    }
}

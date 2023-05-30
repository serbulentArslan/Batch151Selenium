package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        implicitlyWait(Duration.ofSeconds(20)); Sayfadaki webElementleri görünür olana kadar
        (sayfada olusana kadar) max 20 saniye bekler.
        Eger webElementler 2 saniyede olusursa kodlar o andan itibaren oldugu gibi devam eder.
        Belirtilen max süre boyunca internetten vb kaynaklardan dolayı webElementler yüklenmezse
        testimiz fail verir.
         */
        //techproed sayfasına gidelim
        String techproUrl = "https://techproeducation.com";
        driver.get(techproUrl);
        Thread.sleep(1500);
        //amazona gidelim
        String amazonUrl = "https://amazon.com";
        driver.get(amazonUrl);
        Thread.sleep(1500);
        //techpro sayfasına geri gidelim
        driver.navigate().back();
        Thread.sleep(1500);
        //sayfa baslıgının techpro içerdiigini test edelim
        String actualTitle = driver.getTitle();
        String expectedTitle = "techpro";
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(1500);
        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();
        Thread.sleep(1500);
        //sayfa baslıgının Amazon içerdigini test edelim
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Amazon";
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
//...
        driver.close();




    }

}

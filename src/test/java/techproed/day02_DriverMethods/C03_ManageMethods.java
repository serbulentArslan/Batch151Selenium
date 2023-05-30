package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Browser'ın konumunu yazdıralım
        Point position = driver.manage().window().getPosition();
        System.out.println("Page Position = "+position);

        //Browser'ın boyutlarını yazdıralım
        Dimension size = driver.manage().window().getSize();
        System.out.println("Page Size = "+size);

        //Browser'ı maximize yapalım
        driver.manage().window().maximize();

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Browser'ın konumunu yazdıralım
        Point position2 = driver.manage().window().getPosition();
        System.out.println("Page Position Max = "+position2);

        //Browser'ın boyutlarını yazdıralım
        Dimension size2 = driver.manage().window().getSize();
        System.out.println("Page Size Max = "+size2);

        //Sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(1500);

        //Sayfayı fullScreean yapalım
        driver.manage().window().fullscreen();
        Thread.sleep(1500);

        //Sayfayı maximize yap
        driver.manage().window().maximize();
        Thread.sleep(1500);

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(600,600));
        Thread.sleep(1500);

        driver.close();

    }
}

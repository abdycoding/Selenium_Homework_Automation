package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Basedriver {

    public static WebDriver driver;
     static { // tearStart()

        driver=new ChromeDriver();

       // driver.manage().window().maximize(); // Ekrani max yapiyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // sayfayi yukleme muhleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // elementi bulma muhleti

    }


    public static void BekleKapat(){
        MyFunc.bekle(3);
        driver.quit();
    }
}

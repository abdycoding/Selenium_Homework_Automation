package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task2 extends Basedriver {
   @Test
    public void  Test(){

       driver.get("https://demo.applitools.com/");
    /*
    1) Bu siteye gidin. -> https://demo.applitools.com/

    2) Username kısmına "ttechno@gmail.com" girin.

    3) Password kısmına "techno123." girin.

    4) "Sign in" buttonunan tıklayınız.

    5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
         */
       MyFunc.bekle(2);
       WebElement username= driver.findElement(By.xpath("//input[@placeholder='Enter your username']"));
       username.sendKeys("ttechno@gmail.com");
       MyFunc.bekle(2);
       WebElement password= driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
       password.sendKeys("techno123.");
       MyFunc.bekle(2);
       WebElement signIn=driver.findElement(By.xpath("//a[@id='log-in']"));
       signIn.click();

       WebElement text=driver.findElement(By.xpath("//h6[@style='text-align: center;font-size: x-large;color:red']"));
       Assert.assertTrue("Error 404 ",text.getText().contains("Your nearest branch closes in: 30m 5s"));


       BekleKapat();

    }
}

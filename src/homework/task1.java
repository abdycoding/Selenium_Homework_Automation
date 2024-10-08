package homework;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task1 extends Basedriver {

    @Test
    public void Test() {
/*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.cssSelector("[placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.bekle(2);
        WebElement mail = driver.findElement(By.cssSelector("[placeholder='name@example.com']"));
        mail.sendKeys("Testing@gmail.com");
        MyFunc.bekle(2);
        WebElement address = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        address.sendKeys("Testing Current Address");
        MyFunc.bekle(2);

        WebElement permanent = driver.findElement(By.cssSelector("#permanentAddress-wrapper > div:nth-child(2)>textarea:nth-child(1)"));
        permanent.sendKeys("Testing Permanent Address");
        MyFunc.bekle(2);

        WebElement submit = driver.findElement(By.cssSelector(".text-right > button:nth-child(1)"));
        submit.click();

        WebElement aat1=driver.findElement(By.xpath("//p[@id='name']"));
        System.out.println("get" + aat1.getText());
        String at=aat1.getText();
        Assert.assertTrue("Error", at.contains("Automation"));

            WebElement a1=driver.findElement(By.xpath("//p[@id='email']"));
        String email=a1.getText();
        Assert.assertTrue("Error ",email.contains("Testing"));
        BekleKapat();



    }


}

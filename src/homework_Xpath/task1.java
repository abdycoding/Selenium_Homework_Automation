package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.Basedriver.driver;

public class task1 extends Basedriver {
    @Test
    public void  Test(){
        /*

         */
        driver.get("http://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");
        MyFunc.bekle(2);
        WebElement mail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        mail.sendKeys("Testing@gmail.com");
        MyFunc.bekle(2);
        WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        address.sendKeys("Testing Current Address");
        MyFunc.bekle(2);

        WebElement permanent = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanent.sendKeys("Testing Permanent Address");
        MyFunc.bekle(2);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        WebElement aat1=driver.findElement(By.id("name"));
        System.out.println("get" + aat1.getText());
        String at=aat1.getText();
        Assert.assertTrue("Error", at.contains("Automation"));

        WebElement a1=driver.findElement(By.id("email"));
        String email=a1.getText();
        Assert.assertTrue("Error ",email.contains("Testing"));
        BekleKapat();



    }
}

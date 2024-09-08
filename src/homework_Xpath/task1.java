package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
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

        WebElement aat1=driver.findElement(By.id("name"));
        System.out.println("get" + aat1.getText());
        String at=aat1.getText();
        if (at.contains("Automation")){
            System.out.println("Basarili");
        }else {
            System.out.println("Error");
        }


        WebElement a1=driver.findElement(By.id("email"));
        String email=a1.getText();
        if (email.contains("Testing")){
            System.out.println("Basarili");
        }
        else {
            System.out.println("Error");
        }
        BekleKapat();


    }
}

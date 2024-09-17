package wait_command;

import Utility.Basedriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class task4 extends Basedriver {
    /*
    4-

Senaryo

1) https://demoqa.com/dynamic-properties adresine gidin
2) “Will enable 5 seconds” butonunun enable olmasini bekleyin
3) “Will enable 5 seconds” butonunun enable oldugunu test edin
     */
    @Test
    public void Test(){
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement button= driver.findElement(By.id("enableAfter"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(button));

        Assert.assertTrue(button.isEnabled());

    }
}

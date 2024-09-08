package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task3 extends Basedriver {
   @Test
    public void  Test(){

       driver.get("https://www.snapdeal.com/");
        /*
        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
         */
       MyFunc.bekle(2);
       WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
       search.sendKeys("teddy bear");
       MyFunc.bekle(2);
       WebElement  searchButton= driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
       searchButton.click();
       MyFunc.bekle(2);
       WebElement teddy=driver.findElement(By.xpath("//span[@style='color: #212121; font-weight: normal']"));
       Assert.assertTrue("The result is unmatched", teddy.getText().contains("We've got 62 results for teddy bear"));
       BekleKapat();



   }
}

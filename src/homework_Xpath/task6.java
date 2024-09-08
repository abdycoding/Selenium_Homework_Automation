package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task6 extends Basedriver {
    @Test
    public void  Test(){
        /*
        Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.
         */
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.bekle(2);
        WebElement fakeAlert= driver.findElement(By.cssSelector("[href='alerts/fake-alert-test.html']"));
        fakeAlert.click();
        MyFunc.bekle(2);
        WebElement show= driver.findElement(By.cssSelector("[value='Show modal dialog']"));
        show.click();
        MyFunc.bekle(2);

        WebElement fakeButon= driver.findElement(By.cssSelector("[class='dialog-button']"));
        fakeButon.click();
        BekleKapat();


    }
}

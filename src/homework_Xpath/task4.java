package homework_Xpath;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class task4  extends Basedriver {
    @Test
    public void  Test(){

        /*
Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.
 */
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.bekle(2);
        WebElement calculator= driver.findElement(By.xpath("//a[@href='calculator']"));
        calculator.click();
        MyFunc.bekle(2);
        WebElement input=driver.findElement(By.xpath("//input[@id='number1']"));
        input.sendKeys("5");
        MyFunc.bekle(2);
        WebElement input2= driver.findElement(By.xpath("//input[@id='number2']"));
        input2.sendKeys("6");
        MyFunc.bekle(2);
        WebElement calculate= driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();

        WebElement sonuc=driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("sonuc = " + sonuc.getText());
        BekleKapat();


    }
}

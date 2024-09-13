package automation_dragandDrop;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class task3 extends Basedriver {
    /*

      challenge sorusu
Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
     */
@Test
    public  void  Test(){
    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
driver.manage().window().maximize();
    Actions actions=new Actions(driver);
    List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//div"));
    List<WebElement> objects =driver.findElements(By.xpath("//ul[@id='allItems']//li"));

    for (WebElement object : objects) {
        for (WebElement kutu : boxes) {
            actions.clickAndHold(object).build().perform();
            MyFunc.bekle(1);
            actions.moveToElement(kutu).build().perform();
            MyFunc.bekle(1);
            actions.release().build().perform();

            if (object.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                break;}
        }
    }

BekleKapat();}



}

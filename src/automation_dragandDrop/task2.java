package automation_dragandDrop;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class task2 extends Basedriver {
    /*
    Ödev 2 : http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.
     */

    @Test
    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");
        Actions actions=new Actions(driver);
        List<WebElement> students =driver.findElements(By.xpath("//ul[@id='allItems']//li"));
        List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//div"));


        for (WebElement student : students) {
            for (WebElement kutu : boxes) {
            actions.clickAndHold(student).build().perform();
            MyFunc.bekle(2);
            actions.moveToElement(kutu).build().perform();
            MyFunc.bekle(2);
            actions.release().build().perform();



            }
        }
    }

}

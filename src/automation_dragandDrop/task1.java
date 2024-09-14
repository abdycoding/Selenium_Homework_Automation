package automation_dragandDrop;

import Utility.Basedriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1  extends Basedriver {
    /*
    Ödev 1 : http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
         buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.
     */
    @Test
    public void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions aksiyonlar = new Actions(driver);
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        List<WebElement> countries = driver.findElements(By.cssSelector("div[class='destinationBox']"));
        List<WebElement> cities = driver.findElements(By.xpath("//div[@id='answerDiv']//div"));


        for (WebElement city : cities) {
            for (WebElement country : countries) {
                aksiyonlar.clickAndHold(city).build().perform();
                MyFunc.bekle(1);
                aksiyonlar.moveToElement(country).build().perform();
                MyFunc.bekle(1);
                aksiyonlar.release().build().perform();
                if (city.getCssValue("background-color").equals("rgba(0, 128, 0, 1)")) {
                    break;
                }

//                if (city.getAttribute("class").equals("correctAnswer")) {
//                    break;
            }
        }
    }}
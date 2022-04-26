package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UtilityTest extends BaseTest {

    /**
     *  This method will click on element
     */

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public String getText(By by) {
        return driver.findElement(by).getText();
    }

    public int findActualNumber(By by){

    List<WebElement> actualNumberElement = driver.findElements(by);
    int actualNumber = actualNumberElement.size();
        return actualNumber;
    }

}

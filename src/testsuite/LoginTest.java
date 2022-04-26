package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityTest;

public class LoginTest extends UtilityTest {
    String baseUrl = "https://www.saucedemo.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        // Find the login field and send valid username
        sendTextToElement(By.id("user-name"), "standard_user");
        // Find the password field and send valid password
        sendTextToElement(By.id("password"), "secret_sauce");
        // Find login button and click on login button
        clickOnElement(By.id("login-button"));

        //Expected text to verify
        String expectedText = "PRODUCTS";
        //Get actual text from web
       String actualText = getText(By.xpath("//span[contains(text(),'Products')]"));
       //Validate expected text and actual text
        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyThatSixproductsAreDisplayOnPage(){
        // Find the login field and send valid username
        sendTextToElement(By.id("user-name"), "standard_user");
        // Find the password field and send valid password
        sendTextToElement(By.id("password"), "secret_sauce");
        // Click on login button
        clickOnElement(By.id("login-button"));
        // Expected to 6 products on page
        int expectedNumber = 6;
        // Find actual products on web and Validate with expected number
        Assert.assertEquals(expectedNumber,findActualNumber(By.className("inventory_item")));
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}

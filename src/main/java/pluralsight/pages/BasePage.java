package pluralsight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

public class BasePage {

    protected WebDriver driver = getChromeDriver();
    protected WebDriverWait wait = getWebDriverWait();


    public BasePage verifyIsDisplayed(By element){
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }
}

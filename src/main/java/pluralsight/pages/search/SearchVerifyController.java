package pluralsight.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pluralsight.pages.BasePage;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;


public class SearchVerifyController extends BasePage {

    public static By freeTrial() {
        return By.xpath("//*[@id='content']/div[1]/div/div/div[2]/aside/div[1]/section[1]/div");
    }

    public static By coursePreviewButton() {
        return By.xpath("//*[@id=\"course-page-hero\"]/div[2]/a");
    }

    public SearchVerifyController veryfiIsDisplayed(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
        return this;
    }
}

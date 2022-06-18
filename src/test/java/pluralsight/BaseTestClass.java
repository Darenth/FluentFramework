package pluralsight;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pluralsight.pages.BasePage;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    void setupClass() {
        driver = getChromeDriver();
        wait = getWebDriverWait();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void startUpBrowser() {
        driver.get("https://www.pluralsight.com/");

    }

    @AfterSuite(alwaysRun = true)
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

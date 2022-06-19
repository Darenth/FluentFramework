package pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pluralsight.pages.course.CoursePage;
import pluralsight.pages.home.HomePage;
import pluralsight.pages.login.LoginPage;
import pluralsight.pages.search.SearchPage;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {
    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage = HomePage.getHomePage();
    SearchPage searchPage = SearchPage.getSearchPage();
    CoursePage coursePage = CoursePage.getCoursePage();

    LoginPage loginPage = LoginPage.getLoginPage();

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

package pluralsight.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;

public class BasePage {
    protected WebDriver driver = getChromeDriver();
    protected WebDriverWait wait = getWebDriverWait();

}

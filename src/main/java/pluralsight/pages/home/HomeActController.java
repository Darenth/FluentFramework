package pluralsight.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pluralsight.pages.BasePage;
import pluralsight.pages.login.LoginActController;


public class HomeActController extends BasePage {

    public HomeActController clickLoginSkills() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-aa-title=\"Sign-in\"]")));
        driver.findElement(By.cssSelector("a[data-aa-title=\"Sign-in\"]")).click();
        driver.findElement(By.cssSelector("a[data-aa-title=\"Sign-in-skills\"]")).click();
        return this;
    }
    public HomeActController search(String searchValue) {
        WebElement searchButton = driver.findElement(By.className("ps-nav--primary"));
        searchButton.click();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("header_search--input")));

        WebElement search = driver.findElement(By.className("header_search--input"));
        search.sendKeys(searchValue);
        search.sendKeys(Keys.ENTER);
        WebElement results = driver.findElement(By.className("show-for-medium-up"));
        wait.until(ExpectedConditions.visibilityOf(results));
        return this;

    }
}

package pluralsight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
    private HomePage() {
    }

    public static HomePage getHomePage(){
        return new HomePage();
    }

    public HomePage search(String searchValue) {
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

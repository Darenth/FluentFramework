package pluralsight.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pluralsight.pages.BasePage;

import static pluralsight.DriverFactory.getChromeDriver;
import static pluralsight.DriverFactory.getWebDriverWait;
import static pluralsight.utils.TestUtils.explicitWait;

public class SearchActController extends BasePage {
    WebDriver driver = getChromeDriver();
    WebDriverWait wait = getWebDriverWait();
    public SearchActController filterBySkillLevel(SkillLevel skillLevelValue) throws InterruptedException {
        By skillLevelsMenu = By.xpath("//*[@id=\"search-filter-left-target\"]/div[2]/div[1]/a");
        By skillLevel = By.xpath("//span[contains(@class,'search-filter-option-text') and contains (.,'" + skillLevelValue + "')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(skillLevelsMenu));
        driver.findElement(skillLevelsMenu).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(skillLevel));
        driver.findElement(skillLevel).click();
        explicitWait();
        return this;
    }

    public SearchActController filterByRole(Role role) {
        final By roles = By.xpath("//*[@id=\"search-filter-left-target\"]/div[1]/div[1]/a");////*[@id="search-filter-left-target"]/div[1]/div[1]/a/text()
        wait.until(ExpectedConditions.visibilityOfElementLocated(roles));
        driver.findElement(roles).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + role + "')]")).click();
        return this;
    }

    public SearchActController selectTabCourses(Tab tab) {
        final By tabCourse = By.xpath("//a[contains(text(),'Courses')]");
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabCourse));
        driver.findElement(By.xpath("//a[contains(text(),'" + tab + "')]")).click();
        return this;
    }

    public void selectCourse(String course) {
        driver.findElement(By.xpath("//a[contains(text(),'" + course + "')]")).click();
    }


}

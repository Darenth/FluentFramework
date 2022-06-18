package pluralsight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    private final By roles = By.xpath("//*[@id=\"search-filter-left-target\"]/div[1]/div[1]/a");////*[@id="search-filter-left-target"]/div[1]/div[1]/a/text()
    private final By skillLevels = By.xpath("//*[@id=\"search-filter-left-target\"]/div[2]/div[1]/a");////*[@id="search-filter-left-target"]/div[1]/div[1]/a/text()
    private final By tabCourse = By.xpath("//a[contains(text(),'Courses')]");


    public void filterBySkillLevel(String skillLevelValue) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skillLevels));
        driver.findElement(skillLevels).click();
        By skillLevel = By.xpath("//span[contains(@class,'search-filter-option-text') and contains (.,'" + skillLevelValue + "')]");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(skillLevel));
        driver.findElement(skillLevel).click();
    }

    public void filterByRole(String role) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(roles));
        driver.findElement(roles).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + role + "')]")).click();

    }

    public void selectTabCourses(String tab) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabCourse));
        driver.findElement(By.xpath("//a[contains(text(),'" + tab + "')]")).click();

    }

    public void selectCourse(String course) {
        driver.findElement(By.xpath("//a[contains(text(),'" + course + "')]"));

    }
}

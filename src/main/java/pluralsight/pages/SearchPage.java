package pluralsight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pluralsight.pages.search.SkillLevel;

public class SearchPage extends BasePage {

    private final By roles = By.xpath("//*[@id=\"search-filter-left-target\"]/div[1]/div[1]/a");////*[@id="search-filter-left-target"]/div[1]/div[1]/a/text()
    private final By skillLevels = By.xpath("//*[@id=\"search-filter-left-target\"]/div[2]/div[1]/a");////*[@id="search-filter-left-target"]/div[1]/div[1]/a/text()
    private final By tabCourse = By.xpath("//a[contains(text(),'Courses')]");

    private SearchPage() {

    }

    public static SearchPage getSearchPage(){
        return new SearchPage();
    }


    public SearchPage filterBySkillLevel(SkillLevel skillLevelValue) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(skillLevels));
        driver.findElement(skillLevels).click();
        By skillLevel = By.xpath("//span[contains(@class,'search-filter-option-text') and contains (.,'" + skillLevelValue + "')]");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(skillLevel));
        driver.findElement(skillLevel).click();
        Thread.sleep(2000);
        return this;
    }

    public SearchPage filterByRole(String role) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(roles));
        driver.findElement(roles).click();
        driver.findElement(By.xpath("//span[contains(text(),'" + role + "')]")).click();
        return this;
    }

    public SearchPage selectTabCourses(String tab) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabCourse));
        driver.findElement(By.xpath("//a[contains(text(),'" + tab + "')]")).click();
        return this;
    }

    public void selectCourse(String course) {
        driver.findElement(By.xpath("//a[contains(text(),'" + course + "')]")).click();
    }
}

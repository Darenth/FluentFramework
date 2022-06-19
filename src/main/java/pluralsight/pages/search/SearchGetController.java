package pluralsight.pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pluralsight.pages.BasePage;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchGetController extends BasePage {

    public List<String> courses() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='search-results-category-target'] //div[@class='search-result__title']")));
        List<WebElement> courses = driver.findElements(By.xpath("//div[@id='search-results-category-target'] //div[@class='search-result__title']"));
        Assert.assertTrue(courses.size() != 0, "List is empty, failed to collect courses");

       return courses.stream().map(WebElement::getText).collect(toList());
    }
}

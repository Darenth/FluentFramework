package pluralsight.pages.course;

import org.openqa.selenium.By;
import org.testng.Assert;
import pluralsight.pages.BasePage;

public class CourseVerifyController extends BasePage {

    public CourseVerifyController freeTrialisDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[2]/aside/div[1]/section[1]/h3")).isDisplayed());
        return this;
    }

    public CourseVerifyController coursePreviewIsDisplayed(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"course-page-hero\"]/div[2]/a"))
                .isDisplayed());
        return this;
    }

}

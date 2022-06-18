package pluralsight.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CoursePage extends BasePage {

    private CoursePage() {

    }

    public static CoursePage getCoursePage() {

        return new CoursePage();
    }




    public static By freeTrial() {
        return By.xpath("//*[@id='content']/div[1]/div/div/div[2]/aside/div[1]/section[1]/div");
    }

    public static By coursePreviewButton() {
        return By.xpath("//*[@id=\"course-page-hero\"]/div[2]/a");
    }
}

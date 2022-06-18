package pluralsight;

import org.testng.annotations.Test;
import pluralsight.pages.CoursePage;
import pluralsight.pages.HomePage;
import pluralsight.pages.SearchPage;
import pluralsight.pages.search.SkillLevel;

import static pluralsight.pages.CoursePage.coursePreviewButton;
import static pluralsight.pages.CoursePage.freeTrial;

public class SearchTest extends BaseTestClass {

    HomePage homePage = HomePage.getHomePage();
    SearchPage searchPage = SearchPage.getSearchPage();
    CoursePage coursePage = CoursePage.getCoursePage();

    @Test
    public void basicFilterByTest() throws InterruptedException {
        String courseName = "Modern Java: The Big Picture";

        homePage.search("Java");

        searchPage.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole("IT Ops")
                .selectTabCourses("Courses")
                .selectCourse(courseName);

        coursePage.veryfiIsDisplayed(freeTrial()).veryfiIsDisplayed(coursePreviewButton());

    }
}

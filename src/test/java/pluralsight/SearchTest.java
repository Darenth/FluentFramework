package pluralsight;

import org.testng.annotations.Test;
import pluralsight.pages.HomePage;
import pluralsight.pages.SearchPage;

public class SearchTest extends BaseTestClass{
    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void basicFilterByTest() throws InterruptedException {
        homePage.search("Java");
        searchPage.filterBySkillLevel("Beginner");
        Thread.sleep(2000);
        searchPage.filterByRole("IT Ops");
        searchPage.selectTabCourses("Courses");
        searchPage.selectCourse("Modern Java: The Big Picture");

    }
}

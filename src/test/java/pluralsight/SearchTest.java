package pluralsight;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pluralsight.pages.search.Role;
import pluralsight.pages.search.SkillLevel;
import pluralsight.pages.search.Tab;

import java.util.List;

import static pluralsight.pages.login.LoginVerifyController.invalidPasswordAndEmail;


public class SearchTest extends BaseTestClass {

    @Test(enabled = false)
    public void basicFilterByTest() throws InterruptedException {
        String courseName = "Modern Java: The Big Picture";

        homePage.act().search("Java");

        searchPage.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTabCourses(Tab.COURSES)
                .selectCourse(courseName);

        coursePage.verify()
                .coursePreviewIsDisplayed()
                .freeTrialisDisplayed();


    }

    @Test(enabled = false)
    public void searchListCheck() throws InterruptedException {
        String courseName = "Modern Java: The Big Picture";

        homePage.act().search("Java");

        searchPage.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTabCourses(Tab.COURSES);

        List<String> courses = searchPage.get().courses();


        Assertions.assertThat(courses)
                .doesNotContain("python")
                .hasSize(25);
    }

    @Test
    public void loginTest() {

        homePage.act().clickLoginSkills();

        loginPage.act()
                .provideCredentials("aaa", "bbbb")
                .clickSignIn()
                    .andThen()
                .verifyIsDisplayed(invalidPasswordAndEmail());
    }
}

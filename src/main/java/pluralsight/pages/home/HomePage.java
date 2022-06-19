package pluralsight.pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pluralsight.pages.BasePage;
import pluralsight.pages.search.SearchActController;
import pluralsight.pages.search.SearchVerifyController;


public class HomePage extends BasePage {
    private HomeActController act;
    private HomeVerifyController verify;

    public HomeActController act() {
        return act;
    }

    public HomeVerifyController verify() {
        return verify;

    }

    private HomePage(HomeActController act, HomeVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }


    public static HomePage getHomePage(){
        return new HomePage(new HomeActController(), new HomeVerifyController());
    }


}

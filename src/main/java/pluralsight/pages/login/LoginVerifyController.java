package pluralsight.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pluralsight.pages.BasePage;

public class LoginVerifyController extends BasePage {

    public static By invalidPasswordAndEmail() {
        return By.xpath("//span[contains(text(),'Invalid user name or password')]");
    }

    public static LoginVerifyController getLoginVerifyController(){
        return new LoginVerifyController();
    }
}

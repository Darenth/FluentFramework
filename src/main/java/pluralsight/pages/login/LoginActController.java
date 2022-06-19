package pluralsight.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pluralsight.pages.BasePage;

import static pluralsight.pages.login.LoginVerifyController.getLoginVerifyController;

public class LoginActController extends BasePage {



    public LoginActController provideCredentials(String login, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for=\"Username\"]")));
        driver.findElement(By.cssSelector("input#Username")).sendKeys(login);
        driver.findElement(By.cssSelector("input#Password")).sendKeys(password);
        return this;
    }

    public LoginActController clickSignIn() {
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        return this;
    }

    public LoginVerifyController andThen(){
        return getLoginVerifyController();
    }
}

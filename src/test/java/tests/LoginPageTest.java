package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(priority = 1)
    public void closeLoginPopup() {
        getInstance().closeLoginPopup();
    }

    @Test(priority = 2)
    public void clickLoginButton() {
        getInstance().clickLoginPageButton();
    }

    @Test(priority = 3)
    public void epostaClick() {
        getInstance().epostaClick();
    }

    @Test(priority = 4)
    public void passwordClick() {
        getInstance().passwordClick();
    }

    @Test(priority = 5)
    public void loginClick() {
        getInstance().loginClick();
    }



    private LoginPage getInstance() {
        return page.getInstance(LoginPage.class);
    }

}

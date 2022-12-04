package tests;

import lombok.SneakyThrows;
import org.testng.annotations.Test;
import org.pages.LoginPage;


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


    @SneakyThrows
    private LoginPage getInstance() {
        return page.getInstance(LoginPage.class);
    }

}

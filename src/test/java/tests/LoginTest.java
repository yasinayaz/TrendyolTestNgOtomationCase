package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void closeLoginPopup() {
        page.getInstance(LoginPage.class).closeLoginPopup();
    }

    @Test(priority = 2)
    public void clickLoginButton() {
        getInstance().clickLoginPageButton();
    }
    @Test(priority = 3)
    public void epostaClick(){
        getInstance().epostaClick();
    }
    @Test(priority = 4)
    public void passwordClick(){
        getInstance().passwordClick();
    }
    @Test(priority = 5)
    public void loginClick() {
        getInstance().loginClick();
    }
    @Test(priority = 6)
    public void searchProduct(){
        getInstance().searchProduct();
    }
    @Test(priority = 7)
    public void searchProductClick(){
        getInstance().searchProductClick();

    }



    private LoginPage getInstance(){
        return page.getInstance(LoginPage.class);
    }

    }

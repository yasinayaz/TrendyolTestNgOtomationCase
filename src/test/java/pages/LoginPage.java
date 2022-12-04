package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Constant;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p[text()='Giriş Yap']")
    public WebElement clickLogin;

    @FindBy(className = "homepage-popup")
    public WebElement closeCookie;


    public void closeLoginPopup() {
        click(Constant.CLOSE_LOGIN_POPUP);
    }

    public void clickLoginPageButton() {
        click(Constant.CLICK_LOGIN_PAGE_BUTTON);
    }

    public void epostaClick() {
        click(Constant.EPOSTA_CLICK);
        writeText(By.xpath("//input[@id='login-email']"), "yasintest44@gmail.com");
    }

    public void passwordClick() {
        click(Constant.PASSWORD_CLICK);
        writeText(By.xpath("//input[@id=\"login-password-input\"]"), "Deneme11");

    }

    public void loginClick() {
        click(Constant.LOGIN_CLICK);
    }

    public void isEnablePage(){
    }




}

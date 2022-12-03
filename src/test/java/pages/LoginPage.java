package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static sun.plugin.javascript.navig.JSType.URL;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath="//p[text()='Giriş Yap']")
    public WebElement clickLogin;

   @FindBy(xpath ="//div[@class=\"modal-close\"]")
   public WebElement closeCookie;

    public void clickLogin(){
        click(By.xpath("//p[text()='Giriş Yap']"));
    }

    public void cookieLoginPageClose() {
        click(By.className("modal-close"));

    }


    /*
    public HomePage signIn() {
        driver.get(URL);
        click(btnEnter);
        return getInstance(HomePage.class);

    }

     */


}

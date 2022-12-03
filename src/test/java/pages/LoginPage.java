package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
        click(By.xpath("//p[text()='Giriş Yap']"));
    }

    public void epostaClick() {
        click(By.xpath("//input[@id='login-email']"));
        writeText(By.xpath("//input[@id='login-email']"), "yasintest44@gmail.com");
    }

    public void passwordClick() {
        click(By.xpath("//input[@id=\"login-password-input\"]"));
        writeText(By.xpath("//input[@id=\"login-password-input\"]"), "Deneme11");

    }

    public void loginClick() {
        click(By.xpath("//button[@class=\"q-primary q-fluid q-button-medium q-button submit\"]"));
    }

    public void searchProduct() {
        timeout();
        click(By.xpath("//input[@class=\"vQI670rJ\"]"));

        writeText(By.xpath("//input[@class=\"vQI670rJ\"]"), "Samsung");
    }

    public void searchProductClick() {
        click(By.xpath("//i[@data-testid=\"search-icon\"]"));
        timeout();

        int numberOfElementsFound = getNumberOfElementsFound(By.xpath("//div[@class=\"p-card-wrppr with-campaign-view\"]"));
        for (int pos = 0; pos < numberOfElementsFound; pos++) {
            System.out.println(pos);
            //  getElementWithIndex(By.cssSelector("p-card-wrppr with-campaign-view"), pos).doWhateverYouWantWithTheElement()
        }
    }




    public int getNumberOfElementsFound(By by) {
        return driver.findElements(by).size();
    }

    public WebElement getElementWithIndex(By by, int pos) {
        return driver.findElements(by).get(pos);

    }
}

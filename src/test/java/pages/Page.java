package pages;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class Page {
    WebDriver driver;
    WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public abstract void click(By locator);

    public abstract WebElement waitElement(By locator);

    public abstract void writeText(By locator, String text);

    public abstract String readText(By locator);

    public abstract String getAlertBoxText();

    public abstract WebElement findElement(By locator);

    public abstract void acceptAlertBox();

    public abstract void selectItem(By locator, String value);

    public abstract void timeout();

    public abstract void scrollPage();

    public abstract int getProductSize(By locator);

    public abstract List<WebElement> multipleFind(By locator);


    @SneakyThrows
    public <T extends BasePage> T getInstance(Class<T> pageClass) {
        return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }

}

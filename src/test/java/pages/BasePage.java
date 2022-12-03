package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void click(By locator) {

        find(locator).click();


    }

    @Override
    public WebElement waitElement(By locator) {
        return null;
    }

    @Override
    public void writeText(By locator, String text) {

    }

    @Override
    public String readText(By locator) {
        return null;
    }

    @Override
    public String getAlertboxText() {
        return null;
    }

    @Override
    public WebElement find(By locator) {
        WebElement element=presenceElement(locator);
        return element;
    }
    public WebElement presenceElement(By key){           //ELEMANI BEKLİYOR
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    @Override
    public List<WebElement> multipleFind(By locator) {
        return null;
    }

    @Override
    public void acceptAlertbox() {

    }

    @Override
    public void selectItem(By locator, String value) {

    }
}

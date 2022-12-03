package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void click(By locator) {
        findElement(locator).click();
    }

    @Override
    public WebElement waitElement(By locator) {
        return null;
    }

    @Override
    public void writeText(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    @Override
    public String readText(By locator) {
        return null;
    }

    @Override
    public String getAlertBoxText() {
        return null;
    }

    @Override
    public WebElement findElement(By locator) {
        WebElement element = presenceElement(locator);
        return element;
    }

    public WebElement presenceElement(By key) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }


    @Override
    public void acceptAlertBox() {

    }

    @Override
    public void selectItem(By locator, String value) {

    }

    @Override
    public void timeout() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void scrollPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3500)", "");  //6 ürün satırı atlayarak 2.sayfaya geçmektedir.
        timeout();
    }

    @Override
    public int getProductSize(By locator) {
        return driver.findElements(locator).size();
    }
}

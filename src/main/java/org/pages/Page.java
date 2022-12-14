package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public abstract class Page {
    WebDriver driver;
    WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    public abstract void click(By locator);

    public abstract void writeText(By locator, String text);

    public abstract String readText(By locator);

    public abstract WebElement findElement(By locator);

    public abstract void timeout();

    public abstract void scrollPage();

    public abstract int getProductSize(By locator);

    public abstract List<WebElement> getElementListFind(By locator);


    public <T extends BasePage> T getInstance(Class<T> pageClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
    }

}

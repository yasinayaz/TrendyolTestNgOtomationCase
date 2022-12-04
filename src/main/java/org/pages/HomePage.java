package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.Constant;

import java.util.List;

public class HomePage extends BasePage {

    static int myFavorListSize = 0;
    static int currentFavorListSize = 0;

    public HomePage(WebDriver driver) {     //constructor
        super(driver);
    }

    public boolean isOnUploadPage() {
        List<WebElement> myFavorList = getElementListFind(Constant.MY_FAVOR_LIST);
        return myFavorList.isEmpty();
    }

    public void getMyFavorList() {
        timeout();
        myFavorListSize = 0;
        click(Constant.CLICK_FAVOR_BUTTON2);
        myFavorListSize = getProductSize(Constant.MY_FAVOR_LIST_SIZE);
        driver.navigate().back();
        timeout();
    }

    public void searchProduct() {
        timeout();
        click(Constant.SEARCH_PRODUCT);
        writeText(By.xpath("//input[@class=\"vQI670rJ\"]"), "Samsung");
    }

    public void searchProductClick() {
        click(Constant.SEARCH_PRODUCT_CLICK);
        timeout();
    }

    public void reScroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-3300)", "");
        timeout();
    }

    public boolean isScroll() {
        timeout();
        return getProductSize(Constant.IS_SCROLL) > 24;
    }

    public void hideOverlayButton() {
        click(Constant.HIDEOVERLAY_BUTTON);
    }

    public void selectFavoryButton() {
        click(Constant.SELECT_FAVOR_BUTTON);
    }

    public void clickFavorButton() {
        timeout();
        click(Constant.CLICK_FAVOR_BUTTON1);
        timeout();
    }

    public boolean controlMyFavorList() {

        int myCurrentFavorList = getProductSize(By.xpath("//div[@class=\"p-card-wrppr\"]"));
        currentFavorListSize = myCurrentFavorList;
        return myCurrentFavorList > myFavorListSize;
    }

    public void removeFavorButton() {
        click(Constant.REMOVE_FAVOR_BUTTON);


    }
}

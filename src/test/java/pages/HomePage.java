package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Constant;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {     //constructor
        super(driver);
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

    public int isScroll() {
        timeout();
        return getProductSize(Constant.IS_SCROLL);
    }

    public void hideOverlayButton(){
        click(Constant.HIDEOVERLAY_BUTTON);
    }

    public void selectFavoryButton(){
        click(Constant.SELECT_FAVOR_BUTTON);
        timeout();
    }

    public void clickFavorButton(){
        click(Constant.CLICK_FAVOR_BUTTON);
        timeout();
    }

    public void removeFavorButton(){
        click(Constant.REMOVE_FAVOR_BUTTON);
    }





}

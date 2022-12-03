package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void searchProduct() {
        getInstance().searchProduct();
    }

    @Test(priority = 2)
    public void searchProductClick() {
        getInstance().searchProductClick();

    }

    @Test(priority = 3)
    public void scroll() {
        page.scrollPage();
    }

    @Test(priority = 4)
    public void isScroll() {
        int productSize = getInstance().isScroll();
        Assert.assertTrue(productSize > 24);
    }

    @Test(priority = 5)
    public void hideOverlayButton(){
        getInstance().hideOverlayButton();
    }

    @Test(priority = 6)
    public void selectFavoryButton(){
        getInstance().selectFavoryButton();
    }

    @Test(priority = 7)
    public void clickFavoryButton(){
        getInstance().clickFavorButton();
    }

    @Test(priority = 8)
    public void removeFavoryButton(){
        getInstance().removeFavorButton();
    }

    private HomePage getInstance() {
        return page.getInstance(HomePage.class);
    }

}

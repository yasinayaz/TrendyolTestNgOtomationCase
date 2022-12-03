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

    private HomePage getInstance() {
        return page.getInstance(HomePage.class);
    }

}

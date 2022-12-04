package tests;

import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.pages.HomePage;


public class HomePageTest extends BaseTest {

    @Test(priority = 2)
    public void getMyFavorList(){
        getInstance().getMyFavorList();
    }

    @Test(priority = 1)
    public void isOnUploadPage(){
       Assert.assertFalse(getInstance().isOnUploadPage(),"ana sayfa yüklenmedi");

    }

    @Test(priority = 3)
    public void searchProduct() {
        getInstance().searchProduct();
    }

    @Test(priority = 5)
    public void searchProductClick() {
        getInstance().searchProductClick();

    }

    @Test(priority = 7)
    public void scroll() {
        page.scrollPage();
    }

    @Test(priority = 9)
    public void isScroll() {
        boolean productSize = getInstance().isScroll();
        Assert.assertTrue(productSize,"2.Sayfaya geçilmemiştir");
    }

    @Test(priority = 11)
    public void hideOverlayButton(){
        getInstance().hideOverlayButton();
    }

    @Test(priority = 13)
    public void selectFavoryButton(){
        getInstance().selectFavoryButton();
    }

    @Test(priority = 14)
    public void reScroll(){
        getInstance().reScroll();
    }

    @Test(priority = 15)
    public void clickFavoryButton(){
        getInstance().clickFavorButton();
    }

    @Test(priority = 17)
    private void controlMyFavorList(){
        boolean controlMyFavorList = getInstance().controlMyFavorList();
        Assert.assertTrue(controlMyFavorList,"Ürün favorilerim'e eklenememiştir");
    }

    @Test(priority = 19)
    public void removeFavoryButton(){
        getInstance().removeFavorButton();
    }

    @SneakyThrows
    private HomePage getInstance() {
        return page.getInstance(HomePage.class);
    }

}

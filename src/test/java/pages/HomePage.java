package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {     //constructor
        super(driver);
    }

    public void searchProduct() {
        timeout();
        click(By.xpath("//input[@class=\"vQI670rJ\"]"));

        writeText(By.xpath("//input[@class=\"vQI670rJ\"]"), "Samsung");
    }

    public void searchProductClick() {
        click(By.xpath("//i[@data-testid=\"search-icon\"]"));
        timeout();
    }

    public int isScroll() {
        timeout();
        return getProductSize(By.xpath("//div[@class=\"p-card-wrppr with-campaign-view\"]"));
    }

    public WebElement getElementWithIndex(By by, int pos) {
        return driver.findElements(by).get(pos);

    }


}

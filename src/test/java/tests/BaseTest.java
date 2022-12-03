package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class BaseTest {

    //region Variables
    protected WebDriver driver;
    protected ChromeOptions chromeOptions;
    public Page page;                    // GLOBAL DEĞERİ TANIMLANDI

    //endregion
    @BeforeClass                          //ANNOTATION
    public void classSetUp() {
        driver = Drivers.initialize_driver(ConfigReader.initialize_Properties().getProperty("browser"));
    }

    @BeforeMethod
    public void methodSetup() {
        page = new BasePage(driver);
    }

    @AfterClass
    public void tearDown() {
        //     driver.quit();
    }
}


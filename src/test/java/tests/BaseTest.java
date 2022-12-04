package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.pages.BasePage;
import org.pages.Page;
import org.utilities.ConfigReader;
import org.utilities.Constant;
import org.utilities.Drivers;

public class BaseTest {

    protected WebDriver driver;
    public Page page;

    @BeforeClass
    public void classSetUp() {
        driver = Drivers.initialize_driver(ConfigReader.initialize_Properties().getProperty(Constant.BROWSER));
    }

    @BeforeMethod
    public void methodSetup() {
        page = new BasePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}


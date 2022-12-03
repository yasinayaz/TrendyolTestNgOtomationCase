package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.LoginPage;
import pages.Page;
import utilities.ConfigReader;
import utilities.Drivers;

public class BaseTest {

    //region Variables
    protected WebDriver driver;
    protected ChromeOptions chromeOptions;
    public LoginPage loginPage;  // GLOBAL DEĞERİ TANIMLANDI
    //endregion
    @BeforeClass                 //ANNOTATION
    public void classSetUp() {
      driver=  Drivers.initialize_Driver(ConfigReader.initialize_Properties().getProperty("browser"));
    }
    @BeforeMethod
    public void methodSetup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void cookieLoginPageClose(){
        loginPage.cookieLoginPageClose();
    }

    @Test
    public void loginPage(){
        loginPage.clickLogin();


    }



    @AfterClass
    public void tearDown() {
   //     driver.quit();
    }
}


package org.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Drivers {

    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_driver(String browser) {

        if (driver == null) {
            properties = ConfigReader.getProperties();
            if (browser.equals(Constant.CHROME)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equals(Constant.FIREFOX)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else {
                WebDriverManager.edgedriver().setup();    //Bos gonderirse
                driver = new EdgeDriver();
            }
            String url = properties.getProperty(Constant.TRENDYOL_URL);
            int impWait = Integer.parseInt(properties.getProperty(Constant.IMPLICITY_WAIT));
            int pageWait = Integer.parseInt(properties.getProperty(Constant.PAGE_LOAD_TIMEOUT));
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);
        }

        return getDriver();

    }

    public static WebDriver getDriver() {
        return driver;
    }
}

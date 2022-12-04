package org.utilities;

import org.openqa.selenium.By;

public class Constant {

    /*
     *GENERAL
     */

    public static String TRENDYOL_URL = "trendyolUrl";

    public static String CHROME = "Chrome";

    public static String FIREFOX = "Firefox";

    public static String IMPLICITY_WAIT = "implicityWait";

    public static String PAGE_LOAD_TIMEOUT = "pageLoadTimeout";

    public static String BROWSER = "browser";

    public static String CONFIG_PROPERTIES_PATH = "src/test/config.properties";




    /*
     *LoginPage için locater tanımlamaları
     */

    public static By CLOSE_LOGIN_POPUP = By.className("modal-close");

    public static By CLICK_LOGIN_PAGE_BUTTON = By.xpath("//p[text()='Giriş Yap']");

    public static By EPOSTA_CLICK = By.xpath("//input[@id='login-email']");

    public static By PASSWORD_CLICK = By.xpath("//input[@id=\"login-password-input\"]");

    public static By LOGIN_CLICK = By.xpath("//button[@class=\"q-primary q-fluid q-button-medium q-button submit\"]");


    /*
     *HomePage için locater tanımlamaları
     */

    public static By SEARCH_PRODUCT = By.xpath("//input[@class=\"vQI670rJ\"]");

    public static By SEARCH_PRODUCT_CLICK = By.xpath("//i[@data-testid=\"search-icon\"]");

    public static By IS_SCROLL = By.xpath("//div[@class=\"p-card-wrppr with-campaign-view\"]");

    public static By HIDEOVERLAY_BUTTON = By.xpath("//div[@class=\"overlay\"]");

    public static By SELECT_FAVOR_BUTTON = By.xpath("(//div[@class=\"fvrt-btn-wrppr\"])[27]");

    public static By CLICK_FAVOR_BUTTON2 = By.xpath("(//div[@class=\"icon-container\"])[2]");

    public static By CLICK_FAVOR_BUTTON1 = By.xpath("//p[text()=\"Favorilerim\"]");

    public static By REMOVE_FAVOR_BUTTON = By.xpath("//div[@class=\"ufvrt-btn-wrppr\"]");

    public static By MY_FAVOR_LIST = By.xpath("//a[@title=\"trendyol\"]");

    public static By MY_FAVOR_LIST_SIZE = By.xpath("//div[@class=\"p-card-wrppr\"]");


}

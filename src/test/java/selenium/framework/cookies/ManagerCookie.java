package selenium.framework.cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import selenium.framework.browser.Browser;

public class ManagerCookie {
    private static WebDriver driver = Browser.BROWSER.getDriver();

    public static void addCookie(String name, String value) {
        driver.manage().addCookie(new Cookie(name, value));

    }

    public static Cookie getCookieByName(String name){
        return driver.manage().getCookieNamed(name);
    }



}

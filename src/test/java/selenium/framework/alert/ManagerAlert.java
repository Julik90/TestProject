package selenium.framework.alert;

import org.openqa.selenium.WebDriver;
import selenium.framework.browser.Browser;

public class ManagerAlert {

    private static WebDriver driver = Browser.BROWSER.getDriver();

    public static String getText() {
        return driver.switchTo().alert().getText();
    }

    public static void closeAlert() {
        driver.switchTo().alert().accept();


    }

}

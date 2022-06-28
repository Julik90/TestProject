package selenium.project.pages;

import org.openqa.selenium.WebDriver;
import selenium.framework.browser.Browser;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage () {
        this.driver = Browser.BROWSER.getDriver();
    }
}

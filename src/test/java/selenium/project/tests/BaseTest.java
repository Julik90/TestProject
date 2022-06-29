package selenium.project.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.framework.browser.Browser;

public class BaseTest {

    private Browser browser = Browser.BROWSER;

    @BeforeMethod
    public void setUp() {
        browser.window();

    }

    @AfterMethod
    public void tearDown() {
        if (browser != null) {
            browser.close();
        }
    }
}

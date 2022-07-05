package selenium.project.tests;

import kong.unirest.Unirest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.framework.browser.Browser;
import selenium.utils.ConfigFileReader;

public class BaseTest {

//    private Browser browser = Browser.BROWSER;
//
//    @BeforeMethod
//    public void setUp() {
//        browser.window();
//
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (browser != null) {
//            browser.close();
//        }
//    }
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeMethod
    public void before() {
        Unirest.config().defaultBaseUrl(config.getApplicationUrl());
    }
}

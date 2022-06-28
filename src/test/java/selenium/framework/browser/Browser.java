package selenium.framework.browser;

import org.openqa.selenium.WebDriver;
import selenium.utils.ConfigFileReader;

public class Browser {

    private WebDriver driver;
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    public static final Browser BROWSER = new Browser();

    private Browser(){
        driver = BrowserFactory.getDriver(config.getBrowserName());

    }

    public void open(){
        driver.get(config.getUrlWithBasicAuth());
    }

    public void close(){
        driver.quit();

    }

    public void window(){
        driver.manage().window().maximize();

    }

    public WebDriver getDriver(){
        return driver;

    }

}

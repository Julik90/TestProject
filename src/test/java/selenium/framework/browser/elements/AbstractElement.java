package selenium.framework.browser.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.framework.browser.Browser;

import java.time.Duration;

public abstract class AbstractElement {

    private String name;
    private By locator;
    private WebDriverWait wait;
    private WebDriver driver;

    public AbstractElement(String name, By locator) {
        this.name = name;
        this.locator = locator;
        this.driver = Browser.BROWSER.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public WebElement findElement (){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return driver.findElement(locator);

    }

    public void click() {
        WebElement element = findElement();
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String getText() {
        return findElement().getText();
    }
}

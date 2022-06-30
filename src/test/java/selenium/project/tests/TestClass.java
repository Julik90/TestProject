package selenium.project.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.framework.alert.ManagerAlert;
import selenium.project.pages.AuthorizationPage;
import selenium.project.pages.BasePage;
import selenium.project.pages.HomePage;
import selenium.project.tests.BaseTest;
//import selenium.project.pages.MainPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestClass extends BaseTest {
//    private WebDriver driver;

//
//    public void test() {
//        MainPage mainPage = new MainPage();
//        mainPage.open();
//        mainPage.clickLogIn();
//        AuthorizationPage authorizationPage = new AuthorizationPage();
//        authorizationPage.fillLogin("julik200890");
//        authorizationPage.clickIn();
//        authorizationPage.fillPasswd(" ");
//
//
//        WebElement in2 = driver.findElement(By.xpath("//button[@id='passp:sign-in']"));
//        in2.click();
//        WebElement in3 = driver.findElement(By.xpath("//button[@data-t='button:action']"));
//        in3.click();
//        WebElement catalog = driver.findElement(By.xpath("//span[text()='Каталог']"));
//        catalog.click();
//        List<WebElement> elements = driver.findElements(By.xpath("//li[@data-zone-name = 'category-link']"));
//        Assert.assertEquals(elements.size(), 26, " ");
//        int random = (int) (Math.random() * elements.size());
//        elements.get(random).click();
//
//        Assert.assertEquals(homePage.getText(), "{\n" +
//                "  \"authenticated\": true, \n" +
//                "  \"user\": \"user\"\n" +
//                "}", "text does not match");

//        Assert.assertEquals(homePage.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor", "text does not match");
//        homePage.switchIframe();
//        homePage.clearText();
//        homePage.sendText("0123456789");
//        Thread.sleep(2000);
//    }

    @Test
    public void test2() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.clickJSAlert();
        Assert.assertEquals(ManagerAlert.getText(), "I am a JS Alert", "text does not match");
        ManagerAlert.closeAlert();
        Assert.assertEquals(homePage.getMessage(), "You successfully clicked an alert", "text did not appear");
        homePage.clickJSConfirm();
        Assert.assertEquals(ManagerAlert.getText(), "I am a JS Confirm", "text does not match");
        ManagerAlert.closeAlert();
        Assert.assertEquals(homePage.getMessage2(), "You clicked: Ok", "text did not appear");
        homePage.clickJSprompt();
        Assert.assertEquals(ManagerAlert.getText(), "I am a JS prompt", "text does not match");
        ManagerAlert.closeAlert();
        Assert.assertEquals(homePage.getMessage3(), "You entered: hello\n" +
                "\n", "text did not appear");








    }
}
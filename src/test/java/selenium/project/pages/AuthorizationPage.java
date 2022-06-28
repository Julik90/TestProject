package selenium.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthorizationPage extends BasePage {

    private By login = By.xpath("//input[@name='login']");
    private By in = By.xpath("//button[@id='passp:sign-in']");
    private By passwd = By.xpath("//input[@name='passwd']");




//    public void fillLogin(String login){
//        getDriver().findElement(this.login).sendKeys(login);
//    }
//
//    public void clickIn(){
//        getDriver().findElement(in).click();
//    }
//
//    public void fillPasswd(String passwd){
//        getDriver().findElement(this.passwd).sendKeys(passwd);
//    }
//


}

package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.browser.Browser;
import selenium.framework.browser.elements.FormElement;

public class HomePage extends BasePage {

    private FormElement title = new FormElement("title", By.xpath("//div/h3"));
    private String idIframe = "mce_0_ifr";
    private FormElement textIframe = new FormElement("textIframe", By.xpath("//body/p"));


    public void open() {
        Browser.BROWSER.open();
    }

    public String getText(){
       return title.getText();
    }

    public void switchIframe() {
        switchIframe(idIframe);

    }

     public void clearText(){
        textIframe.clearText();

     }

     public void sendText(String text){
        textIframe.sendText(text);
     }
}






package selenium.project.pages;

import org.openqa.selenium.By;
import selenium.framework.browser.Browser;
import selenium.framework.browser.elements.FormElement;

public class HomePage extends BasePage {

//    private FormElement title = new FormElement("title", By.xpath("//div/h3"));
//    private String idIframe = "mce_0_ifr";
//    private FormElement textIframe = new FormElement("textIframe", By.xpath("//body/p"));
//
    private FormElement button1 = new FormElement("button1", By.xpath("//button[@onclick='jsAlert()'] "));
    private FormElement message1 = new FormElement("message1", By.id("result"));
    private FormElement button2 = new FormElement("button2", By.xpath("//button[@onclick = 'jsConfirm()']"));
    private FormElement message2 = new FormElement("message2", By.id("result"));
    private FormElement button3 = new FormElement("button3", By.xpath("//button[@onclick='jsPrompt()'] "));
    private FormElement message3 = new FormElement("message3", By.id("result"));


    public void open() {
        Browser.BROWSER.open();
    }

//    public String getText(){
//       return title.getText();
//    }
//
//    public void switchIframe() {
//        switchIframe(idIframe);
//
//    }
//
//     public void clearText(){
//        textIframe.clearText();
//
//     }
//
//     public void sendText(String text){
//        textIframe.sendText(text);
//     }

    public void clickJSAlert(){
        button1.click();
    }

    public String getMessage(){
        return message1.getText();


    }

    public void clickJSConfirm(){
        button2.click();
    }
    public String getMessage2() {
        return message2.getText();
    }

    public void clickJSprompt(){
        button3.click();
    }
    public String getMessage3(){
        return message3.getText();
}}












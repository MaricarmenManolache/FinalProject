package Pages;

import Methods.AlertMethods;
import Methods.ElementMethods;
import Methods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public ElementMethods elementMethods;
    public FrameMethods frameMethods;
    public AlertMethods alertMethods;
    public WebDriver driver;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        frameMethods= new FrameMethods(driver);
        alertMethods= new AlertMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (css = "form>div>div>input[type='email']")
    public WebElement inputEmail;
    @FindBy (css = "div>input[type='password']")
    public WebElement inputPassword;
    @FindBy (css = "button[title='Autentificare']")
    public WebElement butonAutentificare;
    @FindBy (xpath = "//*[@id=\"top\"]/body/div[1]/ul/li/div/ul/li/ul/li/span")
    public WebElement mesajInvalid;
    @FindBy (xpath = "//*[@id=\"top\"]/body/header/div[4]/div[1]/form/input")
    public WebElement searchBarInput;
    @FindBy (css = "a[onclick='submitShowAllBtn()']")
    public WebElement searchAll;
    @FindBy (css = "a[title='Contul meu']")
    public WebElement contulMeu;

    public void logareCredentialeOk(String value, String value1){
        elementMethods.fillElement(inputEmail, value);
        elementMethods.fillElement(inputPassword, value1);
        elementMethods.clickElement(butonAutentificare);
    }

    public void search(WebElement element, String value){
        elementMethods.fillElement(element, value);
        elementMethods.clickElement(searchAll);
    }
    public void contulMeu(){
        elementMethods.clickElement(contulMeu);
    }
}

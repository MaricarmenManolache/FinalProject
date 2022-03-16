package Pages;

import Methods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public ElementMethods elementMethods;
    public WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        elementMethods=new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"top\"]/body/div[6]/div/div[1]/div/div[2]/button[1]")
    public WebElement acceptCookiesElement;
    @FindBy (id = "automated_belka_exit")
    public WebElement dismissButtonElement;
    @FindBy (css = "a[title='Logare']")
    public WebElement logareBotton;
    @FindBy (xpath= "//*[@id='mega-menu-list']/li[1]/a")
    public WebElement shop;


    public void acceptCookiesProcess(){
        elementMethods.clickElement(acceptCookiesElement);
    }
    public void dismiss(){
        elementMethods.clickElement(dismissButtonElement);
    }
    public void clickLogare(){
        elementMethods.clickElement(logareBotton);
    }

    public void incaltaminteDamaProcess(){elementMethods.clickElement(shop);}


    //  public void scrollProcess(String scroll){
    //    elementMethods.scroll(scroll);

    }



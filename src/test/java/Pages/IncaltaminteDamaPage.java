package Pages;

import Methods.ElementMethods;
import com.sun.glass.ui.monocle.X11Cursor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncaltaminteDamaPage {
    public ElementMethods elementMethods;
    public WebDriver driver;

    public IncaltaminteDamaPage(WebDriver driver) {
        this.driver = driver;
        elementMethods=new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "button[data-id='10966']")
    public WebElement adidasCheck;
    @FindBy (xpath = "//*[@id=\"top\"]/body/div[3]/div[1]/div[4]/div[1]/div[1]/div/ul/li[1]/a")
    public WebElement check;
    @FindBy (css = "a[type='button']")
    public  WebElement filterButton;
    @FindBy(css = "img[alt='Pantofi adidas - Court Tourino J H00764 Ftwwht/Ftwwht/Ftwwht']")
    public WebElement adidasElement;
    @FindBy (css = "a[href='//www.epantofi.ro/dama/producatori:adidas/marime:28.html']")
    public WebElement marime28Buton;
    @FindBy(xpath = "//*[@id=\"top\"]/body/div[3]/div/div[5]/ul/li[1]/div/a/h2/span[1]")
    public WebElement slapi;
    @FindBy (css = "button[data-testid='product-add-to-cart-button']")
    public WebElement adaugaInCosButonElement;
    @FindBy (xpath = "//*[@id=\"product_addtocart_form\"]/section/div[2]/div/div[6]/div[2]/div/div/div/div[1]/div[3]/div/button[7]")
    public WebElement marime35;
    @FindBy (xpath = "//*[@id=\"product_addtocart_form\"]/section/div[2]/div/div[6]/div[3]/div/div/div[1]/div/div/div[2]/a")
    public WebElement mergiLaCosButon;




    public void checkAdidas(){
        elementMethods.clickElement(adidasCheck);
    }

    public void scroll(WebElement element, String value){
        elementMethods.scroll(check, value);
    }

    public void finalizeaza(){
        elementMethods.clickElement(filterButton);
    }

    public void alegeMarime28(){
        elementMethods.clickElement(marime28Buton);
    }
    public void alegePantofi(){
        elementMethods.clickElement(slapi);
    }

    public void adaugaInCos(WebElement element, String value) throws InterruptedException {
        elementMethods.clickElement(adaugaInCosButonElement);
        elementMethods.clickElement(marime35);
        Thread.sleep(600);
        elementMethods.clickElement(mergiLaCosButon);
        elementMethods.fillElement(element,value);
    }
}

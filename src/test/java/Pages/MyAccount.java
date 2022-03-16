package Pages;

import Methods.AlertMethods;
import Methods.ElementMethods;
import Methods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAccount {
    public ElementMethods elementMethods;
    public FrameMethods frameMethods;
    public AlertMethods alertMethods;
    public WebDriver driver;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        elementMethods=new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"top\"]/body/div[4]/div[1]/div/div[2]/ul")
    public List<WebElement> listaMeniu;


}

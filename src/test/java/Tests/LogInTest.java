package Tests;

import Methods.ElementMethods;
import Pages.IndexPage;
import Pages.LogInPage;
import SharedData.SharedData;
import org.junit.Test;

public class LogInTest extends SharedData {
 public IndexPage indexPage;
 public LogInPage logInPage;
 public ElementMethods elementMethods;

    @Test
    public void LogareCredentialeOk(){
        indexPage=new IndexPage(driver);
        logInPage =new LogInPage(driver);
        indexPage.acceptCookiesProcess();
        indexPage.dismiss();
        indexPage.clickLogare();
        logInPage.logareCredentialeOk("mari98carmen@yahoo.com", "Maricarmen123");
        logInPage.search(logInPage.searchBarInput, "vans");
        logInPage.contulMeu();

    }
}

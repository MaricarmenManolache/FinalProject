package Tests;

import Methods.ElementMethods;
import Pages.IndexPage;
import Pages.LogInPage;
import SharedData.SharedData;
import org.junit.Test;

public class FailedLogInTest extends SharedData {
    public IndexPage indexPage;
    public LogInPage logInPage;
    public ElementMethods elementMethods;

    @Test
    public void LogareCredentialeInexistente() {
        indexPage = new IndexPage(driver);
        logInPage = new LogInPage(driver);
        elementMethods = new ElementMethods(driver);
        indexPage.acceptCookiesProcess();
        indexPage.dismiss();
        indexPage.clickLogare();
        logInPage.logareCredentialeOk("test@yahoo.com", "test123");
         elementMethods.validationElementText(logInPage.mesajInvalid, "Parola logare nevalida.");
    }
}

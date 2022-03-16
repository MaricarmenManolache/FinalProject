package Tests;

import Methods.ElementMethods;
import Pages.IncaltaminteDamaPage;
import Pages.IndexPage;
import Pages.LogInPage;
import SharedData.SharedData;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class ExplorationTest extends SharedData {
    public IndexPage indexPage;
    public LogInPage logInPage;
    public IncaltaminteDamaPage incaltaminteDamaPage;
    public ElementMethods elementMethods;

        @Test
    public void ExplorationTest() throws InterruptedException {
        indexPage=new IndexPage(driver);
        logInPage =new LogInPage(driver);
        incaltaminteDamaPage= new IncaltaminteDamaPage(driver);
        indexPage.acceptCookiesProcess();
        Thread.sleep(1000);
        indexPage.incaltaminteDamaProcess();
        incaltaminteDamaPage.scroll(incaltaminteDamaPage.check, "window.scrollBy(0,900)");
        incaltaminteDamaPage.checkAdidas();
        incaltaminteDamaPage.scroll(incaltaminteDamaPage.filterButton, "window.scrollBy(0,200)");
        Thread.sleep(1000);
        incaltaminteDamaPage.finalizeaza();
        incaltaminteDamaPage.alegeMarime28();
        Thread.sleep(1000);
            JavascriptExecutor js=(JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,300)");
        incaltaminteDamaPage.alegePantofi();
    }
}

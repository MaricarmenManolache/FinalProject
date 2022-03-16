package SharedData;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SharedData {
    public WebDriver driver;

    @Before
    public void SetUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.epantofi.ro/");
        driver.manage().window().maximize();

        //wait implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
            public void After (){
        driver.quit();
    }

}

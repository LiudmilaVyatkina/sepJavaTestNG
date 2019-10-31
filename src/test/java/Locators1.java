import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators1 {
    WebDriver driver;
    String url = "http://www.gmail.com";

    @AfterTest
    public void terminateBrowser() {
        driver.close();
    }

    @BeforeTest
    public void launchBrowser() {

        System.setProperty("webdriver.gecko.driver", "/Users/admin/IdeaProjects/sepJavaTestNG/src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    @Test
    public void testXpathCHeck() {
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));

    }
}

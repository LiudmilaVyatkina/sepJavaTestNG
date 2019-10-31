import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
    WebDriver driver;

    String baseUrl = "http://demo.guru99.com/test/newtours/";

    @AfterTest                            //Jumbled
    public void terminateBrowser(){
        driver.close();
    }
    @BeforeTest                            //Jumbled
    public void launchBrowser() {
        System.out.println("launching firefox browser");
        System.setProperty("webdriver.gecko.driver", "/Users/admin/IdeaProjects/sepJavaTestNG/src/test/resources/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get(baseUrl);
    }

    @Test
    public void testverifyHomepageTitle() {
        String expectedTitle= "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}

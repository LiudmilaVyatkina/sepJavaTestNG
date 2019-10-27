import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

public class Checkboxes {



    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/Users/admin/IdeaProjects/sepJavaTestNG/src/test/resources/drivers/geckodriver");
   driver = new FirefoxDriver();
    }

    @Test
    public void test00001() {
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);
     List<WebElement> listOfInputs = driver.findElements(By.tagName("input"));

        int numberOfImputs = listOfInputs.size();
        Assert.assertTrue(numberOfImputs == 2);

        WebElement input1 = listOfInputs.get(0);
        WebElement input2 = listOfInputs.get(1);

        boolean isInput1Displayed = input1.isDisplayed();

        Assert.assertTrue(isInput1Displayed);
        String input1CheckedValue = input1.getAttribute("checked");

        if (input1CheckedValue == null) {
           input1.click();

        }

        input1CheckedValue = input1.getAttribute("checked");
                Assert.assertEquals(input1CheckedValue, "true", "input attribute is equal " + input1CheckedValue);

    }

    @AfterSuite
    public void AfterSuite() {
        driver.quit();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleSearchTests<waitForResultsElement> {

    WebDriver driver;
    String resultStatsID = "resultStats";

    @AfterSuite
    public void AfterSuite() {
     //   driver.quit();
    }
     @Parameters({ "testDataQuery" })

    @Test
    public void test0001(String param1) {
        System.setProperty("webdriver.gecko.driver", "/Users/admin/IdeaProjects/sepJavaTestNG/src/test/resources/drivers/geckodriver");


    openBrowser();
    novigateToMainPage();
    typeQuery(param1);
    submitSerach();
    waitForResultsElement();
    assertResultsPage();
    }

     private void waitForResultsElement(){

        By elementToWait = By.id(resultStatsID);
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(condition);
        // WebElement myDynamicElement = (new WebDriverWait(driver, 10))
         // .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")

    }
    private void assertResultsPage() {

        WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));

        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;

        Assert.assertEquals(isDisplayed, expected);

    }

    private void submitSerach() {
        String selector = ".gLFyf";
        driver.findElement(By.cssSelector(selector)).submit();
    }

    private void typeQuery(String queryToType) {
        String selector = ".gLFyf";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys( queryToType);

    }

    private void novigateToMainPage() {
        String url = "http://www.google.com";
        driver.get(url);

    }

    private void openBrowser() {
        driver = new FirefoxDriver();
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

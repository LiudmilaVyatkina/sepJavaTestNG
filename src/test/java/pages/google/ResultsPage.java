package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ResultsPage {

    private WebDriver driver;
    String resultStatsID = "resultStats";

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void waitForResultsElement() {

        By elementToWait = By.id(resultStatsID);
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(condition);
        // WebElement myDynamicElement = (new WebDriverWait(driver, 10))
        // .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")

    }

    public void assertResultsPage() {

        WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));

        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;

        Assert.assertEquals(isDisplayed, expected);

    }

}
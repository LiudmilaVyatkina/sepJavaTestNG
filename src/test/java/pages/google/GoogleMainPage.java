package pages.google;

import googlesearchuitets.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



    public class GoogleMainPage extends BaseTest {

        WebDriver driver;
        By textInputByCss = By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input");

        String url = "http://www.google.com";

        public GoogleMainPage(WebDriver driver) {
            this.driver = driver;
        }

        public void novigate() {
            driver.get(url);
        }


        public void typeQuery(String quoryToType) {
            WebElement webElement = driver.findElement(textInputByCss);
            webElement.sendKeys(quoryToType);
        }

        public void submitSerach() {

            driver.findElement(textInputByCss).submit();
        }


        public void verifySuggestion() {
            // driver.findElement(textInputByCss).getAttribute();
        }




    }




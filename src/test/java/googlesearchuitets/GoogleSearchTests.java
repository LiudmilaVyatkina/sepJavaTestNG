package googlesearchuitets;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.ResultsPage;

public class GoogleSearchTests extends BaseTest {


     @Parameters({ "testDataQuery" })

    @Test
    public void test0001() {

         GoogleMainPage mainPage = new GoogleMainPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);


    mainPage.novigate();

    mainPage.typeQuery("Portnov School");
    mainPage.submitSerach();
    mainPage.verifySuggestion();
    resultsPage.waitForResultsElement();
    resultsPage.assertResultsPage();
    }



}

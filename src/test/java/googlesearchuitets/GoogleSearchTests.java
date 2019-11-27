package googlesearchuitets;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.ResultsPage;

public class GoogleSearchTests extends BaseTest {

    @DataProvider(name = "dataForGoogleTest")
    public Object[][] createData1() {
        return new Object[][] {
                { "Portnov Computer School" },
                { "frew43rti4331433123434@#@#@#@#"},
        };
    }
     @Parameters({ "testDataQuery" })

    @Test(dataProvider = "dataForGoogleTest")
    public void test0001(String queryToType) {

         GoogleMainPage mainPage = new GoogleMainPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);


    mainPage.novigate();

    mainPage.typeQuery(queryToType);
    mainPage.submitSerach();
    mainPage.verifySuggestion();
    resultsPage.waitForResultsElement();
    resultsPage.assertResultsPage();
    }



}

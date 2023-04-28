package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.SearchPage;
import utils.DriverManager;

public class SearchPageSteps {
    SearchPage searchPage = new SearchPage(DriverManager.getDriver());



    @Then("should see the Search Page")
    public void shouldSeeTheSearchPage() {
    }

    @When("sendkeys Search Area {string} on Search Page")
    public void sendkeysSearchAreaOnSearchPage(String arg0) {
    }

}
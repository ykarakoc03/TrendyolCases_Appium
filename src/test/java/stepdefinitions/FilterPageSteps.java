package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FilterPage;
import utils.DriverManager;

public class FilterPageSteps {
    FilterPage filterPage = new FilterPage(DriverManager.getDriver());



    @Then("should see the Filter Page")
    public void shouldSeeTheFilterPage() {
    }

    @When("taps Filter {string} on Filter Page")
    public void tapsFilterOnFilterPage(String arg0) {
    }

    @When("taps List Products {string} on Filter Page")
    public void tapsListProductsOnFilterPage(String arg0) {
    }

}

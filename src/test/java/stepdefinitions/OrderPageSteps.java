package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.OrderPage;
import utils.DriverManager;

public class OrderPageSteps {
    OrderPage orderPage = new OrderPage(DriverManager.getDriver());




    @Then("should see the Order Page")
    public void shouldSeeTheOrderPage() {
    }

    @When("taps Option {string} on Order Page")
    public void tapsOptionOnOrderPage(String arg0) {
    }

}

package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;

import utils.DriverManager;

public class HomePageSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver());





    @Then("should Popup Close Button on Home Page")
    public void shouldPopupCloseButtonOnHomePage() {
    }

    @Then("should see the Home Page")
    public void shouldSeeTheHomePage() {
    }

    @When("taps Search Area on Home Page")
    public void tapsSearchAreaOnHomePage() {
    }






}

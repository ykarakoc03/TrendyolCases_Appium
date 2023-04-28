package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.ResultPage;
import utils.DriverManager;

public class ResultPageSteps {
    ResultPage resultPage = new ResultPage(DriverManager.getDriver());


    @Then("should see the Result Page")
    public void shouldSeeTheResultPage() {
    }

    @When("taps Filter on Result Page")
    public void tapsFilterOnResultPage() {
    }



    @When("taps Order on Result Page")
    public void tapsOrderOnResultPage() {
    }


    @When("taps second Product on Result Page")
    public void tapsSecondProductOnResultPage() {
    }


}

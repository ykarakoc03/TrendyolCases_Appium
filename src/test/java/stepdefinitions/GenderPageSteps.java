package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.GenderPage;
import pages.HomePage;
import utils.DriverManager;

public class GenderPageSteps {
    GenderPage genderPage = new GenderPage(DriverManager.getDriver());


    @Given("user should see the Gender Page")
    public void userShouldSeeTheGenderPage() {
        genderPage.checkGenderButton("ERKEK");
    }

    @When("taps Gender {string} on Gender Page")
    public void tapsGenderOnGenderPage(String genderButton) {
        genderPage.clickGenderBUtton(genderButton);
    }


}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BankingAppHomePage;
import utils.PlaywrightDriver;

public class BankingAppSteps {

    BankingAppHomePage appHomePage=new BankingAppHomePage();

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String string) {

        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("siteurl"));

    }

   /* @Given("I validate banking app page title")
    public void i_validate_banking_app_page_title() {

    }*/

    @When("I enter {string} in the First Name field")
    public void i_enter_in_the_first_name_field(String first_name) {

        appHomePage.enterFirstName(first_name);

    }
    @When("I enter {string} in the Last Name field")
    public void i_enter_in_the_last_name_field(String last_name) {

        appHomePage.enterLastName(last_name);

    }
    @When("I enter {string} in the Email field")
    public void i_enter_in_the_email_field(String email) {
        appHomePage.enterEmailID(email);

    }

    @When("I enter a valid {string} in the Password field")
    public void i_enter_a_valid_in_the_password_field(String password) {
        appHomePage.enterPassword("Test123@");
    }


    @When("I select {string} as my Gender")
    public void i_select_as_my_gender(String gender) {

        appHomePage.selectGender("Male");

    }
    @When("I select the hobbies {string}")
    public void i_select_the_hobbies(String hobbies) {

        appHomePage.selectCheckBoxes(hobbies);

    }
    @When("I enter {string} in the About Yourself field")
    public void i_enter_in_the_about_yourself_field(String about){

        appHomePage.enterAboutYourSelf(about);


    }
    @When("I click the Register button")
    public void i_click_the_register_button() {

        appHomePage.clickSubmitButton();

    }
    @Then("I should see the confirmation message {string}")
    public void i_should_see_the_confirmation_message(String text){

        Assert.assertEquals(appHomePage.registrationValidationMessage(),text);

    }
}

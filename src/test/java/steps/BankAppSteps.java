package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BankHomePage;
import utils.PlaywrightDriver;
import utils.ScreenshotHelper;


public class BankAppSteps {

    BankHomePage bankHomePage=new BankHomePage();
    private final ScreenshotHelper screenshotHelper = new ScreenshotHelper();

    @Given("I am on the {string} page")
    public void i_am_on_the_page(String string) {

        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("bankAppurl"));

    }

   /* @Given("I validate banking app page title")
    public void i_validate_banking_app_page_title() {

    }*/

    @When("I enter {string} in the First Name field")
    public void i_enter_in_the_first_name_field(String first_name) {

        bankHomePage.enterFirstName(first_name);
        screenshotHelper.takeScreenshot("After entering firstName");

    }
    @When("I enter {string} in the Last Name field")
    public void i_enter_in_the_last_name_field(String last_name) {

        bankHomePage.enterLastName(last_name);

    }
    @When("I enter {string} in the Email field")
    public void i_enter_in_the_email_field(String email) {
        bankHomePage.enterEmailID(email);
        screenshotHelper.takeScreenshot("After entering emailID");


    }

    @When("I enter a valid {string} in the Password field")
    public void i_enter_a_valid_in_the_password_field(String password) {
        bankHomePage.enterPassword("Test123@");
    }


    @When("I select {string} as my Gender")
    public void i_select_as_my_gender(String gender) {

        bankHomePage.selectGender("Male");

    }
    @When("I select the hobbies {string}")
    public void i_select_the_hobbies(String hobbies) {

        bankHomePage.selectCheckBoxes(hobbies);

    }
    @When("I enter {string} in the About Yourself field")
    public void i_enter_in_the_about_yourself_field(String about){

        bankHomePage.enterAboutYourSelf(about);
        screenshotHelper.takeScreenshot("After entering About Section");



    }
    @When("I click the Register button")
    public void i_click_the_register_button() {

        bankHomePage.clickSubmitButton();

    }
    @Then("I should see the confirmation message {string}")
    public void i_should_see_the_confirmation_message(String text){

        Assert.assertEquals(bankHomePage.registrationValidationMessage(),text);

    }
}

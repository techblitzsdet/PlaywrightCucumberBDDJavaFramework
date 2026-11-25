package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BankManagerPage;
import pages.DashBoardPage;

public class AddCustomerSteps {

    BankManagerPage bankManagerPage=new BankManagerPage();
    DashBoardPage dashBoardPage=new DashBoardPage();

    @Given("the {string} tab is open")
    public void the_tab_is_open(String string) {

        dashBoardPage.clickBankManagerLoginButton();
        bankManagerPage.clickAddCustomerTab();



    }


    @When("I confirm the customer addition if prompted")
    public void i_confirm_the_customer_addition_if_prompted() {

    }
    @Then("the customer should appear in the Customers list with first name {string} and last name {string}")
    public void the_customer_should_appear_in_the_customers_list_with_first_name_and_last_name(String string, String string2) {

    }

    @When("I enter {string} in the First Name field of New Customer")
    public void i_enter_in_the_first_name_field_of_new_customer(String first_name) {

        bankManagerPage.enterCustomerFName(first_name);

    }
    @When("I enter {string} in the Last Name field of New Customer")
    public void i_enter_in_the_last_name_field_of_new_customer(String last_name) {

        bankManagerPage.enterCustomerLName(last_name);

    }
    @When("I enter {string} in the Post Code field of New Customer")
    public void i_enter_in_the_post_code_field_of_new_customer(String post_code) {

        bankManagerPage.enterCustomerPInCode(post_code);

    }
    @When("I click the Add Customer button of Add New Customer")
    public void i_click_the_add_customer_button_of_add_new_customer() throws InterruptedException {

        bankManagerPage.clickAddCustomer();
        Thread.sleep(5000);

    }
}

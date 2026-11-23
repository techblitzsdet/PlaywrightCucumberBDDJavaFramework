package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankCustomerSteps {

    @Then("I should see the customer table")
    public void i_should_see_the_customer_table() {

    }

    @When("I enter {string} in the Search Customer field")
    public void i_enter_in_the_search_customer_field(String string) {

    }
    @Then("I should see customer rows matching {string}")
    public void i_should_see_customer_rows_matching(String string) {

    }


    @Then("the table should show First Name, Last Name, Post Code, Account Number, and Delete columns")
    public void the_table_should_show_first_name_last_name_post_code_account_number_and_delete_columns() {

    }

    @When("I click Delete for the customer with first name {string} and last name {string}")
    public void i_click_delete_for_the_customer_with_first_name_and_last_name(String string, String string2) {

    }
    @When("I confirm the deletion if prompted")
    public void i_confirm_the_deletion_if_prompted() {

    }
    @Then("the customer {string} should no longer appear in the customer list")
    public void the_customer_should_no_longer_appear_in_the_customer_list(String string) {

    }
}

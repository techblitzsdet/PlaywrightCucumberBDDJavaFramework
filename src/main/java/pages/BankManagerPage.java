package pages;

import BasePage.BasePage;

public class BankManagerPage extends BasePage {


    public void clickAddCustomerTab(){
        clickByText("Add Customer");
    }

    public void enterCustomerFName(String firstName){
        type("addCustomer_fName",firstName);
    }

    public void enterCustomerLName(String lastName){
//        type("addCustomer_lName",lastName);
        typeByPlaceholder("Last Name",lastName);
    }

    public void enterCustomerPInCode(String pinCode){
        type("addCustomer_pinCode",pinCode);
    }

    public void clickAddCustomer(){
        click("add_Customer_submit");
    }

}

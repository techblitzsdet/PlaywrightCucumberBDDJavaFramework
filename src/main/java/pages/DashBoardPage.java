package pages;

import BasePage.BasePage;


public class DashBoardPage extends BasePage {


    public void clickCustomerLoginButton(){
        try {
            click("Customer_Login");
        }
        catch (Exception e) {
            throw new RuntimeException("Could not click the Customer Login button.", e);
        }

    }

    public void clickBankManagerLoginButton()
    {
        try {
            clickByText("Bank Manager Login");
        }
        catch (Exception e) {
            throw new RuntimeException("Could not click the Bank manager Login button.", e);
        }
    }

    public void clickLifeMembershipButton(){

        try {
            click("lifeMembership_Login");
        }

        catch (Exception e) {
            throw new RuntimeException("Could not click the Life membership Login button.", e);
        }

    }
}

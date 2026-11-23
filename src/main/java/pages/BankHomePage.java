package pages;

import BasePage.BasePage;
import org.testng.Assert;
import org.xml.sax.Locator;

public class BankHomePage extends BasePage {

    String actualText;

    public void enterFirstName(String firstName){
        type("FirstName_CSS",firstName);
    }


    public void enterLastName(String lastName){
        type("LastName_CSS",lastName);
    }


    public void enterEmailID(String emailID){
        type("Email_CSS",emailID);
    }

    public void enterPassword(String password){
        type("Password_CSS",password);
    }


    public void enterAboutYourSelf(String text){
        type("about_CSS",text);
    }

    public void clickSubmitButton(){
        click("submit_CSS");
    }

    public void selectGender(String gender){

        select("gender_CSS",gender);
    }

    public void selectCheckBoxes(String hobbies){

        selectCheckbox("Hobbies_CSS",hobbies);
    }

    public String registrationValidationMessage() {

        isElementPresent("registration_validation_CSS");
        actualText = getInnerText("registration_validation_CSS");
        return actualText;

    }

}

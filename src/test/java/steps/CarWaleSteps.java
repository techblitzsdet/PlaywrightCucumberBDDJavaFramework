package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.NewCarsPage;
import utils.PlaywrightDriver;
import BasePage.BasePage;

public class CarWaleSteps {


    HomePage home = new HomePage();

    NewCarsPage car = new NewCarsPage();


    @Given("user navigates to carwale website")
    public void user_navigates_to_carwale_website() {

        PlaywrightDriver.openPage(PlaywrightDriver.config.getProperty("testurl"));

    }
    @When("user mouseover to newcars")
    public void user_mouseover_to_newcars() {
        home.mouseOverNewCars();

    }
    @Then("user clicks on Findnewcars link")
    public void user_clicks_on_findnewcars_link() {

        home.clickFindNewCars();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    @Then("user clicks on {string} car")
    public void user_clicks_on_car(String carBrand) {

        if(carBrand.equals("Toyota")) {

            car.gotoToyota();
        }else if(carBrand.equals("Kia")) {

            car.gotoKia();
        }else if(carBrand.equals("BMW")) {

            car.gotoBMW();
        }else if(carBrand.equals("Honda")) {

            car.gotoHonda();
        }

    }
    @Then("user validates carTitle as {string}")
    public void user_validates_car_title_as(String carTitle) {

        Assert.assertEquals(BasePage.carBase.getCarTitle(), carTitle);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

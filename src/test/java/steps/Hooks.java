package steps;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.PlaywrightDriver;

public class Hooks {


    public Page page;
    private static final ThreadLocal<Scenario> currentScenario = new ThreadLocal<>();


    @Before(order=0)
    public void setUp() {

        PlaywrightDriver.setupDriver();

    }

    @Before(order=1)
    public void setScenario(Scenario scenario) {
        currentScenario.set(scenario);
    }

    public static Scenario getCurrentScenario() {
        return currentScenario.get();
    }

    @After
    public void tearDown(Scenario scenario) {

        if(scenario.isFailed()) {

            page = PlaywrightDriver.getPage();
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./screenshot/screenshot.png")));
            scenario.attach(screenshot, "image/png", "screenshot");


        }

        PlaywrightDriver.closeBrowser();
        PlaywrightDriver.quitPlaywright();
    }

}

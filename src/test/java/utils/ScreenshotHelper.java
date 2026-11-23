package utils;

import com.microsoft.playwright.Page;
import org.testng.Assert;
import steps.Hooks;

public class ScreenshotHelper {

    public void takeScreenshot(String name) {
        try {
            byte[] screenshot = PlaywrightDriver.getPage()
                    .screenshot(new Page.ScreenshotOptions().setFullPage(true));

            Hooks.getCurrentScenario().attach(screenshot, "image/png", name);
        } catch (Throwable t) {
            Assert.fail("Could not capture screenshot: " + t.getMessage());
        }
    }
}
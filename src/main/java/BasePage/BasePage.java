package BasePage;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import org.testng.Assert;
import utils.PlaywrightDriver;

public class BasePage {

    public static Page page;
    public static CarBase carBase;

    public BasePage(){

        page=PlaywrightDriver.getPage();
        carBase=new CarBase(page);

    }

    public void click(String locatorKey) {

        try {
            page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).click();
        } catch (Throwable t) {

            Assert.fail(t.getMessage());
        }
    }


    public void mouseHover(String locatorKey) {

        try {
            page.hover(PlaywrightDriver.OR.getProperty(locatorKey));
        } catch (Throwable t) {

            Assert.fail(t.getMessage());
        }
    }

    public boolean isElementPresent(String locatorKey) {

        try {
            page.waitForSelector(PlaywrightDriver.OR.getProperty(locatorKey), new Page.WaitForSelectorOptions().setTimeout(2000));

            return true;
        } catch (Throwable t) {


            return false;
        }

    }

    public void type(String locatorKey, String value) {
        try {
            page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).fill(value);
        } catch (Throwable t) {

            Assert.fail(t.getMessage());
        }
    }


    public void select(String locatorKey, String value) {
        try {
            page.selectOption(PlaywrightDriver.OR.getProperty(locatorKey),new SelectOption().setLabel(value));
        } catch (Throwable t) {

            Assert.fail(t.getMessage());
        }
    }


    public void selectCheckbox(String locatorKey,String value) {
        try {
            page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).check();
        } catch (Throwable t) {
            Assert.fail(t.getMessage());
        }
    }

    public String getInnerText(String locatorKey) {
        try {
            return page.locator(PlaywrightDriver.OR.getProperty(locatorKey)).innerText();
        } catch (Throwable t) {
            Assert.fail(t.getMessage());
            return null;
        }
    }

    public void clickByText(String text) {
        try {
            page.getByText(text, new Page.GetByTextOptions().setExact(true)).click();
        } catch (Exception e) {
            Assert.fail("Could not click text '" + text + "': " + e.getMessage());
        }
    }

    public void typeByPlaceholder(String placeholder, String value) {
        try {
            page.getByPlaceholder(placeholder).fill(value);
        } catch (Exception e) {
            Assert.fail("Could not type into field with placeholder '" + placeholder + "': " + e.getMessage());
        }
    }
}

package it.driver;

import it.Common.Constants;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyDriver extends RemoteWebDriver {
    private static RemoteWebDriver driver;
    private static MyDriver myDriver;

    public static MyDriver getMyDriver() {
        if (myDriver == null)
            myDriver = new MyDriver();
        return myDriver;
    }

    private MyDriver() {
        driver = DriverFactory.getDriver();
    }


    public void scrollUp() {

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
    }

    /**
     * Scroll Down
     */

    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }


    public boolean isElementPresent(By locator) {
        boolean result = false;
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            List<WebElement> list = driver.findElements(locator);
            driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
            result = list.size() != 0 && list.get(0).isDisplayed();
        } catch (StaleElementReferenceException | NoSuchElementException e) {         //NOP
        }
        return result;
    }
            public void scrollToElement (WebElement element)
            {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


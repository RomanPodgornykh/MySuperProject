package it.pages;

import it.Common.Constants;
import it.driver.DriverFactory;
import it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    protected static WebDriver driver= MyDriver.getMyDriver();



    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}



package it.driver;

import it.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {
    public static RemoteWebDriver getDriver() {
        RemoteWebDriver driver;
        String name = System.getProperty("driver");

        if (name == null || "chrome".equals(name)) {

                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2.exe");
                driver = new ChromeDriver();

            }
        else if("gecko".equals(name)){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2.exe");
            driver = new FirefoxDriver();
        }
            else{
                throw new UnsupportedOperationException();


            }
            driver.manage().window().fullscreen();
            driver.get(Constants.BASE_URL);
            return driver;
        }
    }



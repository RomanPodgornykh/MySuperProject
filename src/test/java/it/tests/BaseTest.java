package it.tests;

import it.App;
import it.Entity.User;
import it.Entity.UserFactory;
import it.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {



     User validUser = UserFactory.getValidUser();
     App app = new App();

     @AfterSuite
    public void tearDown() {
        app.common.stopApp();

    }
}

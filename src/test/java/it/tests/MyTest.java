package it.tests;

import it.Entity.User;
import it.Entity.UserFactory;
import it.pages.DashBoardPage;
import it.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class MyTest extends BaseTest {



    @Test
    public void test1()  {

        app.login.login(validUser.getLogin(), validUser.getPass());

        Assert.assertEquals(app.dashBoard.getLbEmail(), validUser.getEmail(), "Email is not valid");

    }

}










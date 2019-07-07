package it.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {
	@FindBy(name = "login")
	private WebElement login;
	@FindBy(name = "pass")
	private WebElement password;
	@FindBy(xpath = "//input[@tabindex = '5' and @type = 'submit']")
	private WebElement btnLogin;



	public void login(String log, String pass) {
		login.sendKeys(log);
		password.sendKeys(pass);
		btnLogin.click();
	}

	}

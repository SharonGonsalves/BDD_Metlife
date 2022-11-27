package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class LogInPage {

	WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='userNameId']")
	WebElement userName;
	@FindBy(xpath = "//input[@id='passwordId']")
	WebElement passWord;
	@FindBy(xpath = "//button[text()=' LOG IN']")
	WebElement logInButton;
	
	public void inputUserName(String userName) {
		inputText(logInButton, userName);
	}
	
	public void inputPass(String password) {
		inputText(passWord, password);
	}
	
	public void logIN() {
		click(logInButton);
	}
	
	public void logInSteps(String username, String password){
		inputText(userName, username);
		inputText(passWord, password);
		click(logInButton);
	}


}
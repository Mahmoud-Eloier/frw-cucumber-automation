package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AuthentificationOrangeLoginPage {
	private ConfigFileReader configFileReader;
	
	/*@FindBy*/
	@FindBy(how = How.XPATH, using = "//*[@name='username']")
	public static WebElement userName ;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password ;
	@FindBy(how = How.XPATH, using = "//*[@type='submit']")
	public static WebElement btnLogin ;
	@FindBy(how = How.TAG_NAME, using = "h6")
	public static WebElement welcomeMessage ;
	@FindBy(how = How.XPATH, using = "//img[@alt='profile picture']")
	public static WebElement btnIcone ;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement btnLogout ;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Username : Admin')]")
	public static WebElement homeMessage ;
	
	public AuthentificationOrangeLoginPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	public void fillUserName(String name) throws InterruptedException {
		Thread.sleep(5000);
		userName.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void clickOnBtnLogin() {
		btnLogin.click();
	}
	
	public void clickOnBtnLIcone() {
		btnIcone.click();
	}
	
	public void clickOnBtnLogout() {
		btnLogout.click();
	}
	

}

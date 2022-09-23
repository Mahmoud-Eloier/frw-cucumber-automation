package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegisterPage {
private ConfigFileReader configFileReader;
	
	/*@FindBy*/
    @FindBy(how = How.TAG_NAME, using = "a")
    public static WebElement btnRegistre ;
    @FindBy(how = How.NAME, using = "firstName")
    public static WebElement firstName ;
    @FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName ;
    @FindBy(how = How.NAME, using = "phone")
	public static WebElement phone ;
    @FindBy(how = How.NAME, using = "email")
	public static WebElement email ;
    @FindBy(how = How.NAME, using = "address1")
	public static WebElement address1 ;
    @FindBy(how = How.NAME, using = "city")
	public static WebElement city ;
    @FindBy(how = How.NAME, using = "state")
	public static WebElement state ;
    @FindBy(how = How.NAME, using = "postalCode")
   	public static WebElement postalCode ;
    @FindBy(how = How.XPATH, using =("//*[@name='country']"))
   	public static WebElement country ;
	@FindBy(how = How.NAME, using = "userName")
	public static WebElement userName ;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password ;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword ;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnSubmit ;
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Thank you for registering.')]")
	public static WebElement welcomeMessage ;
	
	public RegisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}
	
	/*Create Method*/
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}
	
	public void clickOnBtnRegister() {
		btnRegistre.click();
	}
	
	public void fillFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void fillLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void fillPhone(String tel) {
		phone.sendKeys(tel);
	}
	
	public void fillEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void fillAddress1(String address) {
		address1.sendKeys(address);
	}
	
	public void fillCity(String city1) {
		city.sendKeys(city1);
	}
	
	public void fillState(String state1) {
		state.sendKeys(state1);
	}
	
	public void fillPostalCode(String postale) {
		postalCode.sendKeys("postal");
	}
	public void fillcountry() {
		Select dropDown = new Select(country);
		dropDown.selectByVisibleText("TUNISIA");
	}
	
	public void fillUserName(String name) {
		userName.sendKeys(name);
	}
	
	public void fillPassword(String passwordText) {
		password.sendKeys(passwordText);
	}
	
	public void fillConfirmPassword(String confirm) {
		confirmPassword.sendKeys(confirm);
	}
	
	public void clickOnBtnSubmit() {
		btnSubmit.click();
	}
	

}
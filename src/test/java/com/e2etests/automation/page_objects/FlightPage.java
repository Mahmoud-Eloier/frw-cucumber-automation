package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class FlightPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
//	@FindBy(how = How.TAG_NAME, using = "a")
//	public static WebElement btnflight ;
	@FindBy(how = How.NAME, using = "tripType")
	public static WebElement type;
	@FindBy(how = How.NAME, using = "passCount")
	public static WebElement passengers;
	@FindBy(how = How.NAME, using = "fromPort")
	public static WebElement depart;
	@FindBy(how = How.NAME, using = "fromMonth")
	public static WebElement moisAller;
	@FindBy(how = How.NAME, using = "fromDay")
	public static WebElement jourAller;
	@FindBy(how = How.NAME, using = "toPort")
	public static WebElement arriving;
	@FindBy(how = How.NAME, using = "toMonth")
	public static WebElement moisRetour;
	@FindBy(how = How.NAME, using = "toDay")
	public static WebElement jourRetour;
	@FindBy(how = How.NAME, using = "servClass")
	public static WebElement classe;
	@FindBy(how = How.NAME, using = "airline")
	public static WebElement airline;
	@FindBy(how = How.NAME, using = "findFlights")
	public static WebElement btnContinue;
//	@FindBy(how = How.LINK_TEXT, using = "https://demo.guru99.com/test/newtours/reservation2.php")
//	public static WebElement flightMessage;

	public FlightPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create Method */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("home.url"));
	}

//	public void clickOnBtnFlight() {
//		btnflight.click();
//	}

	public void fillRoundTrip(String name) {
		type.sendKeys(name);
	}

	public void fillPassengers() {
		Select dropDown = new Select(passengers);
		dropDown.selectByVisibleText("1");
	}

	public void fillDepart() {
		Select dropDown = new Select(depart);
		dropDown.selectByVisibleText("London");
	}

	public void fillmoisAller() {
		Select dropDown = new Select(moisAller);
		dropDown.selectByVisibleText("July");
	}

	public void filljourAller() {
		Select dropDown = new Select(jourAller);
		dropDown.selectByVisibleText("1");
	}

	public void fillarriving() {
		Select dropDown = new Select(arriving);
		dropDown.selectByVisibleText("Paris");
	}

	public void fillmoisRetour() {
		Select dropDown = new Select(moisRetour);
		dropDown.selectByVisibleText("October");
	}

	public void filljourRetour() {
		Select dropDown = new Select(jourRetour);
		dropDown.selectByVisibleText("1");
	}

	public void fillClass(String fclasse) {
		classe.sendKeys(fclasse);
	}

	public void fillairline() {
		Select dropDown = new Select(airline);
		dropDown.selectByVisibleText("Pangea Airlines");
	}

	public void clickOnBtnContinue() {
		btnContinue.click();
		
	}

}

package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
	private RegisterPage registerPage;
	
	public RegisterStepDefinition() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte sur le siteWeb Mercury")
	public void jeMeConnecteSurLeSiteWebMercury() {
		registerPage.goToUrl();
	    
	}
	@When("Je clique sur le boutton REGISTER")
	public void jeCliqueSurLeBouttonREGISTER() {
		registerPage.clickOnBtnRegister();
	    
	}
	@When("Je saisie le first name {string}")
	public void jeSaisieLeFirstName(String firstname) {
		registerPage.fillFirstName(firstname);
	   
	}
	@When("Je saisie le last name {string}")
	public void jeSaisieLeLastName(String lastName) {
		registerPage.fillLastName(lastName);
	    
	}
	@When("Je saisie le phone {string}")
	public void jeSaisieLePhone(String phone) {
		registerPage.fillPhone(phone);
	    
	}
	@When("Je saisie le Email {string}")
	public void jeSaisieLeEmail(String email) {
		registerPage.fillEmail(email);
	    
	}
	@When("Je saisie le Address {string}")
	public void jeSaisieLeAddress(String address) {
		registerPage.fillAddress1(address);
	    
	}
	@When("Je saisie le City {string}")
	public void jeSaisieLeCity(String city) {
		registerPage.fillCity(city);
	    
	}
	@When("Je saisie le State {string}")
	public void jeSaisieLeState(String state) {
		registerPage.fillState(state);
	    
	}
	@When("Je saisie le code postale {string}")
	public void jeSaisieLeCodePostale(String postale) {
		registerPage.fillPostalCode(postale);
	    
	}
	@When("Je saisie le Country {string}")
	public void jeSaisieLeCountry(String country) {
		registerPage.fillcountry();
	    
	}
	@When("Je saisie le userName {string}")
	public void jeSaisieLeUserName(String name) {
		registerPage.fillUserName(name);
	    
	}
	@When("Je saisie le password {string}")
	public void jeSaisieLePassword(String password) {
		registerPage.fillPassword(password);
	 
	}
	@When("Je saisie la confirmation mot de passe {string}")
	public void jeSaisieLaConfirmationMotDePasse(String confirm) {
		registerPage.fillConfirmPassword(confirm);
	    
	}
	@When("Je clique sur le boutton Envoyer")
	public void jeCliqueSurLeBouttonEnvoyer() {
		registerPage.clickOnBtnSubmit();
	    
	}
	@Then("Je termine la création du compte {string}")
	public void jeTermineLaCréationDuCompte(String text) {
		String message = RegisterPage.welcomeMessage.getText();
		Assert.assertTrue(message.contains(text));
	    
	}




}

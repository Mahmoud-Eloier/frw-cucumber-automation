package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationOrangeLoginPage;
import com.e2etests.automation.page_objects.AuthentificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationOrangeLoginStepDefinition {
	
	private AuthentificationOrangeLoginPage authentificationOrangePageLogin;

	public AuthentificationOrangeLoginStepDefinition() {
		this.authentificationOrangePageLogin = new AuthentificationOrangeLoginPage();
	

	}
	@Given("Je me connect au site Orange")
	public void jeMeConnectAuSiteOrange() {
		authentificationOrangePageLogin.goToUrl();
	   
	}
	@When("Je saisie mon userName {string}")
	public void jeSaisieMonUserName(String name) throws InterruptedException {
		authentificationOrangePageLogin.fillUserName(name);
	}
	@When("Je saisie mon password {string}")
	public void jeSaisieMonPassword(String password) {
		authentificationOrangePageLogin.fillPassword(password);
	}
	@When("Je clique sur le boutton login")
	public void jeCliqueSurLeBouttonLogin() {
		authentificationOrangePageLogin.clickOnBtnLogin();
	}
	    
	@Then("Je me redirige vers mon compte {string}")
	public void jeMeRedirigeVersMonCompte(String text){
		String message = AuthentificationOrangeLoginPage.welcomeMessage.getText();
		Assert.assertTrue(message.contains(text));

	    
	}
	
	







}

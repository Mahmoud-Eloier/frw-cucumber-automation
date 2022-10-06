package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthentificationOrangeLoginPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationOrangeLogoutStepDefinition {

	private AuthentificationOrangeLoginPage authentificationOrangePageLogin;

	public AuthentificationOrangeLogoutStepDefinition() {
		this.authentificationOrangePageLogin = new AuthentificationOrangeLoginPage();
	}

	@When("Je clique sur l icone du proprietaire du compte")
	public void jeCliqueSurLIconeDuProprietaireDuCompte() {
		authentificationOrangePageLogin.clickOnBtnLIcone();

	}

	@When("Je clique sur le boutton logout")
	public void jeCliqueSurLeBouttonLogout() {
		authentificationOrangePageLogin.clickOnBtnLogout();

	}

	@Then("Je me redirige vers le compte utilisateur {string}")
	public void jeMeRedirigeVersLaPageHome(String text2) {
		String message =  Setup.driver.getCurrentUrl();
		Assert.assertEquals(message,text2 );

	}

}

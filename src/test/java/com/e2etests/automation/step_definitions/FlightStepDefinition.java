package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.FlightPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightStepDefinition {

	private FlightPage flightPage;

	public FlightStepDefinition() {
		this.flightPage = new FlightPage();
	}

	@Given("Je me connecte sur le site Mercury Flight")
	public void jeMeConnecteSurLeSiteMercuryFlight() {
		flightPage.goToUrl();
	}

//	@When("Je Je clique sur le boutton flight")
//	public void jeJeCliqueSurLeBouttonFlight() {
//		flightPage.clickOnBtnFlight();
//	}
	@When("Je choisi le type de vol {string}")
	public void jeChoisiLeTypeDeVol(String RoundTrip) {
		flightPage.fillRoundTrip(RoundTrip);
	}

	@When("Je choisi le nombre de passagers {string}")
	public void jeChoisiLeNombreDePassagers(String string) {
		flightPage.fillPassengers();
	}

	@When("Je choisi le point de depart {string}")
	public void jeChoisiLePointDeDepart(String string) {
		flightPage.fillDepart();
	}

	@When("Je choisi le mois de depart {string}")
	public void jeChoisiLeMoisDeDepart(String string) {
		flightPage.fillmoisAller();
	}

	@When("Je choisi le jour de depart {string}")
	public void jeChoisiLeJourDeDepart(String string) {
		flightPage.filljourAller();
	}

	@When("Je choisi le point darriver {string}")
	public void jeChoisiLePointDarriver(String string) {
		flightPage.fillarriving();
	}

	@When("Je choisi le mois de retour {string}")
	public void jeChoisiLeMoisDeRetour(String string) {
		flightPage.fillmoisRetour();
	}

	@When("Je choisi le jour de retour {string}")
	public void jeChoisiLeJourDeRetour(String string) {
		flightPage.filljourRetour();
	}

	@When("Je choisi le classe {string}")
	public void jeChoisiLeClasse(String classe) {
		flightPage.fillClass(classe);
	}

	@When("Je choisi la compagnie aerienne {string}")
	public void jeChoisiLaCompagnieAerienne(String string) {
		flightPage.fillairline();
	}

	@When("Je clique sur le boutton continue")
	public void jeCliqueSurLeBouttonContinue() {
		flightPage.clickOnBtnContinue();
	}

	@Then("Je me redirige vers la page de reservation {string}")
	public void jeMeRedirigeVersLaPageDeReservation(String text) {
		String message =  Setup.driver.getCurrentUrl();
		Assert.assertEquals( text ,message);
	}

}

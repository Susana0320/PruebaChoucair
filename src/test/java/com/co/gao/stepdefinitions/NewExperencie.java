package com.co.gao.stepdefinitions;

import com.co.gao.tasks.NewExperienceTask;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewExperencie {
	
	@When("I create a Purchase Flow")
	public void iCreateAPurchaseFlow() {
		theActorInTheSpotlight().attemptsTo(NewExperienceTask.gao());
	}

	@Then("I verify Purchase Flow")
	public void iVerifyPurchaseFlow() {
	    
	}

}

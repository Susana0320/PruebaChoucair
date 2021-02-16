package com.co.gao.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/NewExperience.feature",
		tags = "@PurchaseFlow",
		glue = "com/co/gao/stepdefinitions", snippets = SnippetType.CAMELCASE, monochrome = true, dryRun = false)

public final class RunnerNewExperince {
	
private RunnerNewExperince() {
		
		throw new IllegalStateException("Runner class");
	}

}

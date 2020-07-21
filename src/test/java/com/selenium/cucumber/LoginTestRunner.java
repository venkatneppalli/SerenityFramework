package com.selenium.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Login_Scenarios/loginTest.feature",
glue= {"com.selenium.StepDefinition"})
public class LoginTestRunner {

}

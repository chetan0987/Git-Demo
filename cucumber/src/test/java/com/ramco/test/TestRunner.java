package com.ramco.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
	features="E:/CUCUMBER/cucumber/src/test/java/com/ramco/features",
	glue="com.ramco.stepdefinition",tags="@mobTest",stepNotifications=true,strict=true,monochrome=true,
	plugin= {"pretty","html:target/cucumber","json:target/cucum.json","junit:target/cucum.xml"}
)
public class TestRunner {

}

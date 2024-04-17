package com.cucumber.junitParallel.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "", 
		features = "src/test/resources/features", 
		glue = "com.cucumber.junitParallel",
		plugin = {"pretty", "json:target/report/cucumber.html","json:target/report/cucumber.json"})
 
public class CucumberRunnerTests  {
 
}

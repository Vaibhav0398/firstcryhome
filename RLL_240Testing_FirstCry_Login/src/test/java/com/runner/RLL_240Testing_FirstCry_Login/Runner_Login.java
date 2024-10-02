package com.runner.RLL_240Testing_FirstCry_Login;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resource/com/features/Login",
        glue = "com.stepdefinition.RLL_240Testing_FirstCry_Login",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)
 
public class Runner_Login {
 
}

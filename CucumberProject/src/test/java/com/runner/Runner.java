package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"com.stepDefnitions"},
monochrome=true,
plugin= {"html:Reports/HTMLReports/htmlreport.html", "json:Reports/JsonReports/JsonReport.json", "junit:Reports/JUnitReports/JunitReport.xml"}
)

public class Runner {

}

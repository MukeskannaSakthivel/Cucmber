package org.runnerbgdt;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFileBgDT",glue="org.stepdefbgdt")
public class TestRunner {

}

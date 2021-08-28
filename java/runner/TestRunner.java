package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/features/F01-Login.feature",glue="steps",monochrome=true,
publish=true,
tags="@regression or @smoke or @functional")
//dryRun=true,
//snippets=SnippetType.CAMELCASE)

public class TestRunner extends AbstractTestNGCucumberTests{

}

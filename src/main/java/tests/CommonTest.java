package tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.no.Gitt;
import runner.TestRunner;

public class CommonTest {

    @Given("I open website (.*)$")
    public void openWebsite(String website) throws InterruptedException {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        TestRunner.driver.manage().window().maximize();
    }
}

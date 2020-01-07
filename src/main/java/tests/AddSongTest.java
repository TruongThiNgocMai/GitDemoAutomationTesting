package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddSongPage;

public class AddSongTest extends PageProvider {
    @When("^I type name as (.*)$")
    public void inputInfor(String name) throws InterruptedException {
        Thread.sleep(3000);
        getAddSongTest().setInformation(name);
    }

    @And("^I click search button$")
    public void clickAddBtn() throws InterruptedException {
        Thread.sleep(2000);
        getAddSongTest().clickSearchBtn();
    }

    @Then("^I verify the song is display$")
    public void verifySearch(){

    }
}

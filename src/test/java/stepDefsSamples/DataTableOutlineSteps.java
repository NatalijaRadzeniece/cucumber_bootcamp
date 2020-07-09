package stepDefsSamples;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class DataTableOutlineSteps {


    @Given("I search on amazon for {string}")
    public void iSearchOnAmazonForItem() {
        //somecode
    }

    @When("I selects filters:")
    public void iSelectsFilters(Map<String, String> toBeSelected) {
        for (Map.Entry<String,String> amazonFilters: toBeSelected.entrySet()) {
            //some code
            amazonFilters.getKey(); // gets Key value as string
            amazonFilters.getValue(); // gets Value as string
        }
    }

    @Then("I should see {string}")
    public void iShouldSee() {
    }

}

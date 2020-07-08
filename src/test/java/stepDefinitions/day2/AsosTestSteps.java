package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class AsosTestSteps {

    private WebDriver driver;


    public AsosTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Go to Asos Homepage page")
    public void open_asos_page() {
        driver.get("https://www.asos.com/");
    }

    @And("select women")
    public void select_Women() {
        driver.findElement(By.className("TO7hyVB _3B0kHbC _3AH1eDT")).click();
    }

    @And("then select category 'Shoes'")
    public void select_shoes() {

    }

    @And("then 'Loafers'")
    public void select_loafers() {

    }
    @And("Select filters {string} {string} {string}")
    public void select_filters(String leather, String size, String brand){

    }

    @Then("'Vagabond Layla leather flat loafers in black' appears")
    public void vaga_appears() {

    }

}




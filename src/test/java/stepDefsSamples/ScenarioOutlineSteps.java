package stepDefsSamples;



import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

import java.util.Map;

public class ScenarioOutlineSteps {

    WebDriver driver;
    public ScenarioOutlineSteps() {
    this.driver = Hooks.driver;
    }

    @When("I login {string} and {string}")
    public void login_user(String name, String password) {
        driver.findElement(By.id("")).sendKeys(name);
        driver.findElement(By.id("")).sendKeys(password);
    }

    @When("I add {string}")
    public void add_name(String name) {
        driver.findElement(By.id("")).sendKeys(name);
    }

    @And("add {string}")
    public void add_password(String password) {
        driver.findElement(By.id("")).sendKeys(password);
    }

    @When("I add :")
    public void i_add_value(Map<String, String> values) {
        // we need to set all added values to Map
        for (Map.Entry<String, String > val : values.entrySet()) {
            driver.findElement(By.id("")).sendKeys(val.getValue());
        }
    }

    @And("see {string}")
    public void seeMessage(String message) {
    }
}

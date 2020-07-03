package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class FirstFirstSteps {

    private WebDriver driver;

    public FirstFirstSteps() {
        this.driver = Hooks.driver;

    }

    @Given("open site HeroKuapp")
    public void open_site() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click Add button")
    public void click_button() {
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void verify_button_added() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete'not added");
    }

    @Given("open site AutomatedTester")
    public void open_site2() {
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("I click Chapter2 button")
    public void click_button2() {
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }

    @Then("button WithName added")
    public void verify_button_added2() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("[name='but2']")).isDisplayed(), "Button 'with name'not added");
    }

}

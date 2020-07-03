package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class FirstStepsOld {

    private WebDriver driver;
    public FirstStepsOld() {
        this.driver = Hooks.driver;
    }

    @Given("I open site")
    public void open_site(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click Add Element")
    public void add_button(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("extra button Delete added")
    public void confirm_extra_button_appeared(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[class='added-manually']")).isDisplayed(), "Button not appeared");
    }



}

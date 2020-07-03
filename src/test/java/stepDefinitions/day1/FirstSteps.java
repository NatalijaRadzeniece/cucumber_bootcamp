package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class FirstSteps {

    private WebDriver driver;

    public FirstSteps() {
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
    public void verify_button_added(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete' not added");
    }



    @Given("open site TheAutomatedTester")
    public void open_site_2(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("I click Chapter2 button")
    public void click_chapter2_button(){
        driver.findElement(By.xpath("//a[@href='/chapter2']")).click();
    }

    @Then("button 'button with name' appeared")
    public void buttonWithName_appeared(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[name='but2']")).isDisplayed());
    }
}

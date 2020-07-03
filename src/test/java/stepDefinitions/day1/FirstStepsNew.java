package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

import java.util.List;

public class FirstStepsNew {

    private WebDriver driver;

    public FirstStepsNew() {
        this.driver = Hooks.driver;
    }

    @Given("open site HeroKuapp")
    public void open_site() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click Add button")
    public void click_button() {
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void verify_button_added() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete' not added");
    }


    @Given("open site TheAutomatedTester")
    public void open_the_site() {
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("I click on Chapter two")
    public void click_on_button(){
        driver.findElement(By.xpath("//a[@href='/chapter2']")).click();
    }

    @Then("I see Button With Name")
    public void check_button_with_name(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[value='Button with name']")).isDisplayed(),"Button 'Button with name' not displayed");
    }

}
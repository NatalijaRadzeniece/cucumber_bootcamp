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

    public FirstSteps() { this.driver = Hooks.driver; }

    @Given("open site HeroKuapp")
    public void open_site() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click Add button")
    public void click_button() {
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void confirm_extra_button_appeared() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("[class='added-manually']")).isDisplayed(), "Button not appeared");
    }


    @Given("open site bookSite")
    public void open_site1() {
        driver.get("http://book.theautomatedtester.co.uk/");
        }

    @When("click Chapter 2")
     public void click_button1(){
     driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }

    @Then("button with name appeard")
        public void verify_button_added1 () {
            Assertions.assertTrue(driver.findElement(By.name("but2")).isDisplayed(), "Button with name");
        }

    }

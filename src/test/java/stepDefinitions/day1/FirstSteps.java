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
    public void open_site(){
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }
    @When("I click Add button")
    public void add_button(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void verify_button_appeared(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[class='added-manually']")).isDisplayed(), "Button 'Delete' not added");
    }

    @Given("open web page TheAutomatedTester")
    public void open_web_page_TheAutomatedTester(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("I click on Chapter two")
    public void click_chapter_two(){
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }

    @Then("button With Name is visible")
    public void check_button_with_name(){
        Assertions.assertTrue(driver.findElement(By.name("but2")).isDisplayed(), "Button With Name not appeared");
    }



}

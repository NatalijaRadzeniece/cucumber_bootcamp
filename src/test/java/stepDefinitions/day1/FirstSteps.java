package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
    public void click_button(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }
    @Then("button Delete added")
    public void verify_button_added(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(),"Button Delete Not Added");

    }
    @Given("open site TheAutomatedTester")
    public void open_website(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @When("I click Chapter two button")
    public void click_theButton(){
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }
    @Then("button With Name appears")
    public void verify_button_appeared(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[name='but2']")).isDisplayed(), "Button With Name Not Appeared");
    }
}

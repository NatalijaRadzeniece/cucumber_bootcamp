package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import stepDefinitions.hooks.Hooks;

public class FistSteps {

    private WebDriver driver;
    public FistSteps(){
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
        Assert.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(),"Button Delete not added");
    }


    @Given("open site Theautomatedtester")
    public void open_site2(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @When("click Chapter two link")
    public void click_link(){
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();
    }
    @Then("Button with Name is visible")
    public void verify_button_visible(){
        Assert.assertTrue(driver.findElement(By.cssSelector("[name='but2']")).isDisplayed(),"Button With Name is not visible");

    }




}

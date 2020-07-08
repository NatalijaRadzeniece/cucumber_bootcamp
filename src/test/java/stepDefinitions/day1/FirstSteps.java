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
    public void click_button(){
        driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
    }

    @Then("button Delete added")
    public void verify_button_added(){
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete' not added");
    }

    @Given("Im on Tester site")
    public void im_on_site(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("click on Chapter 2")
    public void click_chapter_2(){
        driver.findElement(By.linkText("Chapter2")).click();
    }

    @Then("button with name appeared.")
    public void verify_button_with_name(){
        Assertions.assertTrue(driver.findElement(By.name("but2")).isDisplayed(), "Button 'Delete' not added");
    }
}

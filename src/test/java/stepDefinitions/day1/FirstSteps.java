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
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete not added'");
    }

    @Given("open site book")
    public void open_site_book(){
        driver.get("http://book.theautomatedtester.co.uk/");
    }
    @When("click Chapter2")
    public void click_chapter2(){
        driver.findElement(By.cssSelector("[href='/chapter2']")).click();

    }
    @Then("button with name appears")
    public void button_with_name_appears(){
        Assertions.assertTrue(driver.findElement(By.xpath("//input[@name='but2']")).isDisplayed(), "Button 'Button with name doesnt appear'");
    }

}


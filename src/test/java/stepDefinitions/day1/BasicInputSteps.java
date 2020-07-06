package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import stepDefinitions.hooks.Hooks;

public class BasicInputSteps {
    private WebDriver driver;
    private String textFromTest;

    public BasicInputSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I navigated to Selenium Easy site")
    public void navigate_to_site() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @When("I add text {string}")
    public void add_text(String text) {
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys(text);
        textFromTest = text;
    }

    @When("I click button Show message")
    public void click_button() {
        driver.findElement(By.cssSelector("[onclick='showInput();']")).click();
    }

    @Then("My message displayed")
    public void verify_message_appeared() {
        Assert.assertEquals(textFromTest, driver.findElement(By.cssSelector("span[id='display']")).getText(), "Message are not the same");
    }
}

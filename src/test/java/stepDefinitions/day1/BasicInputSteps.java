package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class BasicInputSteps {
    private WebDriver driver;

    public BasicInputSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I navigated to Selenioum Easy site")
    public void open_site() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    private String textFromTest;

    @When("I add text {string}")
    public void add_text(String text) {
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys(text);
        textFromTest = text;
    }

    @When("I click button Show message")
    public void click_button() {
        driver.findElement(By.cssSelector("[onclick='showInput();']")).click();
    }

    @Then("my message displayed")
    public void assert_msg() {
        Assertions.assertEquals(textFromTest, driver.findElement(By.cssSelector("span[id='display']")).getText());
    }
}

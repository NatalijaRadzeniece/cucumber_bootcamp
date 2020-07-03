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
    private String textAboutUnicorn;
    public BasicInputSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I navigate to Selenium Easy site")
    public void navigate_to_site() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @When("I add text {string}")
    public void pass_text (String text){
        driver.findElement(By.cssSelector("input[id=user-message]")).sendKeys(text);
        textAboutUnicorn = text;
    }
    @When("I click button Show message")
    public void click_button() {
        driver.findElement(By.cssSelector("[onclick='showInput();']")).click();
    }
     @Then("my message displayed")
    public void message_displayed(){
        Assertions.assertEquals(textAboutUnicorn, driver.findElement(By.cssSelector("span[id='display']")).getText());
    }



}

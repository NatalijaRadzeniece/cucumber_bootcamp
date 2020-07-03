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
    private String textFromTest;

    public BasicInputSteps() {
        this.driver = Hooks.driver;
    }

    @Given("I navigated to Selenium Easy site")
    public void navigate_to_site(){
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    }

    @When("I add text {string}")
    public void pass_text(String text){
        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys(text);
        textFromTest = text;
    }

    @When("I click button Show message")
    public void click_button(){
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
    }

    @Then("My message displayed")
    public void verify_my_message(){
        Assertions.assertEquals(textFromTest, driver.findElement(By.xpath("//span[@id='display']")).getText());
    }

}

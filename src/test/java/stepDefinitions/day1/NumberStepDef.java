package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

import java.util.List;

public class NumberStepDef {

    private WebDriver driver;

    public NumberStepDef() {
        this.driver = Hooks.driver;
    }

    @Given("Open 'Enter number' page")
    public void open_page() {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }


    @When("I insert {string}")
    public void insert_number(String number) {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(number);
    }

    @When("I click button 'Submit'")
    public void click_submit(){
        driver.findElement(By.xpath("//button[@onclick]")).click();
    }

    @Then("I see result {string}")
    public void get_result(String message){
        List<WebElement> errorElements = driver.findElements(By.id("ch1_error"));
        if (!errorElements.isEmpty()){
            Assertions.assertEquals(message, errorElements.get(0).getText());
        } else {
            Alert alert = driver.switchTo().alert();
            Assertions.assertEquals(message, alert.getText());
        }

    }

}

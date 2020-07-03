package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDefinitions.hooks.Hooks;

import java.util.Map;

public class MapTestSteps {
    private WebDriver driver;
    private WebDriverWait wait;

    public MapTestSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on Ajax Form page")
    public void on_ajax_page() {
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
    }

    @When("I add:")
    public void add_text_to_fields(
            Map<String, String> data) {
        driver.findElement(By.id("title")).sendKeys(data.get("name"));
        driver.findElement(By.tagName("textarea")).sendKeys(data.get("comment"));
    }
    @When("click on Submit button")
    public void click_submit_button() {
        driver.findElement(By.id("btn-submit")).click();
    }

    @Then("I see {string}")
    public void see_message(String message) {
        wait=new WebDriverWait(driver, 10);
        WebElement element=driver.findElement(By.id("submit-control"));
        wait.until(ExpectedConditions.textToBePresentInElement(element, message));
        Assertions.assertEquals(message, element.getText(),"Message not the same.");

    }
}

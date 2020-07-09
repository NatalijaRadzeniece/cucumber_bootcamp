package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.asserts.Assertion;
import stepDefinitions.hooks.Hooks;

public class SignInPage extends BaseFunctions {

    public SignInPage() {
        super(Hooks.driver);
    }

    @When("I click sign up link")
    public void click_sign_up_link() {
        this.waitAndFindElement(By.xpath("//a[@data-test='sign-up']")).click();
    }

    @Given("Im signed in with remembered credentials")
    public void im_signed_in_with_remembered_credentials()
    {
        this.waitAndFindElement(By.id("session_email")).sendKeys(Hooks.email);
        driver.findElement(By.id("session_password")).sendKeys(Hooks.password);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Sign in']")).click();
    }

    @Then("Im signed out")
    public void im_signed_out() {
        try{
            wait1s.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Sign in']")));
        }
        catch (Exception e){
            Assertions.fail("Not signed out");
        }
    }
}

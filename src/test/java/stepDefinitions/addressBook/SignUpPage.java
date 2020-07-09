package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class SignUpPage extends BaseFunctions {
    public SignUpPage() {
        super(Hooks.driver);
    }

    @And("I input {word} and {word} and remember them")
    public void input_credentials_and_remember(String email, String password) {
        this.waitAndFindElement(By.id("user_email")).sendKeys(email);
        driver.findElement(By.id("user_password")).sendKeys(password);
        Hooks.email = email;
        Hooks.password = password;
    }

    @And("I click sign up button")
    public void i_click_sign_up_button() {
        driver.findElement(By.xpath("//input[@type='submit' and @value='Sign up']")).click();
    }
}

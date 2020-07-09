package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

public class HomePage extends BaseFunctions {

    public HomePage() {
        super(Hooks.driver);
    }

    @Given("Im on Address Book Home page")
    public void im_on_address_book_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @And("I click sign in link")
    public void click_sign_in_link() {
        driver.findElement(By.id("sign-in")).click();
    }

    @Then("Im signed in with remembered email")
    public void im_signed_in_with_remembered_email() {
        WebElement currentUserSpan = this.waitAndFindElement(By.xpath("//span[@data-test='current-user']"));
        Assertions.assertEquals(currentUserSpan.getText(), Hooks.email);
    }

    @When("I click sign out")
    public void i_click_sign_out() {
        this.waitAndFindElement(By.linkText("Sign out")).click();
    }

    @And("I click Addresses button")
    public void i_click_addresses_button() {
        this.waitAndFindElement(By.linkText("Addresses")).click();
    }

}

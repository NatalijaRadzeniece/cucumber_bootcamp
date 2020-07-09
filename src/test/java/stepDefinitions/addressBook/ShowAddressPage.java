package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

public class ShowAddressPage extends BaseFunctions {

    public ShowAddressPage() {
        super(Hooks.driver);
    }

    @And("I check address added")
    public void i_check_address_added() {
        WebElement alertDiv = waitAndFindElement(By.cssSelector("div.alert"));
        Assertions.assertEquals(alertDiv.getText(), "Address was successfully created.");
    }

    @And("I click List")
    public void i_click_list() {
        driver.findElement(By.linkText("List")).click();
    }
}

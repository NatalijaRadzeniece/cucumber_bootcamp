package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

import java.util.List;

public class AddressesPage extends BaseFunctions {
    public AddressesPage() {
        super(Hooks.driver);
    }

    @And("I click New Address")
    public void i_click_new_address() {
        this.waitAndFindElement(By.linkText("New Address")).click();
    }

    @Then("Address is the same as populated")
    public void address_is_the_same_as_populated() {
        if (!rememberedAddressExistsInList()) {
            Assertions.fail("Newly created address not found");
        }
    }

    @And("I remember and delete address {int}")
    public void i_remember_and_delete_address(int i) {
        WebElement tableRow = this.waitAndFindElement(By.xpath("//table[@class='table']/tbody/tr[" + i + "]"));

        Hooks.firstName = tableRow.findElement(By.xpath("td[1]")).getText();
        Hooks.lastName = tableRow.findElement(By.xpath("td[2]")).getText();
        Hooks.city = tableRow.findElement(By.xpath("td[3]")).getText();

        tableRow.findElement(By.linkText("Destroy")).click();
        driver.switchTo().alert().accept();
    }

    @Then("Remembered address is missing from the list")
    public void remembered_address_is_missing_from_the_list() {
        if (rememberedAddressExistsInList()) {
            Assertions.fail("Address was not deleted");
        }
    }

    private boolean rememberedAddressExistsInList() {
        this.waitAndFindElement(By.linkText("New Address"));
        List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));

        for (WebElement tableRow : tableRows) {
            String firstName = tableRow.findElement(By.xpath("td[1]")).getText();
            String lastName = tableRow.findElement(By.xpath("td[2]")).getText();
            String city = tableRow.findElement(By.xpath("td[3]")).getText();

            if (firstName.equals(Hooks.firstName) && lastName.equals(Hooks.lastName) && city.equals(Hooks.city)) {
                return true;
            }
        }

        return false;
    }
}

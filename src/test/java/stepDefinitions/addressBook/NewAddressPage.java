package stepDefinitions.addressBook;

import core.BaseFunctions;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class NewAddressPage extends BaseFunctions {
    public NewAddressPage() {
        super(Hooks.driver);
    }

    @And("I create new address with {string}, {string}, {string}, {string}, {string}")
    public void i_create_new_address_with(String firstName, String lastName, String address1, String city, String zip) {
        this.waitAndFindElement(By.id("address_first_name")).sendKeys(firstName);
        driver.findElement(By.id("address_last_name")).sendKeys(lastName);
        driver.findElement(By.id("address_street_address")).sendKeys(address1);
        driver.findElement(By.id("address_city")).sendKeys(city);
        driver.findElement(By.id("address_zip_code")).sendKeys(zip);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Create Address']")).click();

        Hooks.firstName = firstName;
        Hooks.lastName = lastName;
        Hooks.city = city;
    }

}

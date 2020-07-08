package stepDefinitions.FinalTaskSteps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObjects.FinalTaskPage.*;
import stepDefinitions.hooks.Hooks;

import java.util.Map;

public class WebSteps {
    private WebDriver driver;
    private String email;
    private String password;
    private Header header;
    private LoginPage loginPage;
    private AddressesListPage addressesListPage;
    private NewAddressPage newAddressPage;
    private AddressDetailsPage addressDetailsPage;

    public WebSteps() {
        this.driver = Hooks.driver;
    }

    @Given("User opens {string}")
    public void userOpensWebPage(String webSite) {
        driver.get(webSite);
        header = new Header(driver);
    }

    @And("User register new account using predefined credentials")
    public void userLoginsUsingPredefinedCredentials() {
        loginPage.registerNewUser(email, password);
    }

    @Given("User opens Login page")
    public void userOpensLoginPage() {
        header.clickSignIn();
    }

    @And("User has email {string} and password {string}")
    public void userHasEmailAndPassword(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Then("User is able to see correct email")
    public void userIsAbleToSeeCorrectEmail() {
        Assertions.assertEquals(header.getUserEmail(), email);
    }

    @And("User logout")
    public void userLogout() {
        header.clickSignOut();
    }

    @And("User login using predefined credentials")
    public void userLoginUsingPredefinedCredentials() {
        loginPage.loginUser(email, password);
    }

    @And("User opens Addresses page")
    public void userOpensAddressesPage() {
        header.clickAddresses();
    }

    @And("User click New Address")
    public void userClickNewAddress() {
        addressesListPage.openNewAddressForm();
    }

    @And("User is on Addresses Page")
    public void userIsOnAddressesPage() {
        addressesListPage = new AddressesListPage(driver);
    }

    @And("User is on Login Page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
    }

    @And("User is on New Address Page")
    public void userIsOnNewAddressPage() {
        newAddressPage = new NewAddressPage(driver);
    }

    @And("User fill New Address Form")
    public void userFillNewAddressForm(DataTable dataTable) {
        Map<String, String> addressDate = dataTable.asMap(String.class, String.class);
        newAddressPage.fillForm(addressDate.get("firstName"), addressDate.get("lastName"), addressDate.get("address1"),
                addressDate.get("address2"), addressDate.get("city"), addressDate.get("zipCode"),
                addressDate.get("birthday"), addressDate.get("age"), addressDate.get("webSite"), addressDate.get("phone"),
                addressDate.get("note"));
    }

    @And("User selects {string}")
    public void userSelects(String state) {
        newAddressPage.selectState(state);
    }

    @And("User select country {string}")
    public void userSelectCountry(String country) {
        newAddressPage.selectCountry(country);
    }

    @And("User submit address data")
    public void userSubmitAddressData() {
        newAddressPage.createNewAddress();
    }

    @Then("User is on Address Details Page")
    public void userIsOnAddressDetailsPage() {
        addressDetailsPage = new AddressDetailsPage(driver);
    }

    @And("User is able to see confirmation message {string} on Address Details Page")
    public void userIsAbleToSeeConfirmationMeesage(String expectedText) {
        Assertions.assertEquals(addressDetailsPage.getConfirmationMessage(), expectedText);
    }

    @And("User is able to see correct address details")
    public void userIsAbleToSeeCorrectAddressDetails(DataTable dataTable) {
        Map<String, String> expectedDate = dataTable.asMap(String.class, String.class);
        Map<String, String> actualData = addressDetailsPage.getAddressDetails();
        for (Map.Entry<String, String> entry : expectedDate.entrySet()) {
            Assertions.assertEquals(entry.getValue(), actualData.get(entry.getKey()));
        }
    }

    @And("User clicks List on Address Details Page")
    public void userClickListOnAddressDetailsPage() {
        addressDetailsPage.clickList();

    }

    @And("User is able to see name {string} and surname {string} and city {string} address in table")
    public void userIsAbleToSeeAddressInTable(String name, String surname, String city) {
        Assertions.assertEquals(addressesListPage.rowExistenceCheckByNameAndSurname(name, surname, city), true);
    }

    @And("User is not able to see name {string} and surname {string} and city {string} address in table")
    public void userIsNotAbleToSeeAddressInTable(String name, String surname, String city) {
        Assertions.assertEquals(addressesListPage.rowExistenceCheckByNameAndSurname(name, surname, city), false);
    }

    @And("User deletes row by surname {string} from Address Details table")
    public void userDeletesRowBySurnameFromAddressDetailsTable(String surname) {
        addressesListPage.deleteRow(surname);
        driver.switchTo().alert().accept();
    }

    @Then("User is able to see confirmation message {string} on Address List Page")
    public void userIsAbleToSeeConfirmationMessageOnAddressListPage(String expectedText) {
        Assertions.assertEquals(addressesListPage.getConfirmationMessage(), expectedText);
    }
}

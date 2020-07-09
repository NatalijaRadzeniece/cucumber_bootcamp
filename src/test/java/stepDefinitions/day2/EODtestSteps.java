package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pageObject.AddUserPage;
import pageObject.EODpage;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;

public class EODtestSteps {

    private WebDriver driver;
    private EODpage eodPage;
    private static String emailUser;
    private static String passUser;

    public EODtestSteps() {
        driver = Hooks.driver;
    }

    @Given("Im on Test address book page")
    public void on_address_book_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in")
    public void sign_in() {
        eodPage = new EODpage(driver);
        eodPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("sign in message {string} appeared")
    public void sign_in_message(String message) {
        Assertions.assertTrue(message.equals(eodPage.getSignInMessage()), "Message not the same");
    }

    @And("I click sign up")
    public void sign_up() {
        eodPage.clickSignUpButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("sign up message {string} appeared")
    public void sign_up_message(String message) {
        Assertions.assertTrue(message.equals(eodPage.getSignUpMessage()), "Message not the same");
    }


    @And("I add e-mail {string} and password {string}")
    public void add_user_data(String email, String mypassword) {
        eodPage.setUserEmail(email);
        eodPage.setUserPassword(mypassword);
        emailUser = email;
        passUser = mypassword;
    }

    @And("I click user sign up")
    public void user_sign_up() {
        eodPage.clickUserSignUpButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("welcome message {string} appeared")
    public void welcome_message(String welcome) {
        Assertions.assertTrue(welcome.equals(eodPage.getWelcomeMessage()), "Message not the same");
    }

    @And("I click user sign out")
    public void user_sign_out() {
        eodPage.clickUserSignOutButton();
    }

    @Then("second sign in message {string} appeared")
    public void second_sign_in_message(String secondsignin) {
        Assertions.assertTrue(secondsignin.equals(eodPage.getSignInMessage()), "Message not the same");
    }

    @When("I click first user sign in")
    public void first_user_sign_in() {
        eodPage = new EODpage(driver);
        eodPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("first user sign in message {string} appeared")
    public void first_user_sign_in_message(String firstusersignin) {
        Assertions.assertTrue(firstusersignin.equals(eodPage.getSignInMessage()), "Message not the same");
    }

    @And("I populate e-mail and password from previous test")
    public void add_email_password() {
        //eodPage = new EODpage(driver);
        eodPage.setRegisteredUserEmail(emailUser);
        eodPage.setRegisteredUserPassword(passUser);
    }

    @And("I click user sign in")
    public void user_sign_in() {
        eodPage.clickUserSignInButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("user welcome page message {string} appeared")
    public void user_welcome_message(String userwelcome) {
        Assertions.assertTrue(userwelcome.equals(eodPage.getWelcomeMessage()), "Message not the same");
    }

    @And("I click button Addresses")
    public void button_addresses() {
        eodPage.clickButtonAddresses();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("table {string} appeared")
    public void table_addresses(String table) {
        Assertions.assertTrue(table.equals(eodPage.getAddressesTable()), "Message not the same");
    }

    @And("I click button NewAddress")
    public void button_new_address() {
        eodPage.clickButtonNewAddress();
    }

    @Then("new table {string} appeared")
    public void table_new_addresses(String newaddresses) {
        Assertions.assertTrue(newaddresses.equals(eodPage.getNewAddressesTable()), "Message not the same");
    }

    @And("I populate {string}, {string}, {string}, {string}, {string}, {string}")
    public void add_address_data(String firstname, String lastname, String address, String city, String state, String zipcode) {
        eodPage.setFirstName(firstname);
        eodPage.setLastName(lastname);
        eodPage.setFirstAddress(address);
        eodPage.setCity(city);
        eodPage.selectFromStateDD(state);
        eodPage.setZipCode(zipcode);
    }

    @And("click button create address")
    public void button_create_address() {
        eodPage.clickButtonCreateAddress();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("I see message {string}")
    public void message_address_success(String success) {
        Assertions.assertTrue(success.equals(eodPage.getNewAdressesSuccess()), "Message not the same");
    }

//    @And("I click List")
//    public void click_list() {
//        eodPage.clickButtonList();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    }
//
//    @Then("verify that {string}, {string}, {string} on list are the same as  were populated")
//    public void add_address_data(String firstname, String lastname, String address) {
//        Assertions.assertTrue(firstname.equals(eodPage.getTableFirstName()), "First name not the same");
//        Assertions.assertTrue(lastname.equals(eodPage.getTableLastName()), "First name not the same");
//    }

    @When("I click address sign in")
    public void address_user_sign_in() {
        eodPage = new EODpage(driver);
        eodPage.clickSignInButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("address user sign in message {string} appeared")
    public void address_user_sign_in_message(String addressusersignin) {
        Assertions.assertTrue(addressusersignin.equals(eodPage.getSignInMessage()), "Message not the same");
    }

    @And("I enter e-mail and password from previous test to address")
    public void address_email_password() {
        eodPage.setRegisteredUserEmail(emailUser);
        eodPage.setRegisteredUserPassword(passUser);
    }

    @And("I sign in to address")
    public void address_sign_in() {
        eodPage.clickUserSignInButton();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("I see address enter message {string}")
    public void address_welcome_message(String addresswelcome) {
        Assertions.assertTrue(addresswelcome.equals(eodPage.getWelcomeMessage()), "Message not the same");
    }

    @And("I click tab Addresses to address")
    public void tab_addresses() {
        eodPage.clickButtonAddresses();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Then("list of addresses {string} appeared")
    public void listing_addresses(String listing) {
        Assertions.assertTrue(listing.equals(eodPage.getAddressesTable()), "Message not the same");
    }

    @And("I click destroy button for first address row")
    public void destroy_address() {
        eodPage.clickButtonFromListDestroy(0);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        eodPage.acceptAlert();
    }

    @Then("destroyed address {string} removed from table")
    public void new_listing_addresses(String removedcity) {
        Assertions.assertFalse(removedcity.equals(eodPage.getCityTable()), "Message not the same");
    }
}
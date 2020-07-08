package stepDefinitions.day2;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObject.AddUserPage;
import pageObject.day2.*;
import stepDefinitions.hooks.Hooks;

public class AddressTestSteps {
    private WebDriver driver;
    private TestAddressPage testAddressPage;
    private SignUpPage signUpPage;
    private SignInPage signInPage;
    private static String mail;
    private static String passWord;
    private static String mail2;
    private static String passWord2;
    private AddressesPage addressesPage;
    private AddAddressPage addAddressPage;
    private SpecAddressPage specAddressPage;

    public AddressTestSteps() {
        driver = Hooks.driver;
    }

    @Given("I am on TestAddress page")
    public void on_test_address_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in")
    public void click_sign_in_main_page() {
        testAddressPage = new TestAddressPage(driver);
        testAddressPage.clickSignInButtonMainPage();
    }

    @When("I click sign up")
    public void click_sign_up_button() {
        signInPage = new SignInPage(driver);
        signInPage.clickSignUpButton();
    }

    @And("I add email {string} and password {string} in sign up fields")
    public void add_user_data(String e_mail, String pass) {
        signUpPage = new SignUpPage(driver);
        signUpPage.setEmail(e_mail);
        signUpPage.setPassword(pass);
        mail = e_mail;
        passWord = pass;
    }

    @And("I click sign up again")
    public void click_button_to_join() {
        signUpPage.clickSignUp();
    }

    @Then("I press sign out")
    public void click_sign_out_button() {
        testAddressPage.clickSignInButtonMainPage();
    }

    @When("I add email {string} and password {string} in sign in fields")
    public void add_user_data_for_sign_in(String e_mail2, String pass2) {
        signInPage = new SignInPage(driver);
        signInPage.setEmail2(e_mail2);
        signInPage.setPassword2(pass2);
        mail2 = e_mail2;
        passWord2 = pass2;
    }

    @And("I click sign in button")
    public void click_sign_in_again() {
        signInPage.clickSignInButton();
    }

    @And("I click Addresses")
    public void click_addresses_button() {
        testAddressPage.clickAddressesButton();
    }

    @And("I click new Address")
    public void click_new_address_button() {
        addressesPage = new AddressesPage(driver);
        addressesPage.ClickNewAddress();
    }

    @And("I add first name{string}")
    public void send_first_name(String firstName) {
        addAddressPage = new AddAddressPage(driver);
        addAddressPage.setFirstNameField(firstName);
    }

    @And("I add last name{string}")
    public void send_last_name(String lastName) {
        addAddressPage.setLastNameField(lastName);
    }

    @And("I add address{string}")
    public void send_address(String address1) {
        addAddressPage.setAddress1Field(address1);
    }

    @And("I add city{string}")
    public void send_city(String city) {
        addAddressPage.setCityField(city);
    }

    @And("I add state{string}")
    public void send_state(String state) {
        addAddressPage.setStateSelector(state);
    }

    @And("I add zip code{string}")
    public void send_zip_code(String zip) {
        addAddressPage.setZipCodeField(zip);
    }

    @And("I click create Address")
    public void click_create_address() {
        addAddressPage.clickCreateAddressButton();
    }

    @And("I see message {string}")
    public void verify_message(String message) {
        specAddressPage = new SpecAddressPage(driver);
        Assertions.assertTrue(message.equals(specAddressPage.getVerifyMessage()), "Message not the same");
    }

    @Then("I click on list")
    public void click_list_button() {
        specAddressPage.clickListButton();
    }

    //    @Then("I verify address is now on page")
    @When("I add email once more {string} and password {string} in sign in fields")
    public void add_user_data_for_destroy(String e_mail2, String pass2) {
        signInPage = new SignInPage(driver);
        signInPage.setEmail2(e_mail2);
        signInPage.setPassword2(pass2);
        mail2 = e_mail2;
        passWord2 = pass2;
    }

    @And("I click sign in button again")
    public void click_sign_in_to_destroy() {
        signInPage.clickSignInButton();
    }

    @And("I click on Addresses")
    public void click_addresses_button_to_destory() {
        testAddressPage.clickAddressesButton();
    }

    @And("I destroy one address")
    public void destroy_address() {
        addressesPage = new AddressesPage(driver);
        addressesPage.clickDestroy();
        addressesPage.acceptAlert();
    }

    @Then("Appears message {string}")
    public void verify_destroy_address(String message) {
        Assertions.assertEquals(message, addressesPage.getVerifyDestroyMessage(), "Message not the sane");
    }


}

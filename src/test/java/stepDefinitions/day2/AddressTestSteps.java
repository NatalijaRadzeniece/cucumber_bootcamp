package stepDefinitions.day2;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import pageObject.AddUserPage;
import pageObject.day2.AddAddressPage;
import pageObject.day2.AddressesPage;
import pageObject.day2.SignInPage;
import pageObject.day2.TestAddressPage;
import stepDefinitions.hooks.Hooks;

public class AddressTestSteps {
    private WebDriver driver;
    private TestAddressPage testAddressPage;
    private SignInPage signInPage;
    private static String mail;
    private static String passWord;
    private AddressesPage addressesPage;
    private AddAddressPage addAddressPage;

    public AddressTestSteps() {
        driver = Hooks.driver;
    }

    @Given("I am on TestAddress page")
    public void on_test_address_page(){
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click sign in")
    public void click_sign_in_main_page(){
        testAddressPage = new TestAddressPage(driver);
        testAddressPage.clickSignInButtonMainPage();
    }

    @When("I click sign up")
    public void click_sign_up_button(){
        signInPage = new SignInPage(driver);
        signInPage.clickSignUpButton();
    }

    @And("I add email {string} and password {string}")
    public void add_user_data(String e_mail, String pass) {
        signInPage.setEmail(e_mail);
        signInPage.setPassword(pass);
        mail = e_mail;
        passWord = pass;
    }

    @And("I click sign up again")
    public void click_button_to_join(){
        signInPage.clickCommitButton();
    }

    @Then("I press sign out")
    public void click_sign_out_button(){
        testAddressPage.clickSignInButtonMainPage();
    }

    @And("I click Addresses")
    public void click_addresses_button(){
        testAddressPage.clickAddressesButton();
    }

    @And("I click new Address")
    public void click_new_address_button(){
        addressesPage = new AddressesPage(driver);
        addressesPage.ClickNewAddress();
    }

    @And("I add first name{string}")
    public void send_first_name(String firstName){
        addAddressPage = new AddAddressPage(driver);
        addAddressPage.setFirstNameField(firstName);
    }

    @And("I add last name{string}")
    public void send_last_name(String lastName){
        addAddressPage.setLastNameField(lastName);
    }

    @And("I add address{string}")
    public void send_address(String address1){
        addAddressPage.setAddress1Field(address1);
    }

    @And("I add city{string}")
    public void send_city(String city){
        addAddressPage.setCityField(city);
    }

    @And("I add state{string}")
    public void send_state(String state){
        addAddressPage.setStateSelector(state);
    }

    @And("I add zip code{string}")
    public void send_zip_code(String zip){
        addAddressPage.setZipCodeField(zip);
    }

    @And("I click create Address")
    public void click_create_address(){
        addAddressPage.clickCreateAddressButton();
    }




}

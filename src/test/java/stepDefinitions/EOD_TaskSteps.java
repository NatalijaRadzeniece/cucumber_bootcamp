package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObject.*;
import stepDefinitions.hooks.Hooks;

public class EOD_TaskSteps {


    private WebDriver driver;

    public EOD_TaskSteps() {
        driver = Hooks.driver;
    }

    private String Email;
    private String Password;

    @Given("I am in HomePage")
    public void i_am_in_HomePage() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("I click Sign in")
    public void i_click_Sign_in() {
        HomePage HomePage = new HomePage(driver);
        HomePage.clickSignIn();


    }

    @And("I click Sign up")
    public void i_click_Sign_up() {
        SignInPage SignInPage = new SignInPage(driver);
        SignInPage.clickSignInButton();
    }

    @And("I write Email {string} and Password {string}")
    public void i_write_Email_ginger_inbox_lv_and_Password_test123(String mail, String PAssword) {
        SignUpPage SignUpPage = new SignUpPage(driver);
        SignUpPage.setEmail(mail);
        SignUpPage.setPassword(PAssword);


    }

    @And("I click Sign up again")
    public void i_click_Sign_up_again() {
        SignUpPage SignUpPage = new SignUpPage(driver);
        SignUpPage.clickSignUp();
    }

    @Then("I click Sing out")
    public void i_click_Sing_out() {
        SignHomePage SignHomePage = new SignHomePage(driver);
        SignHomePage.clickSignOut();
    }

    @When("I add Username and Password to credintials")
    public void i_add_Username_and_Password_to_credintials() {
        SignInPage SignInPage = new SignInPage(driver);

    }

    @And("I click Sign in again")
    public void i_click_Sign_in_again() {
        SignInPage SignInPage = new SignInPage(driver);
        SignInPage.SignIn(Email, Password);
        SignInPage.clickSignInButton();
    }

    @And("I click Addreses")
    public void i_click_Addreses() {
        SignHomePage SignHomePage = new SignHomePage(driver);
        SignHomePage.addresClick();
    }

    @And("I click New Address")
    public void i_click_New_Address() {
        AddresesPage AddresesPage = new AddresesPage(driver);
        AddresesPage.NewAddress();

    }

    @And("I add {string}, {string}, {string}, {string}, {string}")
    public void i_add(String string, String string2, String string3, String string4, String string5) {
        AddressWriteInPage AddressWriteInPage = new AddressWriteInPage(driver);
        AddressWriteInPage.Data(string, string2, string3, string4, string5);
    }

    @And("I click Creat Address")
    public void i_click_Creat_Address() {
        AddressWriteInPage AddressWriteInPage = new AddressWriteInPage(driver);
        AddressWriteInPage.CreatAddr();
    }

    @And("I chech if address successfully created")
    public void i_chech_if_address_successfully_created() {
        ForCheck ForCheck = new ForCheck(driver);
        Assertions.assertEquals("Address was successfully created.", ForCheck.getVerifyMessage(), "Smth went wrong");
    }

    @And("I click List")
    public void i_click_List() {
        ForCheck ForCheck = new ForCheck(driver);
        ForCheck.clickList();
    }

    @Then("I check if addresses match by {string}")
    public void i_check_if_addresses_match_by(String string) {

    }

    @And("I Sign out")
    public void i_Sign_out() {

    }

    @When("I write Email ginger@inbox.lv and Password test123 again")
    public void i_write_Email_ginger_inbox_lv_and_Password_test123_again() {

    }

    @And("I click Sign in againagain")
    public void i_click_Sign_in_againagain() {

    }

    @And("I click Addresses again")
    public void i_click_Addresses_again() {

    }

    @And("I destroy first address")
    public void i_destroy_first_address() {
        System.out.println("destroy");
    }

    @Then("success message appears")
    public void success_message_appears() {
        System.out.println("Successs");
    }

}

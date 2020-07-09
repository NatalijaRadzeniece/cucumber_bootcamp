package pageObjects.finalWork;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreatePage extends BaseCore {
    @FindBy(how = How.XPATH, using = "//a[@id='sign-in']")
    private WebElement signIn;

    @FindBy(how = How.XPATH, using = "//input[@id='user_email']")
    private WebElement email;

    @FindBy(how = How.XPATH, using = "//input[@id='user_password']")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "//input[@name='commit']")
    private WebElement signUpTwo;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Addresses')]")
    private WebElement addresses;

    @FindBy(how = How.XPATH, using = "//a[@class='row justify-content-center']")
    private WebElement newAddresses;

    @FindBy(how = How.XPATH, using = "//input[@id='address_first_name']")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "//input[@id='address_last_name']")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "//input[@id='address_street_address']")
    private WebElement street;

    @FindBy(how = How.XPATH, using = "//input[@id='address_city']")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "//input[@id='address_zip_code']")
    private WebElement zipCode;

    @FindBy(how = How.XPATH, using = "//input[@name='commit']")
    private WebElement createAddress;

    @FindBy(how = How.XPATH, using = "////a[contains(text(),'List')]")
    private WebElement list;


    public void clickSignIn() {
        signIn.click();
    }

    public void addEmail(String mail) {
        email.sendKeys(mail);
    }

    public void addPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSignUpTwo() {
        signUpTwo.click();
    }

    public void clickaddresses() {
        addresses.click();
    }

    public void clickNewAddress() {
        newAddresses.click();
    }


         public void setFirstName(String String firstNamen) {
              firstName.sendKeys();
    }

          public void setLastName(String String lastNamen) {
              lastName.sendKeys();
          }

        public void setStreet(String String address1) {
                street.sendKeys();
    }

        public void setCity(String String city) {
            this.city.sendKeys();
        }

        public void setzipCode(String String zip) {
            zipCode.sendKeys();
        }


        public void clickcreate(){
            createAddress.click();
        }


        public void clickList(){
            list.click();
        }































    public CreatePage(WebDriver driver) {
            super(driver);
        }
    }

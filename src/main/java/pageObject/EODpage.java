package pageObject;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class EODpage extends BaseCore {

    public EODpage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "sign-in")
    private WebElement signInButton;

    public void clickSignInButton() {
        signInButton.click();
    }

    @FindBy(how = How.XPATH, using = "//div/h2")
    private WebElement signInMessage;

    public String getSignInMessage() {
        return signInMessage.getText();
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-up']")
    private WebElement signUpButton;

    public void clickSignUpButton() {
        signUpButton.click();
    }

    @FindBy(how = How.XPATH, using = "//h2[@class='text-center']")
    private WebElement signUpMessage;

    public String getSignUpMessage() {
        return signUpMessage.getText();
    }

    @FindBy(how = How.ID, using = "user_email")
    private WebElement userEmail;

    public void setUserEmail(String useremail) {
        userEmail.sendKeys(useremail);
    }

    @FindBy(how = How.ID, using = "user_password")
    private WebElement userPassword;

    public void setUserPassword(String mypassword) {
        userPassword.sendKeys(mypassword);
    }

    @FindBy(how = How.NAME, using = "commit")
    private WebElement userSignUpButton;

    public void clickUserSignUpButton() {
        userSignUpButton.click();
    }

    @FindBy(how = How.XPATH, using = "//div/h1")
    private WebElement welcomeMessage;

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement userSignOutButton;

    public void clickUserSignOutButton() {
        userSignOutButton.click();
    }

    @FindBy(how = How.XPATH, using = "//input[@value='Sign in']")
    private WebElement userSignInButton;

    public void clickUserSignInButton() {
        userSignInButton.click();
    }

    @FindBy(how = How.ID, using = "session_email")
    private WebElement registeredUserEmail;

    public void setRegisteredUserEmail(String reguseremail) {
        registeredUserEmail.sendKeys(reguseremail);
    }

    @FindBy(how = How.ID, using = "session_password")
    private WebElement registeredUserPassword;

    public void setRegisteredUserPassword(String regpassword) {
        registeredUserPassword.sendKeys(regpassword);
    }


    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement buttonAddresses;

    public void clickButtonAddresses() {
        buttonAddresses.click();
    }

    @FindBy(how = How.XPATH, using = "//div/h2")
    private WebElement addressesTable;

    public String getAddressesTable() {
        return addressesTable.getText();
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement buttonNewAddress;

    public void clickButtonNewAddress() {
        buttonNewAddress.click();
    }

    @FindBy(how = How.XPATH, using = "//h2")
    private WebElement newAddressesTable;

    public String getNewAddressesTable() {
        waitTextToBeInElement(newAddressesTable,"New Address");
        return newAddressesTable.getText();
    }

    @FindBy(how = How.ID, using = "address_first_name")
    private WebElement addressFirstName;

    public void setFirstName(String afirstname) {
        addressFirstName.sendKeys(afirstname);
    }

    @FindBy(how = How.ID, using = "address_last_name")
    private WebElement addressLastName;

    public void setLastName(String alastname) {
        addressLastName.sendKeys(alastname);
    }

    @FindBy(how = How.ID, using = "address_street_address")
    private WebElement firstAddress;

    public void setFirstAddress(String firstaddress) {
        firstAddress.sendKeys(firstaddress);
    }

    @FindBy(how = How.ID, using = "address_city")
    private WebElement addressCity;

    public void setCity(String addresscity) {
        addressCity.sendKeys(addresscity);
    }

    @FindBy(how = How.ID, using = "address_state")
    private WebElement addressState;

    public void selectFromStateDD(String astate){
        selectByVisibleText(addressState, astate);
    }

    @FindBy(how = How.ID, using = "address_zip_code")
    private WebElement zipCode;

    public void setZipCode(String azipcode) {
        zipCode.sendKeys(azipcode);
    }

    @FindBy(how = How.XPATH, using = "//input[@value='Create Address']")
    private WebElement buttonCreateAddress;

    public void clickButtonCreateAddress() {
        buttonCreateAddress.click();
    }

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement newAdressesSuccess;

    public String getNewAdressesSuccess() {
        return newAdressesSuccess.getText();
    }

//    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
//    private WebElement buttonList;
//
//    public void clickButtonList() {
//        buttonList.click();
//    }
//    @FindBy(how = How.XPATH, using = "//tr/td")
//    private List<WebElement> listTable;
//    public String getTableFirstName() {
//        String tfirstname = listTable.get(0).getText();
//        return tfirstname;
//    }
//    public String getTableLastName() {
//        String tlastname = listTable.get(1).getText();
//        return tlastname;
//    }

    @FindBy(how = How.XPATH, using = "//a[contains(@data-test, 'destroy')]")
    List<WebElement> listDestroy;

    public void clickButtonFromListDestroy(int i) {
        listDestroy.get(i).click();
    }

    @FindBy(how = How.XPATH, using = "//tr/td")
    private List<WebElement> listAddressTable;
    public String getCityTable() {
        String cityleft = listAddressTable.get(2).getText();
        return cityleft;
    }

}

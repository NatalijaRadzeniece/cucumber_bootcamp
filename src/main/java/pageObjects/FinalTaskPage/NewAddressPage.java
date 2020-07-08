package pageObjects.FinalTaskPage;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NewAddressPage extends BaseFunc {
    public NewAddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "address_first_name")
    private WebElement firstNameField;

    @FindBy(how = How.ID, using = "address_last_name")
    private WebElement lastNameField;

    @FindBy(how = How.ID, using = "address_street_address")
    private WebElement address1Field;

    @FindBy(how = How.ID, using = "address_secondary_address")
    private WebElement address2Field;

    @FindBy(how = How.ID, using = "address_city")
    private WebElement cityField;

    @FindBy(how = How.ID, using = "address_state")
    private WebElement stateDropdown;

    @FindBy(how = How.ID, using = "address_zip_code")
    private WebElement zipCodeField;

    @FindBy(how = How.ID, using = "address_country_canada")
    private WebElement canadaCheckbox;

    @FindBy(how = How.ID, using = "address_country_us")
    private WebElement unitedStateCheckbox;

    @FindBy(how = How.ID, using = "address_birthday")
    private WebElement birthdayField;

    @FindBy(how = How.ID, using = "address_age")
    private WebElement ageField;

    @FindBy(how = How.ID, using = "address_website")
    private WebElement websiteField;

    @FindBy(how = How.ID, using = "address_interest_dance")
    private WebElement dancingField;

    @FindBy(how = How.ID, using = "address_phone")
    private WebElement phoneField;

    @FindBy(how = How.ID, using = "address_note")
    private WebElement noteField;

    @FindBy(how = How.XPATH, using = "//input[@value='Create Address']")
    private WebElement createAddressField;

    public void fillForm(String name, String surname, String address1, String address2, String city, String zipCode,
                         String birthday, String age, String website, String phone, String note) {
        typeNewText(firstNameField, name);
        typeNewText(lastNameField, surname);
        typeNewText(address1Field, address1);
        typeNewText(address2Field, address2);
        typeNewText(cityField, city);
        typeNewText(zipCodeField, zipCode);
        typeNewText(birthdayField, birthday);
        typeNewText(ageField, age);
        typeNewText(websiteField, website);
        typeNewText(phoneField, phone);
        typeNewText(noteField, note);
    }

    public void selectState(String state) {
        Select slc = new Select(stateDropdown);
        slc.selectByVisibleText(state);
    }

    public void selectCountry(String country) {
        switch (country.toUpperCase()) {
            case "CANADA": {
                canadaCheckbox.click();
                break;
            }
            case "UNITED STATE": {
                unitedStateCheckbox.click();
                break;
            }
            default: throw new RuntimeException("This site accept only United State and Canada Addresses");
        }
    }

    public void createNewAddress() {
        createAddressField.click();
    }
}

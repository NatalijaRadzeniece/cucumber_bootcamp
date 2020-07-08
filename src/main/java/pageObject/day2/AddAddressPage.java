package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddAddressPage extends BaseCore {

    @FindBy(how = How.NAME, using = "address[first_name]")
    private WebElement firstNameField;

    @FindBy(how = How.NAME, using = "address[last_name]")
    private WebElement lastNameField;

    @FindBy(how = How.NAME, using = "address[address1]")
    private WebElement address1Field;

    @FindBy(how = How.NAME, using = "address[city]")
    private WebElement cityField;

    @FindBy(how = How.NAME, using = "address[state]")
    private WebElement stateSelector;

    @FindBy(how = How.NAME, using = "address[zip_code]")
    private WebElement zipCodeField;

    @FindBy(how = How.NAME, using = "commit")
    private WebElement createAddressButton;

    public AddAddressPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstNameField(String firstName) {
        waitElementAppeared(firstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void setAddress1Field(String address) {
        address1Field.sendKeys(address);
    }

    public void setCityField(String city) {
        cityField.sendKeys(city);
    }

    public void setStateSelector(String state) {
        Select select = new Select(stateSelector);
        select.selectByValue(state);
    }

    public void setZipCodeField(String zip) {
        zipCodeField.sendKeys(zip);
    }

    public void clickCreateAddressButton() {
        createAddressButton.click();
    }

}

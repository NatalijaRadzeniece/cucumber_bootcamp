package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODAddressesNewPage extends BaseCore {

    public EODAddressesNewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='address_first_name']")
    private WebElement firstNameField;

    @FindBy(how = How.XPATH, using = "//*[@id='address_last_name']")
    private WebElement lastNameField;

    @FindBy(how = How.XPATH, using = "//*[@id='address_street_address']")
    private WebElement address1Field;

    @FindBy(how = How.XPATH, using = "//*[@id='address_city']")
    private WebElement cityField;

    @FindBy(how = How.XPATH, using = "//*[@id='address_zip_code']")
    private WebElement zipCodeField;

    @FindBy(how = How.XPATH, using = "//*[@id='new_address']/div[17]/input")
    private WebElement createAddressButton;

    public void setData(String fName, String lName, String addr, String city, String zip){
        waitForElementAppeared(firstNameField);
        firstNameField.sendKeys(fName);
        lastNameField.sendKeys(lName);
        address1Field.sendKeys(addr);
        cityField.sendKeys(city);
        zipCodeField.sendKeys(zip);
    }

    public void clickCreateAddressButton(){
        createAddressButton.click();
    }

}

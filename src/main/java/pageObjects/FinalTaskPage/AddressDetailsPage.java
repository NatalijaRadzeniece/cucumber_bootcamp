package pageObjects.FinalTaskPage;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressDetailsPage extends BaseFunc {
    public AddressDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement confirmationField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='first_name']")
    private WebElement firstNameField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='last_name']")
    private WebElement lastNameField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='street_address']")
    private WebElement streetAddressField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='secondary_address']")
    private WebElement secondaryAddressField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='city']")
    private WebElement cityField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='state']")
    private WebElement stateField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='zip_code']")
    private WebElement zipCodeField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='country']")
    private WebElement countryField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='birthday']")
    private WebElement birthdayField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='color']")
    private WebElement colorField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='age']")
    private WebElement ageField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='website']")
    private WebElement websiteField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='phone']")
    private WebElement phoneField;

    @FindBy(how = How.XPATH, using = "//span[@data-test='interest_climb']")
    private WebElement climbing;

    @FindBy(how = How.XPATH, using = "//span[@data-test='interest_dance']")
    private WebElement dancing;

    @FindBy(how = How.XPATH, using = "//span[@data-test='interest_read']")
    private WebElement reading;

    @FindBy(how = How.XPATH, using = "//span[@data-test='note']")
    private WebElement noteField;

    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
    private WebElement listButton;


    public String getConfirmationMessage() {
        return confirmationField.getText();
    }

    public Map<String, String> getAddressDetails() {
        Map<String, String> data = new HashMap<>();
        data.put("firstName", firstNameField.getText());
        data.put("lastName", lastNameField.getText());
        data.put("address1", streetAddressField.getText());
        data.put("address2", secondaryAddressField.getText());
        data.put("city", cityField.getText());
        data.put("zipCode", zipCodeField.getText());
        data.put("birthday", birthdayField.getText());
        data.put("age", ageField.getText());
        data.put("webSite", websiteField.getText());
        data.put("phone", phoneField.getText());
        data.put("climbing", climbing.getText());
        data.put("dancing", dancing.getText());
        data.put("reading", reading.getText());
        data.put("note", noteField.getText());
        return data;
    }

    public void clickList() {
        listButton.click();
    }
}

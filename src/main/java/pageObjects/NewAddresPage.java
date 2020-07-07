package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAddresPage extends BaseCore {
    public NewAddresPage(WebDriver driver) {
        super(driver);
    }
//
//    @FindBy(how = How.ID, using = "address_first_name")
//    private WebElement addressName;
//
//    public void setFirstNameField(String name) {
//        addressName.sendKeys(name);
//    }
//
//    @FindBy(how = How.ID, using = "address_last_name")
//    private WebElement addressLastName;
//
//    public void setAddressLastNameField(String lastname) {
//        addressLastName.sendKeys(lastname);
//    }
//
//    @FindBy(how = How.NAME, using = "address[address1]")
//    private WebElement addressAddress;
//
//    public void setAddressAddressField(String address) {
//        addressAddress.sendKeys(address);
//    }
//
//    @FindBy(how = How.ID, using = "address_city")
//    private WebElement addressCity;
//
//    public void setAddressCityField(String city) {
//        addressCity.sendKeys(city);
//    }
    @FindBy(how = How.CSS, using = "[value='Create Address']")
           private WebElement createAddressReadyBtn;

       public void clickCreateAddressReadyBtn() {
           createAddressReadyBtn.click();
       }
}

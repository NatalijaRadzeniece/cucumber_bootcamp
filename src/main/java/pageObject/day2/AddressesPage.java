package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressesPage extends BaseCore {

    @FindBy(how = How.CLASS_NAME, using = "row justify-content-center")
    private WebElement newAddress;


    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    public void ClickNewAddress(){
        newAddress.click();
    }
}

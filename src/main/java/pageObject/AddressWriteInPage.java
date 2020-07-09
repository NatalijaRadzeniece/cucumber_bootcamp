package pageObject;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressWriteInPage extends BaseFunc {

    public AddressWriteInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.NAME, using = "address[first_name]")
    private WebElement firstName;

    @FindBy(how = How.NAME, using = "address[last_name]")
    private WebElement lastName;

    @FindBy(how = How.NAME, using = "address[address1]")
    private WebElement address1;

    @FindBy(how = How.NAME, using = "address[city]")
    private WebElement city;

    @FindBy(how = How.NAME, using = "address[zip_code]")
    private WebElement ZiperCode;



    public void Data(String FirstName, String LastName, String address, String City, String ZipCode){
        firstName.sendKeys(FirstName);
        lastName.sendKeys(LastName);
        address1.sendKeys(address);
        city.sendKeys(City);
        ZiperCode.sendKeys(ZipCode);
    }

}

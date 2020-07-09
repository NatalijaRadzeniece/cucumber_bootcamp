package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODAddressShowPage extends BaseCore {

    public EODAddressShowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div/p[1]/span[2]")
    private WebElement firstName;

    @FindBy(how = How.XPATH, using = "/html/body/div/p[2]/span[2]")
    private WebElement lastName;

    @FindBy(how = How.XPATH, using = "/html/body/div/p[3]/span[2]")
    private WebElement address1;

    @FindBy(how = How.XPATH, using = "/html/body/div/p[5]/span[2]")
    private WebElement city;

    @FindBy(how = How.XPATH, using = "/html/body/div/p[7]/span[2]")
    private WebElement zipCode;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/a[2]")
    private WebElement listLink;

    public String getFirstName(){
        waitForElementAppeared(firstName);
        return firstName.getText();
    }

    public String getLastName(){
        return lastName.getText();
    }

    public String getAddress1(){
        return address1.getText();
    }

    public String getCity(){
        return city.getText();
    }

    public String getZipCode(){
        return zipCode.getText();
    }

    public void clickListLink(){
        listLink.click();
    }


}

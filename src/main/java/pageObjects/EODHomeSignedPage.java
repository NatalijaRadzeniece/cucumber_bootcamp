package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODHomeSignedPage extends BaseCore {

    public EODHomeSignedPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/div[1]/a[3]")
    private WebElement signOutButton;

    @FindBy(how = How.XPATH, using = "//*[@id='navbar']/div[1]/a[2]")
    private WebElement addressesLink;


    public void clickSignOut(){
        waitForElementAppeared(signOutButton);
        signOutButton.click();
    }

    public void clickAddressesLink(){
        waitForElementAppeared(addressesLink);
        addressesLink.click();
    }


}

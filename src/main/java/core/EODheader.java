package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODheader extends BaseFunc {

    @FindBy(how = How.ID, using = "sign-in")
    private WebElement signInLink;

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement signOutLink;

    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement addressesLink;


    public EODheader(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickSignOutLink() {
        signOutLink.click();
    }

    public void clickAddressesLink() {
        addressesLink.click();
    }
}

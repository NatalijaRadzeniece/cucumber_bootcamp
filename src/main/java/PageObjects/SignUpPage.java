package PageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage  extends BaseCore {
    public SignUpPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement signOutLink;

    public void ClickSignOutButton() {

        signOutLink.click();
    }
    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement addresses;

    public void ClickAddresses()
    {
        addresses.click();
    }

}

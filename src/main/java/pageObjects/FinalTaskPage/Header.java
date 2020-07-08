package pageObjects.FinalTaskPage;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends BaseFunc {
    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "sign-in")
    private WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement addressesButton;

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement signOutButton;

    @FindBy(how = How.XPATH, using = "//span[@data-test='current-user']")
    private WebElement userEmailField;

    public void clickSignIn() {
        signInButton.click();
    }

    public void clickAddresses() {
        addressesButton.click();
    }

    public void clickSignOut() {
        signOutButton.click();
    }

    public String getUserEmail() {
        return userEmailField.getText();
    }
}

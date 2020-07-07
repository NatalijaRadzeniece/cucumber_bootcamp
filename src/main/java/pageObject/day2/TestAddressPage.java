package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestAddressPage extends BaseCore {

    @FindBy(how = How.ID, using = "sign-in")
    private WebElement signInButtonMainPage;

    @FindBy(how = How.XPATH, using = "//a[@data-test='sign-out']")
    private WebElement logOutButton;

    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement addressesButton;

    public TestAddressPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButtonMainPage() {
        signInButtonMainPage.click();
    }

    public void clickSignOutButton(){
        waitElementAppeared(logOutButton);
        logOutButton.click();
    }

    public void clickAddressesButton(){
        addressesButton.click();
    }
}

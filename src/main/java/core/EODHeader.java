package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODHeader extends BaseCore {

    public EODHeader(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "[data-test=sign-out]")
    private WebElement signOutBtn;

    public void clickSignOutBtn() {
        signOutBtn.click();
    }

    @FindBy(how = How.CSS, using = "[data-test=addresses]")
    private WebElement addressBtn;

    public void clickAddressBtn() {
        addressBtn.click();
    }

    @FindBy(how = How.CSS, using = "[data-test='create']")
    private WebElement createNewAddressBtn;
    public void clickCreateNewAddressBtn() {
        createNewAddressBtn.click();
    }


}

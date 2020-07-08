package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressesPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement newAddress;

    @FindBy(how = How.CSS, using = "tbody>:last-child")
    private WebElement myLastAddress;

    @FindBy(how = How.XPATH, using = "//a[contains(@data-test,'destroy')]")
    private WebElement destroyAddress;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement verifyDestroy;

    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    public void ClickNewAddress() {
        waitElementAppeared(newAddress);
        newAddress.click();
    }

    public String getAddressFirstName() {
        waitElementAppeared(myLastAddress);
        return myLastAddress.findElement(By.cssSelector("tr>:first-child")).getText();
    }

    public void clickDestroy() {
        waitElementAppeared(destroyAddress);
        destroyAddress.click();
    }

    public String getVerifyDestroyMessage() {
        waitElementAppeared(verifyDestroy);
        return verifyDestroy.getText();
    }
}
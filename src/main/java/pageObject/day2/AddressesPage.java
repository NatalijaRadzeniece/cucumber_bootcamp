package pageObject.day2;

import core.BaseCore;
import model.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.cglib.core.WeakCacheKey;

import java.util.List;

public class AddressesPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement newAddress;

    @FindBy(how = How.CLASS_NAME, using = "container")
    private List<WebElement> addresses;

    @FindBy(how = How.CLASS_NAME, using = "table")
    private List<WebElement> myAddress;

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

    public Address getAddressFirstName(Integer i) {
        Address firstName = new Address();
        WebElement address = myAddress.get(i);
        firstName.setFirstName(address.findElement(By.xpath(".//td")).getText());
        return firstName;
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
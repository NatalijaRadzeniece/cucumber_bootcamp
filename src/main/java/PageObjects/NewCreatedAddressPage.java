package PageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewCreatedAddressPage extends BaseCore {
    public NewCreatedAddressPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//div[contains (text(),'Address was successfully created.')]")
    private WebElement addressMessage;

    public String GetAddressMessage() {
        String text = addressMessage.getText();
        return text;
    }
    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
    private WebElement listLink;

    public void ClickList(){
       listLink.click();
    }
}

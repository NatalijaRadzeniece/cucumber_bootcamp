package pageObject.day2;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SpecAddressPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement verifyMessage;

    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
    private WebElement listButton;

    public SpecAddressPage(WebDriver driver) {
        super(driver);
    }

    public String getVerifyMessage(){
        waitElementAppeared(verifyMessage);
        return verifyMessage.getText();
    }

    public void clickListButton(){
        listButton.click();
    }
}

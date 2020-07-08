package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PractiseSecondScenarioPage extends BaseFunc {

    @FindBy(how = How.CSS, using = "[id='sign-in']")
    private WebElement pressSignIn;

    @FindBy(how = How.CSS, using = "[id='session_email']")
    private WebElement addEmail;

    @FindBy(how = How.CSS, using = "[id='session_password']")
    private WebElement addPassword;

    @FindBy(how = How.CSS, using = "[class='btn btn-primary']")
    private WebElement clickSignIn;

    @FindBy(how = How.XPATH, using = "//a[@data-test='addresses']")
    private WebElement clickAddresses;

    @FindBy(how = How.CSS, using = "[class='row justify-content-center']")
    private WebElement clickNewAddress;

    @FindBy(how = How.CSS, using = "[class='btn btn-primary']")
    private WebElement createAdress;

    @FindBy(how = How.CSS, using = "[class='alert alert-notice']")
    private WebElement messageAppeared;

    @FindBy(how = How.CSS, using = "[data-test='list']")
    private WebElement clickList;

    public PractiseSecondScenarioPage(WebDriver driver) {
        super(driver);
    }

    public void clickToSignIn() {
        pressSignIn.click();
    }

    public void setEmail(String email) {
        addEmail.sendKeys(email);
    }

    public void setPass(String password) {
        addPassword.sendKeys(password);
    }

    public void pressSignIn() {
        clickSignIn.click();
    }

    public void pressSAddresses() {
        clickAddresses.click();
    }

    public void pressNewAddress() {
        clickNewAddress.click();
    }

    public void pressCreateAddress() {
        createAdress.click();
    }

    public String getMessageAppeared() {
        return messageAppeared.getText();
    }

    public void pressListButton() {
        clickList.click();
    }

}

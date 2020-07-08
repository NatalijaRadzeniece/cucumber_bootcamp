package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PractiseThirdScenarioPage extends BaseFunc {


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

    @FindBy(how = How.XPATH, using = "//a[contains(@data-test,'destroy')]")
    private List<WebElement> destroy;

    @FindBy(how = How.CSS, using = "[class='alert alert-notice']")
    private WebElement messageAppears;

    public PractiseThirdScenarioPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignIn() {
        pressSignIn.click();
    }

    public void setYourEmail(String email) {
        addEmail.sendKeys(email);
    }

    public void setYourPass(String password) {
        addPassword.sendKeys(password);
    }

    public void pressToSignIn() {
        clickSignIn.click();
    }

    public void pressAddresses() {
        clickAddresses.click();
    }

    public void destroyOneAdress(int i){
        destroy.get(i).click();
    }
    public String assertMessageAppers() {
        return messageAppears.getText();
    }





}

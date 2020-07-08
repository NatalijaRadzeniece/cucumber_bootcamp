package pageObjects;

import core.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddUserPage extends BaseCore {

    @FindBy(how = How.NAME, using = "username")
    private WebDriver userName;

    @FindBy(how = How.NAME, using = "password")
    private WebDriver password;

    @FindBy(how = How.NAME, using = "FormsButton2")
    private WebElement saveButton;

    @FindBy(how = How.TAG_NAME, using = "//blockquote/b")
    private List<WebElement> quoteList;

    @FindBy(how = How.XPATH, using = "//b[contains(text(), 'ogin')]")
    private WebDriver loginMessage;

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String username) {
        username.sendKeys(username);

    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String collectData() {
        WebElement details = null;
        details = quoteList.get(0).findElement(By.xpath("./.."));
        return details.getText();
    }

    public String getLoginMessage() {
        return loginMessage.getText();

    }
}



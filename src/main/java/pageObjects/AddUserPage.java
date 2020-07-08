package pageObjects;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddUserPage extends BaseFunc {
    @FindBy(how = How.NAME, using = "username")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "FormsButton2")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//blockquote//b")
    private List<WebElement> quoteList;

    @FindBy(how = How.XPATH, using = "//b[contains(text(), 'login')]")
    private WebElement loginMessage;

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String username) {
        userName.sendKeys(username);
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
     public String getLoginMessage(){
        return loginMessage.getText();
     }

}




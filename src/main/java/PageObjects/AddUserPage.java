package PageObjects;

import Core.BaseFunc;
import org.openqa.selenium.Alert;
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

    @FindBy(how = How.NAME, using = "formsButton2")
    private WebElement saveButton;

    @FindBy(how = How.TAG_NAME, using = "//blockquote//b")
    private List<WebElement> quoteList;

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setUsername (String username){
        userName.sendKeys(username);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String collectData(){
        WebElement details = null;
        details = quoteList.get(0).findElement(By.xpath("./.."));
        return details.getText();
        }

    }


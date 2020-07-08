package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EODHomePage extends BaseCore {

    @FindBy(how = How.XPATH,using = "//a[@id='sign-in']")
    private WebElement signInOnHomepage;

    public EODHomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInOnHomePage(){
        signInOnHomepage.click();
    }
}

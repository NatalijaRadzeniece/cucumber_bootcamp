package pageObject.extras;

import core.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AsosWomenPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//span[text()='Shoes']")
    private WebElement shoesField;

    @FindBy(how = How.XPATH, using = "//a[text()='Loafers']")
    private WebElement loafersField;

    public AsosWomenPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoafers() {
        waitElementAppeared(shoesField);
        shoesField.click();
    }

    public void clickOnLoafers2() {
        loafersField.click();
    }

}

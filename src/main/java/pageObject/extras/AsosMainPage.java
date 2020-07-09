package pageObject.extras;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AsosMainPage extends BaseCore {

    @FindBy(how = How.XPATH, using = "//a[@class='TO7hyVB _3B0kHbC _3AH1eDT']")
    private WebElement womenButton;

    public AsosMainPage(WebDriver driver) {
        super(driver);
    }

    public void clickWomenButton(){
        womenButton.click();
    }

}

package pageObject.EODpages;

import core.BaseFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddressesPage extends BaseFunc {

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement newAddressLink;

    @FindBy(how = How.NAME, using = "commit")
    public WebElement createAddButton;

    @FindBy(how = How.XPATH, using = "//a[@data-test='list']")
    private WebElement listLink;

    @FindBy(how = How.TAG_NAME, using = "//tbody")
    public WebElement addressesBody;

    @FindBy(how = How.XPATH, using = "//a[contains(@data-test,'destroy')]")
    public List<WebElement> destroyButtons;

    public AddressesPage(WebDriver driver) {
        super(driver);
    }

    public void clickNewAddressLink(){
        newAddressLink.click();
    }

    public void clickCreateAddButton(){
        createAddButton.click();
    }

    public void clickListLink(){
        listLink.click();
    }

    public void clickDestroyButton(int i){
        destroyButtons.get(i).click();
    }
}

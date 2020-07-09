package pageObjects;

import core.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class EODAddressesPage extends BaseCore {

    public EODAddressesPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> columnsOfRow;
    private String fName;
    private String lName;
    private String city;

    @FindBy(how = How.XPATH, using = "/html/body/div/a")
    private WebElement newAddressLink;

    @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr/td[7]/a")
    private WebElement destroyButton;

    public void clickNewAddressLink(){
        waitForElementAppeared(newAddressLink);
        newAddressLink.click();
    }

    public void clickDestroyButton(){
        waitForElementAppeared(destroyButton);
        destroyButton.click();
        acceptAlert();
    }


}

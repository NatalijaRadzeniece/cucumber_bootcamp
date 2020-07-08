package pageObjects;

import core.BaseCore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAddresPage extends BaseCore {
    public NewAddresPage(WebDriver driver) {
        super(driver);
    }

    String path = System.getProperty("user.dir") + "\\src\\test\\resources\\magic.jpg";

    @FindBy(how = How.CSS, using = "[value='Create Address']")
    private WebElement createAddressReadyBtn;

    public void clickCreateAddressReadyBtn() {
        createAddressReadyBtn.click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/div/table/tbody/tr[1]/td[7]/a")
    private WebElement destroyAddressReadyBtn;

    public void clickDestroyAddressReadyBtn() {
        destroyAddressReadyBtn.click();
    }

    @FindBy(how = How.ID, using = "address_country_canada")
    private WebElement radioCanadaBtn;

    public void clickRadioBtn() {
        radioCanadaBtn.click();
    }

    @FindBy(how = How.CSS, using = "[type='file']")
    private WebElement fileInput;

    public void sendFile() {
        fileInput.sendKeys(path);


    }


}

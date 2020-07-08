package pageObjects.FinalTaskPage;

import core.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddressesListPage extends BaseFunc {
    public AddressesListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//a[@data-test='create']")
    private WebElement newAddressField;

    @FindBy(how = How.XPATH, using = "//table[@class='table']/tbody//td[1]")
    private List<WebElement> firstNameElementsFields;

    @FindBy(how = How.XPATH, using = "//table[@class='table']/tbody//td[2]")
    private List<WebElement> lastNameElementsFields;

    @FindBy(how = How.XPATH, using = "//table[@class='table']/tbody//td[3]")
    private List<WebElement> cityElementsFields;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-notice']")
    private WebElement confirmationMessage;

    public void openNewAddressForm() {
        newAddressField.click();
    }

    public Boolean rowExistenceCheckByNameAndSurname(String name, String surname, String city) {
        Boolean result = false;
        for (int i = 0; i < firstNameElementsFields.size(); i++) {
            if (firstNameElementsFields.get(i).getText().equals(name) && lastNameElementsFields.get(i).getText().equals(surname) && cityElementsFields.get(i).getText().equals(city)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void deleteRow(String surname) {
        getDriver().findElement(By.xpath("//table[@class='table']/tbody//td[text()='" + surname + "']/following-sibling::td/a[@data-method='delete']")).click();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;



public class SigninSteps2 {
    private WebDriver driver;
    public SigninSteps2() {
        this.driver = Hooks.driver;

    }

    @Given("Open 'Enter Number' page")
    public void open_page() {
        driver.get("http://a.testaddressbook.com/");
    }

    @When("click sign in")
    public void clickSignIn() {driver.findElement(By.cssSelector("a[id='sign-in']")).click();
    }

    @When("click sign up")
    public void clickSignUp() {driver.findElement(By.cssSelector("a[data-test='sign-up']")).click();
    }

    @And("add {string} address")
    public void addEMailAddressAndPassword(String eMail){
        driver.findElement(By.cssSelector("//input[@type='text']")).sendKeys(eMail);
    }
    @And("add {string}")
    public void addEMailAddressAndPassword2(String password){
        driver.findElement(By.cssSelector("//input[@type='text']")).sendKeys(password);
    }

    @And("click {string}")
    public void clickAddress() {driver.findElement(By.cssSelector("a[class=\"row justify-content-center\"]")).click();
    }

    @And("populate all fields in form")
    public void populateAllFieldsInForm() {
    }

    @And("click button crate address")
    public void clickButtonCrateAddress() {driver.findElement(By.cssSelector("input[name=\"commit\"]")).click();
    }

    @And("verify if {string} appeared")
    public void verifyIfAddressWasSuccessfullyCreatedAppeared() {
    }

    @And("click List")
    public void clickList() {driver.findElement(By.cssSelector("a[data-test=\"list\"]")).click();
    }

    @And("verify Address on page")
    public void verifyAddressOnPage() {
    }

    @Then("Sign out")
    public void signOut() {driver.findElement(By.cssSelector("a[a[data-method=\"delete\"]")).click();
    }

    @And("click Addresses")
    public void clickAddresses() {driver.findElement(By.cssSelector("a[data-test=\"addresses\"]")).click();
    }

    @And("click destroy address")
    public void clickDestroyAddress() {driver.findElement(By.cssSelector("a[data-confirm=\"Are you sure?\"]")).click();
    }

    @And("verify address removed")
    public void verifyAddressRemoved() {
    }
}

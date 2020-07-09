package stepDefinitions.extras;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import pageObject.extras.AsosMainPage;
import pageObject.extras.AsosWomenPage;
import pageObject.extras.ShoesPage;
import stepDefinitions.hooks.Hooks;

public class AsosTestSteps {
    private WebDriver driver;
    private AsosMainPage asosMainPage;
    private AsosWomenPage asosWomenPage;
    private ShoesPage shoesPage;

    public AsosTestSteps() {
        driver = Hooks.driver;
    }

    @Given("I navigate to Asos homepage")
    public void on_test_address_page() {
        driver.get("https://www.asos.com/");
    }

    @When("I click on Women")
    public void click_woman() {
        asosMainPage = new AsosMainPage(driver);
        asosMainPage.clickWomenButton();
    }

    @And("I navigate to Shoes")
    public void navigate_click_loafer() {
        asosWomenPage = new AsosWomenPage(driver);
        asosWomenPage.clickOnLoafers();
    }

    @And("I click on Loafer")
    public void click_on_loafers() {
        asosWomenPage.clickOnLoafers2();
    }

    //@And("I add leather filter{string}")

    @And("I select leather filter")
//    public void set_leather_filter(String leather){
//        shoesPage = new ShoesPage(driver);
//        shoesPage.clickLeatherFilter();
    public void select_leather_filter() {
        shoesPage = new ShoesPage(driver);
        shoesPage.clickLeatherFilter();
        shoesPage.filterLeather();
    }


}

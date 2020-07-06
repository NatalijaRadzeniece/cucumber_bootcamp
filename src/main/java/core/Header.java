package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Header extends BaseFunc {

    public Header(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS,using = "[href='login.php']")
    private WebElement loginLink;

    public void clickLogin(){
        loginLink.click();
    }

//    public Header(WebDriver driver) {
//        super(driver);
//    }
//    @FindBy(how = How.CSS,using = "[href='login.php']")
//    private WebElement i_click_sign_in;
//
//    public void clickSignIn(){
//        i_click_sign_in.click();
    }


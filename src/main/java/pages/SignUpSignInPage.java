package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpSignInPage extends BasePage {


    public SignUpSignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='sc-edoYdd cZhezb']")
    WebElement buttonSignIn;

    @FindBy(xpath = "//div[.='Sign up']")
    WebElement buttonSignUp;

    @FindBy(xpath = "//div[.='Submit']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//div[.='Cancel']")
    WebElement buttonCancel;
    @FindBy(xpath = "//input[@placeholder='Peter']")
    WebElement name;
    @FindBy(xpath = "//input[@placeholder='peter@gmail.com']")
    WebElement email;
    @FindBy(xpath = "")
    WebElement password;
    @FindBy(xpath = "")
    WebElement confirmPassword;

}

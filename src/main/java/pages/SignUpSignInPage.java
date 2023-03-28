package pages;

import models.AuthorModel;
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
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "(//input[@type='password'])[2]")
    WebElement confirmPassword;
    @FindBy(xpath = "//div[contains(@class,'sc-hYAvtR exMbkk')]")
    WebElement errorMessage;


    public SignUpSignInPage clickButtonSignIn() {
        buttonSignIn.click();
        return this;

    }

    public SignUpSignInPage fillLoginForm(AuthorModel author) {
        type(email, author.getEmail());
        type(password, author.getPassword());
        return this;
    }

    public HomePage clickButtonSubmit() {
        buttonSubmit.click();
        return new HomePage(driver);
    }

    public SignUpSignInPage clickButtonSubmitNegative() {
        buttonSubmit.click();
        return new SignUpSignInPage(driver);
    }

    public SignUpSignInPage clickButtonSignUp() {
        buttonSignUp.click();
        return this;
    }

    public SignUpSignInPage fillRegistrationForm(AuthorModel author) {
        type(name, author.getName());
        type(email, author.getEmail());
        type(password, author.getPassword());
        type(confirmPassword, author.getConfirm_password());
        return this;
    }

    public boolean isUnlogged() {
        buttonSubmit.isDisplayed();
        return true;
    }

    public boolean isErrorMessageTest(String message) {
        //  should(errorMessage, 5);
        errorMessage.getText().equals(message);
        return true;
    }

    public StartPage clickCancel() {
        buttonCancel.click();
        return new StartPage(driver);
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    public StartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[text()='Sign in']")
    WebElement buttonSinIn;

    @FindBy(xpath ="//div[text()='Sign in']")
    WebElement buttonILostMyPet;

    @FindBy(xpath ="//span[.='I found a pet!']")
    WebElement buttonIFoundPet;

    @FindBy(xpath ="//span[.='join']")
    WebElement buttonJoin;

    public SignUpSignInPage openSingUpSingInPageFirstWay() {
        buttonSinIn.click();
        return new SignUpSignInPage(driver);
    }


    public SignUpSignInPage openSingUpSingInPageSecondWay() {
      buttonJoin.click();
      return  new SignUpSignInPage(driver);
    }


}


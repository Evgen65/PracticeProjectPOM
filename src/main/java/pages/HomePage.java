package pages;

import models.AuthorModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//div[text()='Logout']")
    WebElement logOutButton;
    @FindBy(xpath = "//div[contains(@style,'margin-left: 12vw; display: flex; align-items: center;')]")
    WebElement userNameButton;


    public boolean isLoginImplemented() {
        return shouldHave(logOutButton,"Logout",10);
    }

    public boolean isUserRegistered(AuthorModel author) {

     return userNameButton.getText().equals(author.getName());
    }

    public HomePage clickLogOut() {
        logOutButton.click();
        return this;
    }
}

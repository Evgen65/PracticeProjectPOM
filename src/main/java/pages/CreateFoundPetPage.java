package pages;

import models.AuthorModel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class CreateFoundPetPage extends HomePage {
    public CreateFoundPetPage(WebDriver driver) {
        super(driver);
    }


    public CreateFoundPetPage fillFoundPetForm() {
        return this;
    }

    public CreateFoundPetPage uploadForm() {
        return this;
    }

    public CreateFoundPetPage fillContactForm() {
        return this;
    }
}

package pages;

import models.Contact;
import models.PetDescription;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateFoundPetPage extends BasePage {


    public CreateFoundPetPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Add']")
    WebElement buttonAdd;
    @FindBy(xpath = "//input[@id='pet-image']")
    WebElement buttonBrowse;
    @FindBy(xpath = "//div[text()='Publish']")
    WebElement buttonPublish;
    @FindBy(xpath = "//input[@placeholder='Dog']")
    WebElement type;
    @FindBy(xpath = "//input[@placeholder='Male']")
    WebElement sex;
    @FindBy(xpath = "//input[@placeholder='Golden Retriever']")
    WebElement breed;
    @FindBy(xpath = "//input[@placeholder='Beige']")
    WebElement color;
    @FindBy(xpath ="//input[@placeholder='30-55']")
    WebElement height;
    @FindBy(xpath = "//textarea[@placeholder='blue collar with stars, no left ear, damaged tail.']")
    WebElement distinctive_features;
    @FindBy(xpath = "//input[@style='width: 65%;']")
    WebElement description;
    @FindBy(xpath = "//textarea[@placeholder='Florentin Street, Tel Aviv']")
    WebElement location;
    @FindBy(xpath = "//input[@placeholder='Phone*']")
    WebElement phone;
    @FindBy(xpath = "//input[@placeholder='Email']")
    WebElement email;
    @FindBy(xpath = "//input[@placeholder='Facebook profile']")
    WebElement fasebookAccaunt;


    public CreateFoundPetPage fillFoundPetForm(PetDescription pets) {
        type(type, pets.getType());
        type(sex,pets.getSex());
        type(breed, pets.getBreed());
        type(color, pets.getColor());
        type(height, pets.getHeight());
        type(distinctive_features, pets.getDistinctive_features());
        fillDescription(pets.getDescription());
        type(location, pets.getLocation());



        return this;
    }

    private void fillDescription(String description) {
        this.description.sendKeys(description);
        buttonAdd.click();

    }

    public CreateFoundPetPage fillContactForm(Contact contact) {
        type(phone,contact.phone);
        type(email, contact.email);
        type(fasebookAccaunt, contact.fasebookAccaunt);
        return this;
    }

    public CreateFoundPetPage uploadPhoto(String s) {
        return this;
    }

    public HomePage clickButtonPublish() {
        return new HomePage(driver);
    }
}

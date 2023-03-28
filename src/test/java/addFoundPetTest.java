import models.AuthorModel;
import models.Contact;
import models.PetDescription;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateFoundPetPage;
import pages.HomePage;
import pages.StartPage;

public class addFoundPetTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignIn()
                .fillLoginForm(AuthorModel.builder()
                        .email("abcd@mail.com")
                        .password("Abcd1234$")
                        .build())
                .clickButtonSubmit();
    }

    @Test
    public void addFoundPetTest() {
        PetDescription pets = PetDescription.builder()
                .type("Cat")
                .sex("Male")
                .breed("British")
                .color("Gray")
                .height("30")
                .distinctive_features("damaged tail")
                .description("A  little  stupid  empty")
                .location("Tel Aviv")
                .build();
        new HomePage(driver)
                .openCreateFoundPage();
        new CreateFoundPetPage(driver)
                .fillFoundPetForm(pets)
                .uploadPhoto("C:\\repositoris\\PracticeProjectPOM\\src\\test\\resources\\unnamed.png")
                .fillContactForm(Contact.builder()
                        .phone("972-515-51-78")
                        .email("abcd@mail.com")
                        .fasebookAccaunt("facebook")
                        .build())
                        .clickButtonPublish();
    }


}

import models.AuthorModel;
import org.openqa.selenium.WebDriver;
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
                        .password("Abcd1234S")
                        .build())
                .clickButtonSubmit();
    }
    @Test
    public void addFoundPetTest(){
        new HomePage(driver)
                .openCreateFoundPage();
                new CreateFoundPetPage(driver)
                        .fillFoundPetForm()
                        .uploadForm()
                        .fillContactForm();
    }


}

import models.AuthorModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpSignInPage;
import pages.StartPage;

public class RegistrationTest extends TestBase {
    @Test
    public void registrationSuccessTest() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        AuthorModel author = AuthorModel.builder()
                .name("Vasia" + "i")
                .email("abcd" + i + "@mail.com")
                .password("Abcd1234$")
                .confirm_password("Abcd1234$")
                .build();
        new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignUp()
                .fillRegistrationForm(author)
                .clickButtonSubmit()
                .isUserRegistered(author);
    }

    @Test
    public void registrationNegativeTestUserExist() {
        AuthorModel author = AuthorModel.builder()
                .name("Gilad")
                .email("abcd@mail.com")
                .password("Abcd1234$")
                .confirm_password("Abcd1234$")
                .build();
        Assert.assertTrue(new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignUp()
                .fillRegistrationForm(author)
                .clickButtonSubmitNegative()
                .isErrorMessageTest("User with this email already exists"));
        new SignUpSignInPage(driver)
                .clickCancel();

    }

    @Test
    public void registrationSuccessTestSecondWay() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        AuthorModel author = AuthorModel.builder()
                .name("Vasia" + "i")
                .email("abcd" + i + "@mail.com")
                .password("Abcd1234$")
                .confirm_password("Abcd1234$")
                .build();
        new StartPage(driver)
                .openSingUpSingInPageSecondWay()
                .clickButtonSignUp()
                .fillRegistrationForm(author)
                .clickButtonSubmit()
                .isUserRegistered(author);
    }

    @Test
    public void registrationNegativeTestIncorrectPass() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        AuthorModel author = AuthorModel.builder()
                .name("Gilad" + i)
                .email("abcd" + i + "@mail.com")
                .password("Abcd1234")
                .confirm_password("Abcd1234")
                .build();
       Assert.assertTrue( new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignUp()
                .fillRegistrationForm(author)
                .clickButtonSubmitNegative()
                .isErrorMessageTest("Error"));
        new HomePage(driver)
                .clickLogOut();
    }

    @Test
    public void registrationNegativeTestIncorrectEmail() {
        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        AuthorModel author = AuthorModel.builder()
                .name("Gilad" + i)
                .email("abcd" + i + "mail.com")
                .password("Abcd1234$")
                .confirm_password("Abcd1234$")
                .build();
        new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignUp()
                .fillRegistrationForm(author)
                .clickButtonSubmitNegative()
                . isErrorMessageTest("Email not valid");
        new SignUpSignInPage(driver)
                .clickCancel();
    }
}
import models.AuthorModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StartPage;

public class LoginTest extends TestBase {
    @Test
    public void loginPositiveTest() {
        Assert.assertTrue( new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignIn()
                .fillLoginForm(AuthorModel.builder()
                        .email("abcd@mail.com")
                        .password("Abcd1234$")
                        .build())
                .clickButtonSubmit()
                .isLoginImplemented());
    }
   @Test
    public void loginNegativeTest() {
        Assert.assertTrue( new StartPage(driver)
                .openSingUpSingInPageFirstWay()
                .clickButtonSignIn()
                .fillLoginForm(AuthorModel.builder()
                        .email("abcc@mail.com")
                        .password("Abcd1234$")
                        .build())
                .clickButtonSubmitNegative()
                .isUnlogged());
    }
    @Test
    public void loginPositiveTestSecondWay() {
        Assert.assertTrue( new StartPage(driver)
                .openSingUpSingInPageSecondWay()
                .clickButtonSignIn()
                .fillLoginForm(AuthorModel.builder()
                        .email("abcd@mail.com")
                        .password("Abcd1234$")
                        .build())
                .clickButtonSubmit()
                .isLoginImplemented());
    }

}


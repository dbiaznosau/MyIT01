import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends WebDriverSettings {

        @Test
        @Description("Test that user can login")
        public void login() {
            loginPage.inputLogin(ConfProperties.getProperty("login"));
            loginPage.clickNextButtonLogin();
            loginPage.inputPassword(ConfProperties.getProperty("password"));
            loginPage.clickNextButtonPassword();
            mailbox.userMenuClick();
            Assert.assertEquals("assertion", ConfProperties.getProperty("login").toLowerCase(), mailbox.userInfoEmail().toLowerCase());}

}

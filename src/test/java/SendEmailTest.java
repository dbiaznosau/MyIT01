import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;

public class SendEmailTest extends WebDriverSettings {

        @Test
        @Description("Test that user can login")
        public void login() {
            loginPage.inputLogin(ConfProperties.getProperty("login"));
            loginPage.clickNextButtonLogin();
            loginPage.inputPassword(ConfProperties.getProperty("password"));
            loginPage.clickNextButtonPassword();
            mailbox.userMenuClick();
            Assert.assertEquals("assertion", ConfProperties.getProperty("login").toLowerCase(), mailbox.userInfoEmail().toLowerCase());}

        @Test
        @Description("Create and send new email")
        public void sendEmail(){
        mailbox.newEmailButtonClick();
        mailbox.addSendTo();
        mailbox.clickCCbutton();
        mailbox.addCC();
        mailbox.addSummary();
        mailbox.addMessageBody();
        mailbox.sendButtonClick();
        mailbox.sentMailsButtonClick();}

}

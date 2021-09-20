import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendEmailTest extends WebDriverSettings {
        @Test
        @Description("Create and send new email")
        public void sendEmail() {
                loginPage.inputLogin(ConfProperties.getProperty("login"));
                loginPage.clickNextButtonLogin();
                loginPage.inputPassword(ConfProperties.getProperty("password"));
                loginPage.clickNextButtonPassword();
                mailbox.newEmailButtonClick();
                mailbox.addSendTo();
                mailbox.clickCCbutton();
                mailbox.addCC();
                mailbox.addSubject();
                mailbox.addMessageBody();
                mailbox.sendButtonClick();
                mailbox.sentMailsButtonClick();
                new WebDriverWait(driver, 5); //wait for debugging, will be removed later
                Assert.assertTrue(mailbox.pageHeaderText().contains("Отправленные"));


        }
}
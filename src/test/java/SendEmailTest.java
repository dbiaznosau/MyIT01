import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class SendEmailTest {
    public static WebDriver driver;
    LoginPage loginPage = new LoginPage(driver);
    Mailbox mailbox = new Mailbox(driver);
//initial setup
    @BeforeClass

    public static void setup() {
        //create a copy of a webdriver
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //set implicity wait to 10 sec
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //get login url
        driver.get(ConfProperties.getProperty("loginurl"));

    }
        @Test
        /*@Description ("Test that user can login")*/
        public void login(){
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.clickNextButtonLogin();
        loginPage.inputPassword(ConfProperties.getProperty("password"));
        loginPage.clickNextButtonPassword();
        mailbox.userMenuClick();
        Assert.assertEquals("assertion", ConfProperties.getProperty("login").toLowerCase(), mailbox.userInfoEmail().toLowerCase());
/*
        @Test
        public void sendEmail(){
        //add a test code here
            }

 */
    }
    @AfterClass
    public static void tearDown () {
        driver.quit();
           }
}

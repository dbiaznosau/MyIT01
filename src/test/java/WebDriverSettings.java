import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettings {

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
        //set implicit wait to 10 sec
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //get login url
        driver.get(ConfProperties.getProperty("loginurl"));

    }
        @AfterClass
        public static void tearDown() {
            driver.quit();
        }

    }

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mailbox {

    //elements initialisation

    public WebDriver driver;

    public Mailbox (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;    }

        @FindBy(xpath = "//*[@class=\"gb_C gb_Ma gb_h\"]")
        private WebElement userMenuButton;

        @FindBy(xpath = "//*[@id=\"gb\"]//*[@class=\"gb_nb\"]")
        private WebElement userEmailAddress;

        public void userMenuClick() {userMenuButton.click();}

        public String userInfoEmail() {
            return userEmailAddress.getText();
            }

}

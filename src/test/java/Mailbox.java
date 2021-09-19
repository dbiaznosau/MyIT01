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

        @FindBy(xpath = "//div[@class=\"T-I T-I-KE L3\"]")
        private WebElement newEmailButton;

        @FindBy(xpath = "//*[@id=\":9f\"]")
        private WebElement toTextbox;

        @FindBy(xpath = "//*[@id=\":a2\"]")
        private WebElement ccButton;

        @FindBy(xpath = "//*[@id=\":6u\"]")
        private WebElement ccTextbox;

        @FindBy(xpath = "//*[@id=\":7d\"]")
        private WebElement summaryTextbox;

        @FindBy(xpath = "//*[@id=\":67\"]")
        private WebElement messageBody;

        @FindBy(xpath = "//*[@id=\":7n\"]")
        private WebElement sendButton;

        @FindBy(xpath = "//*[@id=\":4b\"]")
        private WebElement sentMailsButton;

        public void userMenuClick() {userMenuButton.click();}
        public String userInfoEmail() {
            return userEmailAddress.getText();
            }
        public void newEmailButtonClick() {newEmailButton.click();}
        public void addSendTo() {toTextbox.sendKeys(ConfProperties.getProperty("sendto"));}
        public void clickCCbutton() {ccButton.click();}
        public void addCC() {ccTextbox.sendKeys(ConfProperties.getProperty("sendtocc"));}
        public void addSummary() {summaryTextbox.sendKeys(ConfProperties.getProperty("summarytext"));}
        public void addMessageBody (){messageBody.sendKeys(ConfProperties.getProperty("emailbody"));}
        public void sendButtonClick(){sendButton.click();}
        public void sentMailsButtonClick(){sentMailsButton.click();}


}

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

        @FindBy(xpath = "//*[@name=\"to\"]")
        private WebElement toTextbox;

        @FindBy(xpath = "//*[@class=\"aB gQ pE\"]")
        private WebElement ccButton;

        @FindBy(xpath = "//*[@name=\"cc\"]")
        private WebElement ccTextbox;

        @FindBy(xpath = "//*[@name=\"subjectbox\"]")
        private WebElement subjectTextbox;

        @FindBy(xpath = "//*[@class=\"Am Al editable LW-avf tS-tW\"]")
        private WebElement messageBody;

        @FindBy(xpath = "//*[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")
        private WebElement sendButton;

        @FindBy(xpath = "//*[@class=\"J-Ke n0\"][contains(., \"Отправленные\")]")
        private WebElement sentMailsButton;

        @FindBy(xpath = "/html/head/title[text()=\"Отправленные - testautomyit@gmail.com - Gmail\"]")
        private WebElement pageHeader;

        public void userMenuClick() {userMenuButton.click();}
        public String userInfoEmail() {
            return userEmailAddress.getText();
            }
        public void newEmailButtonClick() {newEmailButton.click();}
        public void addSendTo() {toTextbox.sendKeys(ConfProperties.getProperty("sendto"));}
        public void clickCCbutton() {ccButton.click();}
        public void addCC() {ccTextbox.sendKeys(ConfProperties.getProperty("sendtocc"));}
        public void addSubject() {subjectTextbox.sendKeys(ConfProperties.getProperty("summarytext"));}
        public void addMessageBody (){messageBody.sendKeys(ConfProperties.getProperty("emailbody"));}
        public void sendButtonClick(){sendButton.click();}
        public void sentMailsButtonClick(){sentMailsButton.click();}
        public String pageHeaderText(){return pageHeader.getText();}



}

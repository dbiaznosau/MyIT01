import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //elements initialisation

    public WebDriver driver;

    public LoginPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;    }

    //elements locators
    @FindBy(xpath = "//*[@id=\"identifierId\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@name=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"identifierNext\"]")
    private WebElement nextButtonLogin;

    @FindBy(xpath = "//*[@id=\"passwordNext\"]")
    private WebElement nextButtonPassword;


    //elements actions
    public void inputLogin(String login) {
        loginField.sendKeys(login);}

    public void inputPassword (String password) {
        passwordField.sendKeys(password);}

    public void clickNextButtonLogin () {
        nextButtonLogin.click();}

    public void clickNextButtonPassword () {
        nextButtonPassword.click();}

        public String emailAddress(){
        return ConfProperties.getProperty("email");
        }

}

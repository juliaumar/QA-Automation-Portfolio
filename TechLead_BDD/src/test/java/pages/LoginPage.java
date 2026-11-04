package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='Tech Lead Academy']")
    public WebElement image;
    @FindBy(xpath = "//input[@name='pseudonym_session[unique_id]']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='pseudonym_session[password]']")
    public WebElement password;
    @FindBy(xpath = "//button[@class='Button Button--login']")
    public WebElement loginBtn;
    @FindBy(css = "#pseudonym_session_remember_me")
    public WebElement rememberMeCheckBox;
    @FindBy(xpath = "//label[@for='pseudonym_session_remember_me']")
    public WebElement rememberMeText;
    @FindBy(css = "#login_forgot_password")
    public WebElement forgotPassword;
    @FindBy(xpath = "//*[@class='root_1XRE planner-empty-state']")
    public WebElement dashboard;
    @FindBy(css = "#content")
    public WebElement forgotPasswordPage;
    @FindBy(xpath = "//p[@id='forgot_password_instructions']")
    public WebElement forgotPasswordInstructions;
    @FindBy(xpath = "//input[@id='pseudonym_session_unique_id_forgot']")
    public WebElement forgotPasswordEmail;
    @FindBy(xpath = "//input[@name='pseudonym_session[unique_id_forgot]']")
    public WebElement forgotPasswordEmailBox;
    @FindBy(xpath = "//li[@class='ic-flash-success']")
    public WebElement successMessage;
    @FindBy(xpath = "//button[normalize-space()='Request Password']")
    public WebElement requestPasswordBtn;


    ////input[@name='pseudonym_session[unique_id]']
    //pseudonym_session[password]

     }








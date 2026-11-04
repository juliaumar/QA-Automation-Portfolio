package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.LoginPage;
import utils.BrowserUtils;

import java.util.Map;

public class LoginSteps implements CommonPage {
    LoginPage page;

    public LoginSteps() {
        page = new LoginPage();

    }


    @Given("I open url of LoginPage")
    public void iOpenUrlOfLoginPage()  {
        BrowserUtils.getDriver();
    }

    @Then("I should see {string} in the title")
    public void iShouldSeeInTheTitle(String title) {
        Assert.assertEquals(title, BrowserUtils.getDriver().getTitle());
    }

    @Then("I should see the main logo on the page")
    public void iShouldSeeTheMainLogoOnThePage() {
        BrowserUtils.isDisplayed(page.image);
    }



    @And("User clicks on {string} button")
    public void userClicksOnButton(String btn) {
       BrowserUtils.click(page.loginBtn);
    }



    @When("User enters email {string} and password {string}")
    public void userEntersEmailAndPassword(String email, String password) {
        BrowserUtils.sendKeys(page.email, email);
        BrowserUtils.sendKeys(page.password, password);


    }

    @Then("User should be logged in as a student an see title {string}")
    public void userShouldBeLoggedInAsAStudentAnSeeTitle(String title) {
        Assert.assertEquals(title, BrowserUtils.getDriver().getTitle());

    }


    @And("User should see the dashboard tab")
    public void userShouldSeeTheDashboardTab() {
        BrowserUtils.isDisplayed(page.dashboard);
    }

    @When("User clicks on {string} link")
    public void userClicksOnLink(String forgotPassword) {
        BrowserUtils.click(page.forgotPassword);
    }

    @Then("User should see the {string} page")
    public void userShouldSeeThePage(String arg0) {
        BrowserUtils.isDisplayed(page.forgotPasswordPage);
    }

    @Then("User should see the text {string} on the page")
    public void userShouldSeeTheTextOnThePage(String text) {
        BrowserUtils.isDisplayed(page.forgotPasswordInstructions);
    }

    @And("User should see the {string} field")
    public void userShouldSeeTheField(String arg0) {
        BrowserUtils.isDisplayed(page.forgotPasswordEmail);
        BrowserUtils.isEnabled(page.forgotPasswordEmail);

    }




    @When("User enters email {string}")
    public void userEntersEmail(String email) {
        BrowserUtils.sendKeys(page.forgotPasswordEmailBox, email);
    }

    @Then("User should see the Password Reset Email Sent message")
    public void userShouldSeeThePasswordResetEmailSentMessage() {
        BrowserUtils.isDisplayed(page.successMessage);
    }

    @And("User clicks on Request Password button")
    public void userClicksOnRequestPasswordButton() {
        BrowserUtils.click(page.requestPasswordBtn);
    }
}




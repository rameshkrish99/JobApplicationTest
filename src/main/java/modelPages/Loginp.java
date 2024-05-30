package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;

public class Loginp extends BrowserFunctions {
    private By verifyloginpagedisplayed = By.xpath("//h3[contains(text(),'Login')]");
    private By fillemailtextbox = By.xpath("//input[@name='email']");
    private By fillpasswordtextbox = By.xpath("//input[@name='password']");
    private By submitbutton = By.xpath("//button[@type='submit']");
    private By forgetpasswordlink = By.xpath("//a[contains(text(),'Forgott')]");
    private By signupbutton = By.xpath("//button[contains(text(),'SignUp')]");
    private By showorhidepassword = By.xpath("//button[contains(@type,'button')]");
    private By invalidcred = By.xpath("//h5");


    public void verifyLoginPageDiaplsyed() {
        verifyElementDisplayed(verifyloginpagedisplayed, "loginpage displayed");
        ExtentTestManager.setPassMessageInReport("loginpage displayed");
    }

    public void clickSignUpButton() {
        click(signupbutton, "clicked signup button");
    }

    public void fillEmailText(String email) {
        enterText(fillemailtextbox, email, "email text box");
    }

    public void fillPasswordText(String password) {
        enterText(fillpasswordtextbox, password, "Password text field");
    }

    public void clickSibmitbutton() {
        click(submitbutton, "clicked on submit button");
    }

    public void clickForgetPasswordLinktext() {
        click(forgetpasswordlink, "clicked on forget password link text");
    }

    public void clickShowPasswordIcon() {
        click(showorhidepassword, "show password icon");
    }

    public void getErrrText() {
        ExtentTestManager.setFailMessageInReport(getText(invalidcred, "invalid credentials"));
    }

    public void navigateToUrl(String url) {
        openNewTabWithURL(url);
    }


}

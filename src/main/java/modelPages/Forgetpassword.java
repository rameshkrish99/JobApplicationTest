package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Forgetpassword extends BrowserFunctions {
    By verifyforgetpasswordpage = By.xpath("//h4");
    By emailtext = By.xpath("//input[@type='email']");
    By mobiletext = By.xpath("//input[@type='text']");
    By submitbutton = By.xpath("//button[text()='Submit']");
    By gobacklinktext = By.xpath("//a[text()='Go Back']");
    By invalidcredets = By.xpath("//h1[contains(text(),'Invalid ')]");
    By verifyotpage = By.xpath("//h2[contains(text(),'Enter Your  OTP ')]");
    By verifyinvalidotp = By.xpath("//h1");
    By verifychangepasswordpagedisplayed = By.xpath("//h4[contains(text(),'Change')]");
    By newpasswordtext = By.id("password");
    By cnfirmnewpassword = By.id("cnpassword");
    By submitnewpassword = By.xpath("//button[@type='submit']");
    By showpasswords = By.xpath("//button[@type='button']");
    By invalidcreds = By.xpath("//h5");
    By errormessages = By.xpath("//p[@class='text-danger']");
    By passwordchangesucessfullypage = By.xpath("//div[contains(text(),'Your Password Chan')]");
    By gotologin = By.xpath("//button[contains(text(),'Go to L')]");


    public void verifyForgetPasswordPageDisplayed() {
        verifyElementDisplayed(verifyforgetpasswordpage, "Forget Password Page displayed");
        getText(verifyforgetpasswordpage, "verify frrgetpasswordpage");
    }

    public void enterEmail(String email) {
        enterText(emailtext, email, "Email entered");
    }

    public void enterMobileNumber(String mob) {
        enterText(mobiletext, mob, "mobile number entered");
    }

    public void getinvalidCreds() {
        ExtentTestManager.setFailMessageInReport(getText(invalidcreds, "text displayed"));
    }

    public void getTextIfInvalidDetails() {
        verifyElementDisplayed(invalidcredets, "verifed");
        // getText(invalidcredets,"displayed text");
        ExtentTestManager.setPassMessageInReport(getText(invalidcredets, "pagename"));
    }

    public void ifOtpIsInvalid() {
        ExtentTestManager.setFailMessageInReport(getText(verifyinvalidotp, "invalid otp"));
    }

    public void verifyOtpPageDisplayed() {
        verifyElementDisplayed(verifyotpage, "verified otp page displayed");
        // getText(verifyotpage,"pagename");
        ExtentTestManager.setPassMessageInReport(getText(verifyotpage, "pagename"));
    }

    public void verifyChangePasswordPageDisplayed() {
        verifyElementDisabled(verifychangepasswordpagedisplayed, "change password page displayed");
        ExtentTestManager.setPassMessageInReport(getText(verifychangepasswordpagedisplayed, "page name"));
    }

    public void fillNewPassword(String newpssword) {
        enterText(newpasswordtext, newpssword, "new password entered");
    }

    public void fillConfirmpassword(String cnfirmpassword) {
        enterText(cnfirmnewpassword, cnfirmpassword, "cnfirm password entered");
    }

    public void showPasswords() {
        click(showpasswords, "clicked on show password icon");
    }

    public void verifyPasswordChangedSucessfullyPage() {
        verifyElementDisplayed(passwordchangesucessfullypage, "page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(passwordchangesucessfullypage, "page text"));
    }


    public void clickSubmitButton() {
        click(submitbutton, "clicked on submit button");
    }

    public void getErrorMessageInText() {
        List<WebElement> names = getElementsList(errormessages, "displayed");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setFailMessageInReport("error message as :" + name);
        }

    }

    public void goToLogin() {
        click(gotologin, "clicked go to login button");
    }

    public void clickGoBackLinkText() {
        click(gobacklinktext, "clicked on go back");
    }

}

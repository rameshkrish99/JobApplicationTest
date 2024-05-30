package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Registrationpage extends BrowserFunctions {

    private By verifysignuppagedisplayed = By.xpath("//h3[contains(text(),'Sign Up')]");
    private By empId = By.name("id");
    private By emailtextbox = By.xpath("//input[@name='email']");
    private By nametextbox = By.xpath("//input[@name='ename']");
    private By mobilenumber = By.xpath("//input[@name='mob']");
    private By passwordtextbox = By.xpath("//input[@name='password']");
    private By showpasswordicon = By.xpath("//input[@name='password']/../button");
    private By confirmpassword = By.xpath("//input[@name='cnpassword']");
    private By showcnfpasswrdicon = By.xpath("//input[@name='cnpassword']/../button");
    private By submitbutton = By.xpath("//button[@type='submit']");
    private By invalidreg = By.xpath("//div[@class='invalid-feedback']");
    private By verifyotppagedisplayed = By.xpath("//h2");
    private By verifypreviewpagedispayed = By.xpath("//h3");
    private By detailsinpreviewpage = By.xpath("//tr/td");
    private By confirminpreviewpage = By.xpath("//button[contains(text(),'Con')]");
    private By logintextincondetionspage = By.xpath("//div/a[contains(text(),'Login')]");
    private By loginifyouhaveacount = By.xpath("//a[contains(text(),'Login')]");
    private By gpbacktext = By.xpath("//a[contains(text(),'Go')]");

    public void getInvalidText() {
        List<WebElement> names = getElementsList(invalidreg, "elements");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setFailMessageInReport("invalid :" + name);
        }
    }

    public void verifySignUpPAgeDisplayed() {
        verifyElementDisplayed(verifysignuppagedisplayed, "signuppage displayed");
        ExtentTestManager.setPassMessageInReport("signuppagedisplayed");
    }

    public void fillEmpId(String id) {
        enterText(empId, id, "empid entered");
    }

    public void fillEmailText(String email) {
        enterText(emailtextbox, email, "email text");
    }

    public void fillNameText(String name) {
        enterText(nametextbox, name, "name text field");
    }

    public void fillPasswordText(String password) {
        enterText(passwordtextbox, password, "password text");
    }

    public void clickShowPasswordIcon() {
        click(showpasswordicon, "clicked on show password icon");
    }

    public void fillMobileNumberText(String mobile) {
        enterText(mobilenumber, mobile, "mobile text field");
    }

    public void fillCnfirmPassword(String cnpassword) {
        enterText(confirmpassword, cnpassword, "confirm password");
    }

    public void clickShowCnfirmpasswordicon() {
        click(showcnfpasswrdicon, "clicked on confirm password icon");
    }

    public void verifyOtpPgaeDisplayed() {
        verifyElementDisplayed(verifyotppagedisplayed, "page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(verifyotppagedisplayed, "page text"));
    }

    public void verifyPreviewPageDisplayed() {
        verifyElementDisplayed(verifypreviewpagedispayed, "page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(verifypreviewpagedispayed, "page text"));

    }

    public void confirmInPreviewPage() {
        click(confirminpreviewpage, "clicked confirm in preview page");
    }

    public void getDetailsInPreviewPage() {
        ExtentTestManager.setInfoMessageInReport(getText(detailsinpreviewpage, "details"));
    }

    public void clickLoginTextInConditionsPage() {
        click(logintextincondetionspage, "clicked on logintext");
    }

    public void clickIfYouHaveAccount() {
        click(loginifyouhaveacount, "cicked on if yo have account");
    }

    public void clickGoback() {
        click(gpbacktext, "clicked on go back");
    }

    public void clickSubmit() {
        click(submitbutton, "clicked on submit button");

    }


}

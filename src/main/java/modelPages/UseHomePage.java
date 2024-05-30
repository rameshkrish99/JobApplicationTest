package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.browser.Browser;

public class UseHomePage extends BrowserFunctions {


    By verifyuserwelcomepage = By.xpath("//h1");
    By newapplication = By.xpath("//button[contains(text(),'New')]");
    By viewapplication = By.xpath("//button[contains(text(),'View')]");

    By profileicon = By.xpath("//div/*[local-name()='svg']");

    public void verifyUserWelcomPageDisplayed() {
        verifyElementDisplayed(verifyuserwelcomepage, "page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(verifyuserwelcomepage, "page name "));
    }

    public void newApplicationButton() {
        click(newapplication, "clicked on new application");
    }

    public void viewApplicationButton() {
        click(viewapplication, "clicke don view application");
    }

    public void profileIcon() {
        click(profileicon, "clicked on profie icon");
    }


}

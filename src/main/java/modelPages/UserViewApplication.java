package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserViewApplication extends BrowserFunctions {
    By verifyviewapplicationpagedisplayed = By.xpath("//h3");
    By getdetailsinviewapplicationpage = By.xpath("//tr");
    By jobidinviewapp = By.xpath("//tr/td");

    public void verifyViewApplicationPageDisplayed() {
        verifyElementDisplayed(verifyviewapplicationpagedisplayed, "verified page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(verifyviewapplicationpagedisplayed, "page name"));
    }

    public void getDetailsInViewApplicaton() {
        List<WebElement> names = getElementsList(getdetailsinviewapplicationpage, "details");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport(name);
        }
    }

    public void appliedJobidinViewApplication(String jobid) {
        if (getText(jobidinviewapp, "verifyng").equalsIgnoreCase(jobid)) {
            verifyElementPresence(jobidinviewapp, "verified ");
            ExtentTestManager.setInfoMessageInReport(getText(jobidinviewapp, ""));
        } else {
            ExtentTestManager.setPassMessageInReport(" Application not Applied with:" + jobid);
        }
    }
}

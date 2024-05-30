package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;


public class DeleteApplication extends BrowserFunctions {

    By names = By.xpath("//tr/td");

    public String getDeleteXpath(String jobid) {
        return String.format("(//tr/td[contains(text(),'%s')]/../following-sibling::tr/td/button/*[local-name()='svg'])[2]", jobid);
    }

    public void deleteApplicationBasedOnJobId(String jobid) {
        By name = By.xpath(getDeleteXpath(jobid));
        click(name, "clicked on delete application");
    }

    public String getJobIdName(String jobid) {
        return String.format("//tr/td[contains(text(),'%s')]", jobid);
    }

    public void verifyDeletedJobIdPresent(String jobid) {
        //  By name = By.xpath(getJobIdName(jobid));
        if (getText(names, "verifyng").equalsIgnoreCase(jobid)) {
            verifyElementPresence(names, "verified ");
            ExtentTestManager.setInfoMessageInReport(getText(names, ""));
        } else {
            ExtentTestManager.setPassMessageInReport(" Application deleted sucessfully with job id:" + jobid);
        }
    }
}

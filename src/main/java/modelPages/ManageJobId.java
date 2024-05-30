package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ManageJobId extends BrowserFunctions {

    By verifymanagejobidpage = By.xpath("//h2");
    By jobidtext = By.name("jobid");
    By addjob = By.xpath("//button[contains(text(),'Add')]");
    By getdetailsinmanagejobid = By.xpath("//tr/td");
    By goback = By.xpath("//a[contains(text(),'Go')]");


    public void verifyManageJobIdPageDisplaye() {
        verifyElementDisplayed(verifymanagejobidpage, "page displayed");
    }

    public void fillJobIdName(String jobid) {
        enterText(jobidtext, jobid, "entered job id");
    }

    public void clickAddJobIdButton() {
        click(addjob, "clicked on add job ");
    }

    public void getDetailsInManageJobId() {

        List<WebElement> names = getElementsList(getdetailsinmanagejobid, "details");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport("details in manage job id :" + name);
        }
    }

    public void clickGoBack() {
        click(goback, "clicked on go back");
    }

    public String getXpathJob(String jobname) {
        return String.format("//tr/td[contains(text(),'%s')]/../td/button", jobname);
    }

    public void deleteJobName(String jobnam) {

        By jobname = By.xpath(getXpathJob(jobnam));
        click(jobname, "clicked on delete button");

    }

}

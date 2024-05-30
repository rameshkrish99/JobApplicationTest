package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ViewApplication extends BrowserFunctions {

    By detailsinviewapplications = By.xpath("//tr");
    By jobidinviewapp = By.xpath("//tr/td");

    By viewpersnaldetails = By.xpath("//td/button[contains(text(),'ViewP')]");


    public void getDetailsInViewApplication() {
        List<WebElement> names = getElementsList(detailsinviewapplications, "details");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport("details  :" + name);
        }
    }

    public void clickViewPersoanlDetailsButton() {
        click(viewpersnaldetails, "clicked on view persanl details button");
    }

    public String getViewXpath(String jobid) {
        return String.format("//tr/td[contains(text(),'%s')]/../following-sibling::tr/td/*[local-name()='svg']", jobid);
    }

    public void viewApplicationByJonId(String jobid) {
        By name = By.xpath(getViewXpath(jobid));
        click(name, "clicked on view application");
    }


}

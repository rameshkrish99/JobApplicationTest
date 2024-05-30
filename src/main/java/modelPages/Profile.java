package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;

public class Profile extends BrowserFunctions {
    By verifyprofilepagedisplayed = By.xpath("//h3[contains(text(),'Profile')]");
    By personaldetailsbutton = By.xpath("//button[contains(text(),'Personal')]");
    By lougoutbutton = By.xpath("//button/*[local-name()='svg']");
    By gobacklink = By.xpath("//a[contains(text(),'Go Back')]");
    By detailsinprofil = By.xpath("//tr/td");


    public void verifyProfilePageDisplayed() {
        verifyElementDisplayed(verifyprofilepagedisplayed, "page displayed");
    }

    public void clickPersonalDetailsButton() {
        click(personaldetailsbutton, "clicked on personal details button");
    }

    public void clickLougOutButton() {
        if (verifyElementPresence(lougoutbutton, "element displayed")) {
            click(lougoutbutton, "clicked on lougout button");
        } else {
            ExtentTestManager.setInfoMessageInReport("element no displayed");
        }
    }

    public void clickGoBackLinktext() {
        click(gobacklink, "clicked on go back link text");
    }

    public void getDetailsInProfil() {
        List<WebElement> names = getElementsList(detailsinprofil, "details in profil");

        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport(name);
        }
    }
}

package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;

public class AdminHomePage extends BrowserFunctions {
    By verifyapplicationslistpage = By.xpath("//h2");
    By noofapplications = By.xpath("//h3");
    By profileicon = By.xpath("//div/*[local-name()='svg']");
    By universalsearchtextbox = By.xpath("//input[@name='query']");
    By universalserchbutton = By.xpath("//input[@name='query']/following-sibling::button");
    By universalresetbutton = By.xpath("//input[@name='query']/following-sibling::input");
    By selectjobid = By.xpath("//label[contains(text(),'Job')]/../select");

    By jobidsearch = By.xpath("//label[contains(text(),'Job')]/../button");
    By notseperioddropdown = By.xpath("//label[contains(text(),'Notice')]/../select");
    By noticeperiodsearch = By.xpath("//label[contains(text(),'Notice')]/../button");
    By immideatejoinersearch = By.xpath("//label[contains(text(),'Immi')]/../button");
    By immidatejoinerdropdown = By.xpath("//label[contains(text(),'Immi')]/../select");
    By onsitetravelledsearch = By.xpath("//label[contains(text(),'Onsite')]/../button");
    By onsitetravelledropdown = By.xpath("//label[contains(text(),'Onsite')]/../select");
    By experinceinprevscmpnysearch = By.xpath("//label[contains(text(),'Experi')]/../button");
    By experinceinorevscmpnydropdown = By.xpath("//label[contains(text(),'Experi')]/../select");

    By managejoidbutton = By.xpath("//button[contains(text(),'Manage JobID')]");


    public void verifyApplicationListPageDisplayed() {
        verifyElementDisplayed(verifyapplicationslistpage, "page displayed");
    }

    public void getnoofApplicationsApplied() {
        ExtentTestManager.setInfoMessageInReport(getText(noofapplications,
                "no of applications applied"));
    }

    public void clickProfileIcon() {
        click(profileicon, "clicked on profile icon");
    }

    public void enterTextinUniversalsearch(String search) {
        enterText(universalsearchtextbox, search, "entered in universal search");
    }

    public void clickUniversalSearchButton() {
        click(universalresetbutton, "clicked on universal search button");
    }

    public void clickUniversalResetButton() {
        click(universalresetbutton, "clicked on universal search button");
    }

    public void selectJobId(String jobid) {
        selectDropdown(selectjobid, jobid, "selected in job id");
    }

    public void clickJobIdSearch() {
        click(jobidsearch, "clicked on job id search");
    }

    public void selectNoticePeriod(String noticep) {
        selectDropdown(notseperioddropdown, noticep,
                "selected noticeperiod");
    }

    public void clickNoticePeriodSearch() {
        click(noticeperiodsearch, "clicked on notice period search");
    }

    public void selectImmideateJoiner(String immideatjoiner) {
        selectDropdown(immidatejoinerdropdown, immideatjoiner,
                "selected in immideatejoiner");
    }

    public void clickImmideateJoinerSearch() {
        click(immideatejoinersearch, "clicked immideate joiner search");
    }

    public void selectOnSiteTraveled(String onsite) {
        selectDropdown(onsitetravelledropdown, onsite,
                "selected onsite travelled dropdown");
    }

    public void clickOnSiteTrvlldSearch() {
        click(onsitetravelledsearch, "clicked onsite travelled search");
    }

    public void selectInPrevesCmpny(String exprnceinprvescmpny) {
        selectDropdown(experinceinorevscmpnydropdown, exprnceinprvescmpny, "selected exprence in preves cmpnyy");
    }

    public void clickOnExpernceInPrevesCmpnySearch() {
        click(experinceinprevscmpnysearch, "clicked exprence in prevse cmpny");
    }


    public void clickManageJobId() {
        click(managejoidbutton, "clicked on manage job id ");
    }

}

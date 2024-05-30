package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;

public class EditApplication extends BrowserFunctions {


    By applicationststus = By.xpath("//select[@name='expy']");
    By fillinterviewdate = By.xpath("//input[@name='prevCompanyName2']");
    By saveapplication = By.xpath("//button[@type='submit']");
    By editapplicationpagedisplayed = By.xpath("//h2");
    By applicationid = By.xpath("//h3");
    By exprencefrmdate = By.xpath("//input[@name='sdate']");
    By exprencetodate = By.xpath("//input[@name='edate']");
    By expinyear = By.xpath("//input[@name='rexpy']");

    By noticeP = By.xpath("//select[@name='notice']");

    By lastworkingdate = By.xpath("//input[@name='lwd']");
    By immidiatejoiner = By.xpath("//select[@name='immi']");
    By domain = By.xpath("//input[@name='domain']");
    By primskils = By.xpath("//input[@name='pskills']");
    By exptsin = By.xpath("//input[@name='expertise']");
    By csalry = By.xpath("//input[@name='cuctc']");
    By expsalry = By.xpath("//input[@name='expctc']");
    By linkedinpfl = By.xpath("//input[@name='link']");

    By currentloc = By.xpath("//input[@name='culocation']");
    By preferedLoc = By.xpath("//input[@name='prelocaion']");
    By prglanguages = By.xpath("//input[@name='languages']");
    By framwrks = By.xpath("//input[@name='frameworks']");
    By tools = By.xpath("//input[@name='tools']");
    By databas = By.xpath("//input[@name='databases1']");
    By server = By.xpath("//input[@name='servers']");
    By cloudserver = By.xpath("//input[@name='cloud']");
    //On site travelled
    By onsitetravelled = By.xpath("//select[@name='val5']");
    By onsitecounty = By.xpath("//input[@name='coun']");
    By onsitecity = By.xpath("//input[@name='citi']");
    By onsitecompanyname = By.xpath("//input[@name='onciti']");
    By onsiteclintssuportted = By.xpath("//input[@name='onciticli']");

    //previous company details
    By currntCmpny = By.xpath("//input[@name='prevCompanyName']");
    By currntcmpnyID = By.xpath("//input[@name='id1']");
    By currntcmpnyLoc = By.xpath("//input[@name='location']");
    By noofyersworkedincurrntcmpy = By.xpath("//input[@name='workedYears']");
    By currntcmpnyfromdate = By.xpath("//input[@name='prevFromDate']");
    By currntcmpnytodate = By.xpath("//input[@name='prevToDate']");
    By currntcmpnyrole = By.xpath("//input[@name='role']");
    By currntcmpnydesignation = By.xpath("//input[@name='designation']");
    By currntcmpnyctc = By.xpath("//input[@name='ctc']");

    By doyouhavepreviouscompny = By.xpath("//select[@name='id12']");
    //if you have previous company details
    By previouscompnyname = By.xpath("//input[@name='prevCompanyName1']");
    By prviouscompnyid = By.xpath("//input[@name='id11']");
    By privuscmpnyloc = By.xpath("//input[@name='location1']");
    By workedinprivuscmpny = By.xpath("//input[@name='workedYears1']");
    By priousdurationfromdate = By.xpath("//input[@name='prevFromDate1']");
    By privscmpnydurattodate = By.xpath("//input[@name='prevToDate1']");
    By roleinprivscmpny = By.xpath("//input[@name='role1']");
    By desgnationinprvscmpny = By.xpath("//input[@name='designation1']");
    By privscmpnyctc = By.xpath("//input[@name='ctc1']");
    By addcmtsinpreviscompny = By.xpath("//textarea[@name='location2']");
    By submit = By.xpath("//button[contains(text(),'Submit')]");
    By gobacktext = By.xpath("//a[contains(text(),'Go')]");
    By viewpersonaldetails = By.xpath("//button[contains(text(),'View')]");


    public String getEditXpath(String jobid) {
        return String.format("//tr/td[contains(text(),'%s')]/../following-sibling::tr/td/button/*[local-name()='svg']", jobid);
    }

    public void editApplicationBasedOnJobId(String jobid) {
        By name = By.xpath(getEditXpath(jobid));
        click(name, "clicked on edit symbole");
    }

    public void verifyEditApplicationPageDisplayed() {
        verifyElementDisplayed(editapplicationpagedisplayed, "page displayed");
        ExtentTestManager.setInfoMessageInReport(getText(editapplicationpagedisplayed, "page text"));
    }

    public void getApplicationId() {
        ExtentTestManager.setInfoMessageInReport(getText(applicationid, "application Id"));
    }


    public void selectApplicationStatus(String appstatus) {
        selectDropdown(applicationststus, appstatus, "selected in dropdown");
    }

    public void getApplicationStatusText() {
        ExtentTestManager.setInfoMessageInReport(getText(applicationststus, "Application status text"));
    }

    public void fillIntervewSheduedDate(String intrevdate) throws InterruptedException {
        clearText(fillinterviewdate, "cleared interviewdate");
        enterText(fillinterviewdate, intrevdate, "interviewsheduled date");
    }

    public void getIntrevieSheludeDate() {
        ExtentTestManager.setInfoMessageInReport(getText(fillinterviewdate, "interview date"));
    }

    public void clickSave() {
        click(saveapplication, "clicked on save button");
    }

    public void totalExperenceFromDate(String totlexpfrom) throws InterruptedException {
        clearText(exprencefrmdate, "cleared expfromdate");
        enterText(exprencefrmdate, totlexpfrom, "experence from date");
    }

    public void fillLinkedInProfile(String linkedin) throws InterruptedException {
        clearText(linkedinpfl, "cleared linked in profile");
        enterText(linkedinpfl, linkedin, "enter text in linked in profil");
    }

    public void totalExperencetoDate(String totalexpto) throws InterruptedException {
        clearText(exprencetodate, "cleared to date");
        enterText(exprencetodate, totalexpto, "experence to date");
    }

    public void selectNoticePeriod(String noticeperiod) {
        selectDropdown(noticeP, noticeperiod, "selected notice period");
    }

    public void getTotalExpInyersBasedOnDate() {
        ExtentTestManager.setPassMessageInReport(getText(expinyear, "exp in years"));
    }

    public void lastWorkingDay(String lastwrkinday) {
        enterText(lastworkingdate, lastwrkinday, "last working day");
    }

    public void selectImmiiateJoiner(String immidjoin) {
        selectDropdown(immidiatejoiner, immidjoin, "selected immidieta joiner");
    }

    public void fillDomain(String domainname) throws InterruptedException {
        clearText(domain, "cleared domain");
        enterText(domain, domainname, "entered domain name");
    }

    public void fillExpertiseIn(String exptisein) throws InterruptedException {
        clearText(exptsin, "cleared expertise in");
        enterText(exptsin, exptisein, "entered expetise in");
    }

    public void fillPrimarySkills(String primryskills) throws InterruptedException {
        clearText(primskils, "cleared primary skills");
        enterText(primskils, primryskills, "entered Primary skills");
    }

    public void fillCurrentCtc(String crntctc) throws InterruptedException {
        clearText(csalry, "clered currnet ctc");
        enterText(csalry, crntctc, "entered curent ctc");
    }

    public void fillExperctedCtc(String expctc) throws InterruptedException {
        clearText(csalry, "clered currnet ctc");
        enterText(expsalry, expctc, "entered expercted ctc");
    }

    public void fillCurrentLocation(String currntloc) throws InterruptedException {
        clearText(currentloc, "clered currnet ctc");
        enterText(currentloc, currntloc, "entered current location");
    }

    public void fillPreferedLoc(String prefloc) throws InterruptedException {
        clearText(preferedLoc, "clered currnet ctc");
        enterText(preferedLoc, prefloc, "entered prefered location");
    }

    public void fillProgrmLanguages(String proglangs) throws InterruptedException {
        clearText(prglanguages, "clered currnet ctc");
        enterText(prglanguages, proglangs, "entered programing lanuags");
    }

    public void fillFrameWorks(String frmworks) throws InterruptedException {
        clearText(framwrks, "clered currnet ctc");
        enterText(framwrks, frmworks, "entered frameworks");
    }

    public void fillTools(String toolsname) throws InterruptedException {
        clearText(tools, "clered currnet ctc");
        enterText(tools, toolsname, "entered tools");
    }

    public void fillDataBaseText(String databasename) {
        enterText(databas, databasename, "database name entered");
    }

    public void fillServerstext(String servername) throws InterruptedException {
        clearText(server, "clered currnet ctc");
        enterText(server, servername, "entered server name");
    }

    public void selectOnSiteTravelle(String onsiteTrvlld) {
        selectDropdown(onsitetravelled, onsiteTrvlld, "onsie travelled");
    }

    public void fillOnSiteCmpnyName(String onsitcmpnyname) throws InterruptedException {
        clearText(onsitecompanyname, "clered currnet ctc");
        enterText(onsitecompanyname, onsitcmpnyname, "entered site compny name");
    }

    public void fillOnSieCityName(String onsitcitynam) throws InterruptedException {
        clearText(onsitecity, "clered currnet ctc");
        enterText(onsitecity, onsitcitynam, "onsite city entered");
    }

    public void fillOnSiteCountryName(String onsitecontryname) throws InterruptedException {
        clearText(onsitecounty, "clered currnet ctc");
        enterText(onsitecounty, onsitecontryname, "onsite cuntry name entered");
    }

    public void fillOnSiteSlintSupport(String onsitcintsuppt) throws InterruptedException {
        clearText(onsiteclintssuportted, "clered currnet ctc");
        enterText(onsiteclintssuportted, onsitcintsuppt, "entered onsite clint support");
    }

    public void fillCurrentCmpnyName(String currntcmpnyname) throws InterruptedException {
        clearText(currntCmpny, "clered currnet ctc");
        enterText(currntCmpny, currntcmpnyname, "entered current cmpny name");
    }

    public void fillCurrntCmpnyId(String currntcmpyid) throws InterruptedException {
        clearText(currntcmpnyID, "clered currnet ctc");
        enterText(currntcmpnyID, currntcmpyid, "entered crrnt cmpny id");
    }

    public void fillCurrntCmpnyLoc(String currntcmpyloc) throws InterruptedException {
        clearText(currntcmpnyLoc, "clered currnet ctc");
        enterText(currntcmpnyLoc, currntcmpyloc, "entered curren compny location");
    }

    public void fillNoOfyersorkrfinCurrntCmpny(String workedincurrntcmpnyinyers) throws InterruptedException {
        clearText(noofyersworkedincurrntcmpy, "clered currnet ctc");
        enterText(noofyersworkedincurrntcmpy, workedincurrntcmpnyinyers, "entered no of yers worked");
    }

    public void fillCurrntCmpnyDurationdate(String strtdate) throws InterruptedException {
        clearText(currntcmpnyfromdate, "clered currnet ctc");
        enterText(currntcmpnyfromdate, strtdate, "entered curent cmpny strt date");
    }

    public void fillCurrentCmpnyDurationToDate(String currcmpytodate) throws InterruptedException {
        clearText(currntcmpnytodate, "clered currnet ctc");
        enterText(currntcmpnytodate, currcmpytodate, "entered duration to date");
    }

    public void fillCurrentCmpnyRole(String currntcmprole) throws InterruptedException {
        clearText(currntcmpnyrole, "clered currnet ctc");
        enterText(currntcmpnyrole, currntcmprole, "entered current cmpny role");
    }

    public void fillCurrentCmpnyDesignation(String crrntcmpnyDesignation) throws InterruptedException {
        clearText(currntcmpnydesignation, "clered currnet ctc");
        enterText(currntcmpnydesignation, crrntcmpnyDesignation, "entered current cmpny designation");
    }

    public void fillCurrntCmpnyCtc(String currntctc) throws InterruptedException {
        clearText(currntcmpnyctc, "clered currnet ctc");
        enterText(currntcmpnyctc, currntctc, "entered current company ctc");
    }

    public void selectDoYouHavePrivsCmpny(String doyouhaveprivscmpny) {
        selectDropdown(doyouhavepreviouscompny, doyouhaveprivscmpny, "selected in drop down");
    }

    public void fillPrevCmpnyName(String prvcmpnyname) throws InterruptedException {
        clearText(previouscompnyname, "clered currnet ctc");
        enterText(previouscompnyname, prvcmpnyname, "entered prves cmpny name");
    }

    public void fillPrevCmpnyId(String previd) throws InterruptedException {
        clearText(prviouscompnyid, "clered currnet ctc");
        enterText(prviouscompnyid, previd, "entered pervs cmpny id");
    }

    public void fillPrevCmpnyLoc(String prevcmpnyloc) throws InterruptedException {
        clearText(privuscmpnyloc, "clered currnet ctc");
        enterText(privuscmpnyloc, prevcmpnyloc, "entered prevscmpny location");
    }

    public void fillWorkedInPrevsCmpny(String workedinprvscmpny) throws InterruptedException {
        clearText(workedinprivuscmpny, "clered currnet ctc");
        enterText(workedinprivuscmpny, workedinprvscmpny, "entered worked in prevs company ");
    }

    public void fillPrevsCmpnyFrom(String prvscmpnyFrom) throws InterruptedException {
        clearText(priousdurationfromdate, "clered currnet ctc");
        enterText(priousdurationfromdate, prvscmpnyFrom, "entered prevs cmpny from date");
    }

    public void fillprevsCmpnyTo(String prvscmpnyto) throws InterruptedException {
        clearText(privscmpnydurattodate, "clered currnet ctc");
        enterText(privscmpnydurattodate, prvscmpnyto, "entered prevs cmpny to date");
    }

    public void fillPrevsCmpnyRole(String prevscmpnyrole) throws InterruptedException {
        clearText(roleinprivscmpny, "clered currnet ctc");
        enterText(roleinprivscmpny, prevscmpnyrole, "entered prevs cmpny role");
    }

    public void fillPrevsCmpnyDesignation(String prvscmpnydesignation) throws InterruptedException {
        clearText(desgnationinprvscmpny, "clered currnet ctc");
        enterText(desgnationinprvscmpny, prvscmpnydesignation, "entered prves cmpny designation");
    }

    public void fillPrevsCmpnyCtc(String prvescmpnyctc) throws InterruptedException {
        clearText(privscmpnyctc, "clered currnet ctc");
        enterText(privscmpnyctc, prvescmpnyctc, "entered prevs cmpny ctc");
    }

    public void fillPrevsCmpnyAddcmts(String pervscmpnycmmts) throws InterruptedException {
        clearText(addcmtsinpreviscompny, "clered currnet ctc");
        enterText(addcmtsinpreviscompny, pervscmpnycmmts, "entered prevs cmpny comments");
    }

    public void clickOnViewPersonaldetails() {
        click(viewpersonaldetails, "clicked on vie personal details");
    }

    public void clickGoBackButton() {
        click(gobacktext, "clicked on goback button");
    }

}

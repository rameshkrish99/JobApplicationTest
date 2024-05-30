package modelPages;

import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ApplyApplication extends BrowserFunctions {


    By verifyjobapplicationpagedisplayed = By.xpath("//h2[contains(text(),' Job Application')]");
    By job = By.xpath("//select[@name='id']");
    By email = By.xpath("//input[@name='email']");
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
    By gobacbutton = By.xpath("//button[contains(text(),'Go')]");
    By textboxerror = By.xpath("//div[@class='text-danger']");

    //personal details


    private void verifyApplyJobApplicationPageDisplayed() {
        verifyElementDisplayed(verifyjobapplicationpagedisplayed, "page displayed");
        ExtentTestManager.setPassMessageInReport(getText(verifyjobapplicationpagedisplayed, "page name"));
    }

    public void selectJobName(String jobname) {

        selectDropdown(job, jobname, "select job name");
    }

    public void getErrorText() {
        List<WebElement> names = getElementsList(textboxerror, "error message");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport(name);
        }
    }

    public void verifyRegisteredEmailGenertedinApplication() {
        verifyElementDisplayed(email, "email displayed");
        ExtentTestManager.setPassMessageInReport(getText(email, "regustered email"));
    }

    public void totalExperenceFromDate(String totlexpfrom) {
        enterText(exprencefrmdate, totlexpfrom, "experence from date");
    }

    public void fillLinkedInProfile(String linkedin) {
        enterText(linkedinpfl, linkedin, "enter text in linked in profil");
    }

    public void totalExperencetoDate(String totalexpto) {
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

    public void fillDomain(String domainname) {
        enterText(domain, domainname, "entered domain name");
    }

    public void fillExpertiseIn(String exptisein) {
        enterText(exptsin, exptisein, "entered expetise in");
    }

    public void fillPrimarySkills(String primryskills) {
        enterText(primskils, primryskills, "entered Primary skills");
    }

    public void fillCurrentCtc(String crntctc) {
        enterText(csalry, crntctc, "entered curent ctc");
    }

    public void fillExperctedCtc(String expctc) {
        enterText(expsalry, expctc, "entered expercted ctc");
    }

    public void fillCurrentLocation(String currntloc) {
        enterText(currentloc, currntloc, "entered current location");
    }

    public void fillPreferedLoc(String prefloc) {
        enterText(preferedLoc, prefloc, "entered prefered location");
    }

    public void fillProgrmLanguages(String proglangs) {
        enterText(prglanguages, proglangs, "entered programing lanuags");
    }

    public void fillFrameWorks(String frmworks) {
        enterText(framwrks, frmworks, "entered frameworks");
    }

    public void fillTools(String toolsname) {
        enterText(tools, toolsname, "entered tools");
    }

    public void fillDataBaseText(String databasename) {
        enterText(databas, databasename, "database name entered");
    }

    public void fillServerstext(String servername) {
        enterText(server, servername, "entered server name");
    }

    public void selectOnSiteTravelle(String onsiteTrvlld) {
        selectDropdown(onsitetravelled, onsiteTrvlld, "onsie travelled");
    }

    public void fillOnSiteCmpnyName(String onsitcmpnyname) {
        enterText(onsitecompanyname, onsitcmpnyname, "entered site compny name");
    }

    public void fillOnSieCityName(String onsitcitynam) {
        enterText(onsitecity, onsitcitynam, "onsite city entered");
    }

    public void fillOnSiteCountryName(String onsitecontryname) {
        enterText(onsitecounty, onsitecontryname, "onsite cuntry name entered");
    }

    public void fillOnSiteSlintSupport(String onsitcintsuppt) {
        enterText(onsiteclintssuportted, onsitcintsuppt, "entered onsite clint support");
    }

    public void fillCurrentCmpnyName(String currntcmpnyname) {
        enterText(currntCmpny, currntcmpnyname, "entered current cmpny name");
    }

    public void fillCurrntCmpnyId(String currntcmpyid) {
        enterText(currntcmpnyID, currntcmpyid, "entered crrnt cmpny id");
    }

    public void fillCurrntCmpnyLoc(String currntcmpyloc) {
        enterText(currntcmpnyLoc, currntcmpyloc, "entered curren compny location");
    }

    public void fillNoOfyersorkrfinCurrntCmpny(String workedincurrntcmpnyinyers) {
        enterText(noofyersworkedincurrntcmpy, workedincurrntcmpnyinyers, "entered no of yers worked");
    }

    public void fillCurrntCmpnyDurationdate(String strtdate) {
        enterText(currntcmpnyfromdate, strtdate, "entered curent cmpny strt date");
    }

    public void fillCurrentCmpnyDurationToDate(String currcmpytodate) {
        enterText(currntcmpnytodate, currcmpytodate, "entered duration to date");
    }

    public void fillCurrentCmpnyRole(String currntcmprole) {
        enterText(currntcmpnyrole, currntcmprole, "entered current cmpny role");
    }

    public void fillCurrentCmpnyDesignation(String crrntcmpnyDesignation) {
        enterText(currntcmpnydesignation, crrntcmpnyDesignation, "entered current cmpny designation");
    }

    public void fillCurrntCmpnyCtc(String currntctc) {
        enterText(currntcmpnyctc, currntctc, "entered current company ctc");
    }

    public void selectDoYouHavePrivsCmpny(String doyouhaveprivscmpny) {
        selectDropdown(doyouhavepreviouscompny, doyouhaveprivscmpny, "selected in drop down");
    }

    public void fillPrevCmpnyName(String prvcmpnyname) {
        enterText(previouscompnyname, prvcmpnyname, "entered prves cmpny name");
    }

    public void fillPrevCmpnyId(String previd) {
        enterText(prviouscompnyid, previd, "entered pervs cmpny id");
    }

    public void fillPrevCmpnyLoc(String prevcmpnyloc) {
        enterText(privuscmpnyloc, prevcmpnyloc, "entered prevscmpny location");
    }

    public void fillWorkedInPrevsCmpny(String workedinprvscmpny) {
        enterText(workedinprivuscmpny, workedinprvscmpny, "entered worked in prevs company ");
    }

    public void fillPrevsCmpnyFrom(String prvscmpnyFrom) {
        enterText(priousdurationfromdate, prvscmpnyFrom, "entered prevs cmpny from date");
    }

    public void fillprevsCmpnyTo(String prvscmpnyto) {
        enterText(privscmpnydurattodate, prvscmpnyto, "entered prevs cmpny to date");
    }

    public void fillPrevsCmpnyRole(String prevscmpnyrole) {
        enterText(roleinprivscmpny, prevscmpnyrole, "entered prevs cmpny role");
    }

    public void fillPrevsCmpnyDesignation(String prvscmpnydesignation) {
        enterText(desgnationinprvscmpny, prvscmpnydesignation, "entered prves cmpny designation");
    }

    public void fillPrevsCmpnyCtc(String prvescmpnyctc) {
        enterText(privscmpnyctc, prvescmpnyctc, "entered prevs cmpny ctc");
    }

    public void fillPrevsCmpnyAddcmts(String pervscmpnycmmts) {
        enterText(addcmtsinpreviscompny, pervscmpnycmmts, "entered prevs cmpny comments");
    }

    public void clickSubmitButton() {
        click(submit, "clicked on submit button");
    }

    public void gobackButton() {
        click(gobacbutton, "clicked on goback button");
    }
}

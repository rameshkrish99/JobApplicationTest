package org.xyz.tests;

import modelPages.*;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class ViewApplicationTest {
    private Loginp login;
    private AdminHomePage adminHomePage;
    private ManageJobId manageJobId;
    private Profile profile;
    private UseHomePage useHomePage;
    private UserViewApplication userViewApplication;
    private ViewApplication viewApplication;
    private ApplyApplication applyApplication;

    @BeforeClass
    public void init() {

        login = new Loginp();
        adminHomePage = new AdminHomePage();
        manageJobId = new ManageJobId();
        profile = new Profile();
        viewApplication = new ViewApplication();
        useHomePage = new UseHomePage();
        userViewApplication = new UserViewApplication();
        applyApplication = new ApplyApplication();

    }

    @Test
    @Parameters({"strParams"})
    public void AdminviewApplicationInAdminPage(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);
            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            adminHomePage.verifyApplicationListPageDisplayed();
            adminHomePage.getnoofApplicationsApplied();
            adminHomePage.selectOnSiteTraveled(data.get("Onsitetravelled"));
            adminHomePage.clickOnSiteTrvlldSearch();
            adminHomePage.getnoofApplicationsApplied();
            viewApplication.getDetailsInViewApplication();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userViewApplication(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            useHomePage.viewApplicationButton();
            userViewApplication.verifyViewApplicationPageDisplayed();
            userViewApplication.getDetailsInViewApplicaton();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userApplyApplicationAndVerifyInViewApplicationPage(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            useHomePage.verifyUserWelcomPageDisplayed();
            useHomePage.newApplicationButton();
            applyApplication.selectJobName(data.get("jobappliedfor"));
            applyApplication.totalExperenceFromDate(data.get("expfromdate"));
            applyApplication.totalExperencetoDate(data.get("exptodate"));
            applyApplication.selectNoticePeriod(data.get("noticeperiod"));
            applyApplication.selectImmiiateJoiner(data.get("immjoiner"));
            applyApplication.getTotalExpInyersBasedOnDate();
            applyApplication.fillLinkedInProfile(data.get("linked in profile"));
            applyApplication.fillDomain(data.get("domain"));
            applyApplication.fillExpertiseIn(data.get("experticein"));
            applyApplication.fillPrimarySkills(data.get("primiryskills"));
            applyApplication.fillCurrentCtc(data.get("currntctc"));
            applyApplication.fillExperctedCtc(data.get("experctedctc"));
            applyApplication.fillCurrentLocation(data.get("currntloc"));
            applyApplication.fillPreferedLoc(data.get("prefrdloc"));
            applyApplication.fillProgrmLanguages(data.get("programlang"));
            applyApplication.fillFrameWorks(data.get("fillframewk"));
            applyApplication.fillTools(data.get("tools"));
            applyApplication.selectOnSiteTravelle(data.get("onsitetravelled"));
            if (data.get("onsitetravelled").equalsIgnoreCase("yes")) {
                applyApplication.fillOnSieCityName(data.get("onsitecity"));
                applyApplication.fillOnSiteCmpnyName(data.get("onsitecmpny"));
                applyApplication.fillOnSiteCountryName(data.get("onsitecuntry"));
                applyApplication.fillOnSiteCmpnyName(data.get("onsiteclint"));
            }

            applyApplication.fillCurrentCmpnyName(data.get("currntcmpnyname"));
            applyApplication.fillCurrntCmpnyId(data.get("currntcmpnyid"));
            applyApplication.fillCurrntCmpnyLoc(data.get("currntcmpnyloc"));
            applyApplication.fillNoOfyersorkrfinCurrntCmpny(data.get("no.of yers worked"));
            applyApplication.fillCurrntCmpnyDurationdate(data.get("currntcmpnydurationfrom"));
            applyApplication.fillCurrentCmpnyDurationToDate(data.get("currntcmpnyduraiontodate"));
            applyApplication.fillCurrentCmpnyRole(data.get("currntcmpnyrole"));
            applyApplication.fillCurrntCmpnyCtc(data.get("currntcmpnyctc"));
            applyApplication.fillCurrentCmpnyDesignation(data.get("currntcmpnydesg"));
            applyApplication.selectDoYouHavePrivsCmpny(data.get("do you have previous cmpny"));
            if (data.get("do you have previous cmpny").equalsIgnoreCase("yes")) {
                applyApplication.fillPrevCmpnyName(data.get("prvescmpnyname"));
                applyApplication.fillPrevCmpnyId(data.get("prevscmpnyid"));
                applyApplication.fillPrevCmpnyLoc(data.get("prevscmpnyloc"));
                applyApplication.fillWorkedInPrevsCmpny(data.get("no.ofyersworkedinprevscmpny"));
                applyApplication.fillPrevsCmpnyRole(data.get("prevscmpnyrole"));
                applyApplication.fillPrevsCmpnyDesignation(data.get("prevscmpnydesg"));
                applyApplication.fillPrevsCmpnyFrom(data.get("prevscmpnydurationfrm"));
                applyApplication.fillprevsCmpnyTo(data.get("prevscmpnydurationto"));
                applyApplication.fillPrevsCmpnyCtc(data.get("prevscmpnyctc"));
            }
            applyApplication.clickSubmitButton();
            Thread.sleep(10000);
            applyApplication.gobackButton();
            useHomePage.profileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickLougOutButton();
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            useHomePage.viewApplicationButton();
            userViewApplication.verifyViewApplicationPageDisplayed();
            userViewApplication.appliedJobidinViewApplication(data.get("jobappliedfor"));

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userApplyApplicationAndVerifyInAdminViewApplicationPage(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            useHomePage.verifyUserWelcomPageDisplayed();
            useHomePage.newApplicationButton();
            applyApplication.selectJobName(data.get("jobappliedfor"));
            applyApplication.totalExperenceFromDate(data.get("expfromdate"));
            applyApplication.totalExperencetoDate(data.get("exptodate"));
            applyApplication.selectNoticePeriod(data.get("noticeperiod"));
            applyApplication.selectImmiiateJoiner(data.get("immjoiner"));
            applyApplication.getTotalExpInyersBasedOnDate();
            applyApplication.fillLinkedInProfile(data.get("linked in profile"));
            applyApplication.fillDomain(data.get("domain"));
            applyApplication.fillExpertiseIn(data.get("experticein"));
            applyApplication.fillPrimarySkills(data.get("primiryskills"));
            applyApplication.fillCurrentCtc(data.get("currntctc"));
            applyApplication.fillExperctedCtc(data.get("experctedctc"));
            applyApplication.fillCurrentLocation(data.get("currntloc"));
            applyApplication.fillPreferedLoc(data.get("prefrdloc"));
            applyApplication.fillProgrmLanguages(data.get("programlang"));
            applyApplication.fillFrameWorks(data.get("fillframewk"));
            applyApplication.fillTools(data.get("tools"));
            applyApplication.selectOnSiteTravelle(data.get("onsitetravelled"));
            if (data.get("onsitetravelled").equalsIgnoreCase("yes")) {
                applyApplication.fillOnSieCityName(data.get("onsitecity"));
                applyApplication.fillOnSiteCmpnyName(data.get("onsitecmpny"));
                applyApplication.fillOnSiteCountryName(data.get("onsitecuntry"));
                applyApplication.fillOnSiteCmpnyName(data.get("onsiteclint"));
            }

            applyApplication.fillCurrentCmpnyName(data.get("currntcmpnyname"));
            applyApplication.fillCurrntCmpnyId(data.get("currntcmpnyid"));
            applyApplication.fillCurrntCmpnyLoc(data.get("currntcmpnyloc"));
            applyApplication.fillNoOfyersorkrfinCurrntCmpny(data.get("no.of yers worked"));
            applyApplication.fillCurrntCmpnyDurationdate(data.get("currntcmpnydurationfrom"));
            applyApplication.fillCurrentCmpnyDurationToDate(data.get("currntcmpnyduraiontodate"));
            applyApplication.fillCurrentCmpnyRole(data.get("currntcmpnyrole"));
            applyApplication.fillCurrntCmpnyCtc(data.get("currntcmpnyctc"));
            applyApplication.fillCurrentCmpnyDesignation(data.get("currntcmpnydesg"));
            applyApplication.selectDoYouHavePrivsCmpny(data.get("do you have previous cmpny"));
            if (data.get("do you have previous cmpny").equalsIgnoreCase("yes")) {
                applyApplication.fillPrevCmpnyName(data.get("prvescmpnyname"));
                applyApplication.fillPrevCmpnyId(data.get("prevscmpnyid"));
                applyApplication.fillPrevCmpnyLoc(data.get("prevscmpnyloc"));
                applyApplication.fillWorkedInPrevsCmpny(data.get("no.ofyersworkedinprevscmpny"));
                applyApplication.fillPrevsCmpnyRole(data.get("prevscmpnyrole"));
                applyApplication.fillPrevsCmpnyDesignation(data.get("prevscmpnydesg"));
                applyApplication.fillPrevsCmpnyFrom(data.get("prevscmpnydurationfrm"));
                applyApplication.fillprevsCmpnyTo(data.get("prevscmpnydurationto"));
                applyApplication.fillPrevsCmpnyCtc(data.get("prevscmpnyctc"));
            }
            applyApplication.clickSubmitButton();
            Thread.sleep(10000);
            applyApplication.gobackButton();
            useHomePage.profileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickLougOutButton();
            login.navigateToUrl(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            adminHomePage.verifyApplicationListPageDisplayed();
            adminHomePage.getnoofApplicationsApplied();
            userViewApplication.appliedJobidinViewApplication(data.get("jobappliedfor"));

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

}

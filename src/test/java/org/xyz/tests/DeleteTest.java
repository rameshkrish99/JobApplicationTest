package org.xyz.tests;

import modelPages.*;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class DeleteTest {

    private Loginp login;
    private AdminHomePage adminHomePage;
    DeleteApplication deleteApplication;
    ViewApplication viewApplication;
    UseHomePage useHomePage;
    UserViewApplication userViewApplication;
    Profile profile;

    @BeforeClass
    public void init() {

        login = new Loginp();
        adminHomePage = new AdminHomePage();
        deleteApplication = new DeleteApplication();
        viewApplication = new ViewApplication();
        profile = new Profile();
        useHomePage = new UseHomePage();
        userViewApplication = new UserViewApplication();

    }

    @Test
    @Parameters({"strParams"})
    public void adminViewApplicationAndDeleteApplication(String strParams) {
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
            viewApplication.viewApplicationByJonId(data.get("deletejobid"));
            deleteApplication.deleteApplicationBasedOnJobId(data.get("deletejobid"));
            deleteApplication.acceptAlert();
            Thread.sleep(5000);
            deleteApplication.acceptAlert();
            Thread.sleep(5000);
            adminHomePage.clickProfileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickLougOutButton();
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            adminHomePage.verifyApplicationListPageDisplayed();
            deleteApplication.verifyDeletedJobIdPresent(data.get("deletejobid"));
            adminHomePage.clickProfileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickLougOutButton();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void verifyDeletedApplicationInUserApplicationListPage(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            useHomePage.verifyUserWelcomPageDisplayed();
            useHomePage.viewApplicationButton();
            userViewApplication.verifyViewApplicationPageDisplayed();
            deleteApplication.verifyDeletedJobIdPresent(data.get("deletejobid"));

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

}

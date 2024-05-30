package org.xyz.tests;

import modelPages.*;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class AdminActions {


    private Registrationpage register;
    private Loginp login;
    private AdminHomePage adminHomePage;
    private ManageJobId manageJobId;
    private Profile profile;
    private EditApplication editApplication;

    @BeforeClass
    public void init() {

        login = new Loginp();
        adminHomePage = new AdminHomePage();
        manageJobId = new ManageJobId();
        profile = new Profile();
        editApplication = new EditApplication();

    }

    @Test
    @Parameters({"strParams"})
    public void adminLoginAndAddJobId(String strParams) {
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
            adminHomePage.clickManageJobId();
            manageJobId.fillJobIdName(data.get("jobid"));
            manageJobId.clickAddJobIdButton();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminLoginAndDeleteAddedJobIds(String strParams) {
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
            adminHomePage.clickManageJobId();
            manageJobId.deleteJobName(data.get("jobid"));
            manageJobId.acceptAlert();
            Thread.sleep(5000);
            manageJobId.acceptAlert();
            manageJobId.getDetailsInManageJobId();
            manageJobId.clickGoBack();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void getDetailsInAdminProfil(String strParams) {
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
            adminHomePage.clickProfileIcon();
            profile.verifyProfilePageDisplayed();
            profile.getDetailsInProfil();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminChangesIntervieStausAsInterView(String strParams) {
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

            editApplication.editApplicationBasedOnJobId(data.get("jobid"));
            editApplication.verifyEditApplicationPageDisplayed();
            editApplication.getApplicationId();
            editApplication.selectApplicationStatus(data.get("applicationstatus"));
            editApplication.clickSave();
//            editApplication.acceptAlert();
//            editApplication.fillIntervewSheduedDate(data.get("interviewdate"));
//            editApplication.clickSave();
            Thread.sleep(3000);
            editApplication.acceptAlert();
            Thread.sleep(10000);
            editApplication.acceptAlert();

            Thread.sleep(3000);
            editApplication.getIntrevieSheludeDate();
            editApplication.getApplicationStatusText();
            adminHomePage.clickProfileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickLougOutButton();
            login.verifyLoginPageDiaplsyed();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }


}

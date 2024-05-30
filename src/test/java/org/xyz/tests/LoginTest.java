package org.xyz.tests;


import modelPages.Forgetpassword;
import modelPages.Loginp;
import modelPages.Registrationpage;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginTest {

    /*
    launch the browser
    Navigate to URL
    Click on login link in home page
    Enter Email Address
    Enter Password
    Click on Login button
     */
    private Registrationpage register;
    private Loginp login;
    private Forgetpassword forgetpassword;


    @BeforeClass
    public void init() {

        login = new Loginp();
        register = new Registrationpage();
        forgetpassword = new Forgetpassword();

    }

    @Test
    @Parameters({"strParams"})
    public void userRegisterWithValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);


            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmailText(data.get("email"));
            // register.fillNameText(data.get("name"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            Thread.sleep(5000);
            register.clickSubmit();
            Thread.sleep(60000);
            register.verifyOtpPgaeDisplayed();
            register.clickSubmit();
            Thread.sleep(6000);
            register.verifyPreviewPageDisplayed();
            register.getDetailsInPreviewPage();
            register.confirmInPreviewPage();
            Thread.sleep(30000);
            register.clickLoginTextInConditionsPage();
            login.verifyLoginPageDiaplsyed();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userRegisterWithInValidDetais(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);


            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmailText(data.get("email"));
            // register.fillNameText(data.get("name"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            register.clickSubmit();
            register.getInvalidText();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userRegisterWithAlreadyRegisteredDetails(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmailText(data.get("email"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            Thread.sleep(10000);
            register.clickSubmit();
            register.getInvalidText();

            Thread.sleep(30000);

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminRegisterWithValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);


            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmpId(data.get("empid"));
            register.fillEmailText(data.get("email"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            register.clickSubmit();
            Thread.sleep(60000);
            register.verifyOtpPgaeDisplayed();
            register.clickSubmit();
            Thread.sleep(6000);
            register.verifyPreviewPageDisplayed();
            register.getDetailsInPreviewPage();
            register.confirmInPreviewPage();
            Thread.sleep(30000);
            register.clickLoginTextInConditionsPage();
            login.verifyLoginPageDiaplsyed();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminRegisterWithInValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);


            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmpId(data.get("empid"));
            register.fillEmailText(data.get("email"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            Thread.sleep(5000);
            register.clickSubmit();
            register.getInvalidText();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminRegisterWithAlreadyRegisterEmail(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);


            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickSignUpButton();
            register.verifySignUpPAgeDisplayed();
            register.fillEmpId(data.get("empid"));
            register.fillEmailText(data.get("email"));
            register.fillPasswordText(data.get("password"));
            register.clickShowPasswordIcon();
            register.fillNameText(data.get("name"));
            register.fillCnfirmPassword(data.get("cnfirmpassword"));
            register.clickShowCnfirmpasswordicon();
            register.fillMobileNumberText(data.get("mobile"));
            Thread.sleep(5000);
            register.clickSubmit();
            register.getInvalidText();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }


    @Test
    @Parameters({"strParams"})
    public void userLoginWithValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userLoginWithInValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            login.getErrrText();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminLoginWithValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminLoginWithInValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.fillEmailText(data.get("email"));
            login.fillPasswordText(data.get("password"));
            login.clickShowPasswordIcon();
            login.clickSibmitbutton();
            login.getErrrText();


        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

}

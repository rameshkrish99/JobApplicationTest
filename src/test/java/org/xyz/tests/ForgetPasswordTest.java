package org.xyz.tests;

import modelPages.*;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class ForgetPasswordTest {

    private Loginp login;
    private Forgetpassword forgetpassword;

    @BeforeClass
    public void init() {

        login = new Loginp();
        forgetpassword = new Forgetpassword();

    }


    @Test
    @Parameters({"strParams"})
    public void userForgetPasswordTestWithValidDetails(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobile"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.clickSubmitButton();
            Thread.sleep(5000);
            forgetpassword.verifyChangePasswordPageDisplayed();
            forgetpassword.fillNewPassword(data.get("newpassword"));
            forgetpassword.fillConfirmpassword(data.get("cnfirmpassword"));
            forgetpassword.clickSubmitButton();
            forgetpassword.verifyPasswordChangedSucessfullyPage();
            forgetpassword.goToLogin();
            login.verifyLoginPageDiaplsyed();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed " + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminForgetPasswordTestWithValidDetails(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);
            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.verifyOtpPageDisplayed();
            forgetpassword.clickSubmitButton();
            Thread.sleep(5000);
            forgetpassword.verifyChangePasswordPageDisplayed();
            forgetpassword.fillNewPassword(data.get("newpassword"));
            forgetpassword.fillConfirmpassword(data.get("cnfirmpassword"));
            forgetpassword.clickSubmitButton();
            forgetpassword.verifyPasswordChangedSucessfullyPage();
            forgetpassword.clickGoBackLinkText();
            login.verifyLoginPageDiaplsyed();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userForgetPasswordTestWithInValidOtp(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.verifyOtpPageDisplayed();
            forgetpassword.clickSubmitButton();
            Thread.sleep(5000);
            forgetpassword.ifOtpIsInvalid();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userForgetPasswordTestWithInValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            forgetpassword.getinvalidCreds();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed " + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userUpdatePasswordTestWithInValidPassword(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.clickSubmitButton();
            Thread.sleep(5000);
            forgetpassword.verifyChangePasswordPageDisplayed();
            forgetpassword.fillNewPassword(data.get("newpassword"));
            forgetpassword.fillConfirmpassword(data.get("cnfirmpassword"));
            forgetpassword.clickSubmitButton();
            forgetpassword.getErrorMessageInText();
        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminForgetPasswordTestWithInValidOtp(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.verifyOtpPageDisplayed();
            forgetpassword.clickSubmitButton();
            Thread.sleep(3000);
            forgetpassword.ifOtpIsInvalid();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminUpdatePasswordTestWithInValidNewPassword(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            Thread.sleep(60000);
            forgetpassword.clickSubmitButton();
            Thread.sleep(5000);
            forgetpassword.verifyChangePasswordPageDisplayed();
            forgetpassword.fillNewPassword(data.get("newpassword"));
            forgetpassword.fillConfirmpassword(data.get("cnfirmpassword"));
            forgetpassword.clickSubmitButton();
            forgetpassword.acceptAlert();
        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to login with invalid credentials" + e.getMessage());
        }
    }

    @Test
    @Parameters({"strParams"})
    public void adminForgetPasswordTestWithInValidCredentials(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            login.openNewTabWithURL(data.get("url"));
            login.verifyLoginPageDiaplsyed();
            login.clickForgetPasswordLinktext();
            forgetpassword.verifyForgetPasswordPageDisplayed();
            forgetpassword.enterEmail(data.get("email"));
            forgetpassword.enterMobileNumber(data.get("mobilenumber"));
            forgetpassword.clickSubmitButton();
            forgetpassword.getinvalidCreds();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed " + e.getMessage());
        }
    }


}

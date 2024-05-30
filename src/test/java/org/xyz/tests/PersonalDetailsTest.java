package org.xyz.tests;

import modelPages.Loginp;
import modelPages.PersonalDetailsPage;
import modelPages.Profile;
import modelPages.UseHomePage;
import oniesoft.WebFramework.Runner;
import oniesoft.api.reporting.ExtentTestManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Map;

public class PersonalDetailsTest {
    private Loginp loginp;
    private UseHomePage useHomePage;
    private Profile profile;
    private PersonalDetailsPage personalDetailsPage;

    @BeforeClass
    public void init() {
        loginp = new Loginp();
        useHomePage = new UseHomePage();
        profile = new Profile();
        personalDetailsPage = new PersonalDetailsPage();
    }


    @Test
    @Parameters({"strParams"})
    public void userAddPersonalDetails(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            loginp.verifyLoginPageDiaplsyed();
            loginp.fillEmailText(data.get("email"));
            loginp.fillPasswordText(data.get("password"));
            loginp.clickShowPasswordIcon();
            loginp.clickSibmitbutton();
            useHomePage.verifyUserWelcomPageDisplayed();
            useHomePage.profileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickPersonalDetailsButton();
            personalDetailsPage.verifyPersonalDetsilapagedisplayed();
            personalDetailsPage.selectGender(data.get("gender"));
            personalDetailsPage.fillDateOfBirth(data.get("date.of.birth"));
            personalDetailsPage.fillAadharNumberText(data.get("Aadharnumber"));
            personalDetailsPage.fillPANNumber(data.get("PANnumber"));
            personalDetailsPage.selectDoYouHavePassport(data.get("Have passport"));
            if (data.get("Have passport").equalsIgnoreCase("yes")) {
                personalDetailsPage.passportNumber(data.get("passportnumber"));
                personalDetailsPage.passportStatus(data.get("passportstatus"));
                personalDetailsPage.passportExperydate(data.get("passportExperydate"));
                personalDetailsPage.selectDoYouHaveVisa(data.get("have visa"));
                if (data.get("have visa").equalsIgnoreCase("yes")) {
                    personalDetailsPage.visaNumber(data.get("visa number"));
                    personalDetailsPage.visaStatus(data.get("visa status"));
                    personalDetailsPage.visaExperdDate(data.get("visa experydate"));
                }
            }
            personalDetailsPage.enterAddress(data.get("address"));
            personalDetailsPage.enterCity(data.get("city"));
            personalDetailsPage.enterStata(data.get("state"));
            personalDetailsPage.enterPinCode(data.get("Pincode"));
            Thread.sleep(8000);
            personalDetailsPage.attactAadharFile(data.get("Aadharfile"));
            Thread.sleep(5000);
            personalDetailsPage.attachPanFile(data.get("Pan file"));
            Thread.sleep(4000);
            personalDetailsPage.attachResumePdf(data.get("Resume pdf"));

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }

    @Test
    @Parameters({"strParams"})
    public void userAddPersonalDetailsWithInvalidDetails(String strParams) {
        try {
            Map<String, String> data = Runner.getKeywordParameters(strParams);

            loginp.verifyLoginPageDiaplsyed();
            loginp.fillEmailText(data.get("email"));
            loginp.fillPasswordText(data.get("password"));
            loginp.clickShowPasswordIcon();
            loginp.clickSibmitbutton();
            useHomePage.verifyUserWelcomPageDisplayed();
            useHomePage.profileIcon();
            profile.verifyProfilePageDisplayed();
            profile.clickPersonalDetailsButton();
            personalDetailsPage.verifyPersonalDetsilapagedisplayed();
            personalDetailsPage.selectGender(data.get("gender"));
            personalDetailsPage.fillDateOfBirth(data.get("date.of.birth"));
            personalDetailsPage.fillAadharNumberText(data.get("Aadharnumber"));
            personalDetailsPage.fillPANNumber(data.get("PANnumber"));
            personalDetailsPage.selectDoYouHavePassport(data.get("Have passport"));
            if (data.get("Have passport").equalsIgnoreCase("yes")) {
                personalDetailsPage.passportNumber(data.get("passportnumber"));
                personalDetailsPage.passportStatus(data.get("passportstatus"));
                personalDetailsPage.passportExperydate(data.get("passportExperydate"));
                personalDetailsPage.selectDoYouHaveVisa(data.get("have visa"));
                if (data.get("have visa").equalsIgnoreCase("yes")) {
                    personalDetailsPage.visaNumber(data.get("visa number"));
                    personalDetailsPage.visaStatus(data.get("visa status"));
                    personalDetailsPage.visaExperdDate(data.get("visa experydate"));
                }
            }

            personalDetailsPage.enterAddress(data.get("address"));
            personalDetailsPage.enterCity(data.get("city"));
            personalDetailsPage.enterStata(data.get("state"));
            personalDetailsPage.enterPinCode(data.get("Pincode"));
            personalDetailsPage.textErrorMsg();

        } catch (Exception e) {
            ExtentTestManager.setFailMessageInReport("Failed to reset password with invalid email");
        }
    }
}

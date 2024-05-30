package modelPages;

import jdk.dynalink.linker.LinkerServices;
import oniesoft.WebFramework.BrowserFunctions;
import oniesoft.api.reporting.ExtentTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PersonalDetailsPage extends BrowserFunctions {
    By verifypersonaldetailspagedisplayed = By.xpath("//h2[contains(text(),'Pers')]");
    By name1 = By.xpath("//input[@name='name']");
    By mobile = By.xpath("//input[@name='mob']");
    By gender = By.xpath("//select[@name='gender']");
    By Dateofbirth = By.xpath("//input[@name='date']");
    By adharno = By.xpath("//input[@name='adhar']");
    By pannumb = By.xpath("//input[@name='pan']");
    By paasport = By.xpath("//select[@name='val1']");
    By passportno = By.name("passportnumber");
    By passportstatus = By.name("status1");
    By passportexpdate = By.name("exp1");
    By Visa = By.xpath("//select[@name='val2']");
    By visano = By.name("visanumber");
    By visastatus = By.name("status2");
    By visaexpdate = By.name("exp2");
    By address = By.xpath("//input[@name='adress']");
    By city = By.xpath("//input[@name='city']");
    By State = By.xpath("//input[@name='state']");
    By pincode = By.xpath("//input[@name='pinnumber']");
    By aadharfile = By.xpath("//input[@name='aadharFile']");
    By panfile = By.name("panFile");
    By resumefile = By.name("otherFile");
    By passportfile = By.name("passportFile");
    By visafile = By.name("visaFile");
    By errortext = By.xpath("//div[@class='text-danger']");


    public void verifyPersonalDetsilapagedisplayed() {
        verifyElementDisplayed(verifypersonaldetailspagedisplayed, "page displayd");
        ExtentTestManager.setInfoMessageInReport(getText(verifypersonaldetailspagedisplayed, "page name"));
    }

    public void selectGender(String gendr) {
        selectDropdown(gender, gendr, "selected gender");
    }

    public void getGenderText() {
        ExtentTestManager.setInfoMessageInReport(getText(gender, "text"));
    }

    public void fillDateOfBirth(String dateofbith) {
        enterText(Dateofbirth, dateofbith, "entered date of birth");
    }

    public void fillAadharNumberText(String aadharno) {
        enterText(adharno, aadharno, "entered Aadhar number");
    }

    public void fillPANNumber(String pan) {
        enterText(pannumb, pan, "entered pan number");
    }

    public void selectDoYouHavePassport(String havepass) {
        selectDropdown(paasport, havepass, "selected passport dropdown");
    }

    public void passportNumber(String passprtno) {
        enterText(passportno, passprtno, "entered passport number");
    }

    public void passportStatus(String passprtstatus) {
        enterText(passportstatus, passprtstatus, "entered passport status");
    }

    public void passportExperydate(String passprtexpdate) {
        enterText(passportexpdate, passprtexpdate, "entered passport expery date");
    }

    public void selectDoYouHaveVisa(String haveVisa) {
        selectDropdown(Visa, haveVisa, "selected visa dropdown");
    }

    public void visaNumber(String visanumber) {
        enterText(visano, visanumber, "entered visa number");
    }

    public void visaStatus(String visstatus) {
        enterText(visastatus, visstatus, "entered visa status");
    }

    public void visaExperdDate(String visexpdate) {
        enterText(visaexpdate, visexpdate, "entered visa experid date");
    }

    public void enterAddress(String addre) {
        enterText(address, addre, "entered address");
    }

    public void enterCity(String cty) {
        enterText(city, cty, "entered city ");
    }

    public void enterStata(String stat) {
        enterText(State, stat, "entered state");
    }

    public void enterPinCode(String pincod) {
        enterText(pincode, pincod, "enteed pin code");
    }

    public void attactAadharFile(String aadharfilename) {

        //  click(aadharfile,"click element aahar file");
        enterText(aadharfile, aadharfilename, "send file name");
    }

    public void textErrorMsg() {
        List<WebElement> names = getElementsList(errortext, "List ");
        for (WebElement text : names) {
            String name = text.getText();
            ExtentTestManager.setInfoMessageInReport("error message " + name);
        }

    }

    public void attachPanFile(String panfle) {
        enterText(panfile, panfle, "attached pan file");
    }

    public void attachResumePdf(String resumfile) {
        enterText(resumefile, resumfile, "attached resume file");
    }

    public void attachPassPortFile(String passfile) {
        enterText(passportfile, passfile, "attached passport file");
    }

    public void attachViasFile(String visafil) {
        enterText(visafile, visafil, "attached visa file");
    }

}

package tests;

import constants.Urls;
import handlers.UtilsHandler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.SignupPage;
import pages.SuccessSignUpPage;
import java.util.concurrent.TimeUnit;

public class TestSignup extends TestBase {
    SignupPage signupPage;
    SuccessSignUpPage successSignUpPage;
    UtilsHandler utilsHandler;

    public TestSignup() {
        super(Urls.signup);
        this.signupPage = new SignupPage(this.chromeDriver);
        this.successSignUpPage = new SuccessSignUpPage(chromeDriver);
        this.utilsHandler = new UtilsHandler();
    }

    @Before
    public void setup() {
        this.chromeDriver.get(Urls.signup);
    }

    @Test
    public void signUp()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(32));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

    @Test
    public void signUp_1CharacterInFirstName() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(1));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());

    }

    @Test
    public void signUp_2CharactersInFirstName() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(2));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

    @Test
    public void signUp_EmptyFirstNameInput()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(0));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "First Name must be between 1 and 32 characters!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUp_33CharactersFirstNameInput() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(33));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "First Name must be between 1 and 32 characters!", this.signupPage.getWarningMessage());

    }

    @Test
    public void signUp_EmptyEmailField() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(7));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(" ");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());

    }

    @Test
    public void signUpInvalidMail_onlyUsername()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("username");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidEmail_withoutSymbol()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("username.gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidMail_withoutMailServer()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("username@aa.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidMail_gapsInStructure() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("user name@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void singUpInvalidMail_withoutDot() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("username@gmailcom ");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }
    @Test
    public void singUpInvalidMail_withCapitalLetters()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("USERNAME@GMAIL.COM");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }
    @Test
    public void singUpInvalidMail_withDuplicatedMail() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput("demo3@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Error: E-Mail Address is already registered!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_3CharactersInAddress() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_128CharactersInAddress()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(128));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_2CharactersInAddress()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(2));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);;
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_129CharactersInAddress()  {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(129));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }


    @Test
    public void singUp_EmptyAddress() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(0));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_NoRegionSelected() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput(" ");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(6));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Please select a region / state!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_3charactersZIPCode() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(3));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_10charactersZIPCode() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(10));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_2CharactersZIPCode() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(2));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Zip/postal code must be between 3 and 10 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_11CharactersZIPCode() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(11));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Zip/postal code must be between 3 and 10 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_NoCharacterZIPCode() {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setEmailInput(this.utilsHandler.getRandomeEmail);
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCountryInput("Romania");
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getRandomNumber(0));
        this.signupPage.setLoginNameInput(this.utilsHandler.getAlphaNumericValue(8));
        this.signupPage.setPasswordInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setPasswordConfirmInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        chromeDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Assert.assertEquals("×\n" +
                "Zip/postal code must be between 3 and 10 characters!", this.signupPage.getWarningMessage());
    }

}

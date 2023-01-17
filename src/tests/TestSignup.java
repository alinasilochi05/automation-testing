package tests;

import constants.Urls;
import handlers.UtilsHandler;
import org.junit.Assert;
import org.junit.Before;
import org.testng.annotations.Test;
import pages.SignupPage;
import pages.SuccessSignUpPage;

public class TestSignup extends TestBase {
    SignupPage signupPage;
    SuccessSignUpPage successSignUpPage;
    UtilsHandler utilsHandler;

    public TestSignup() {
        super(Urls.signup, true, true);
        this.signupPage = new SignupPage(this.chromeDriver);
        this.successSignUpPage = new SuccessSignUpPage(chromeDriver);
        this.utilsHandler = new UtilsHandler();
    }

    @Before
    public void setup() {
        this.chromeDriver.get(Urls.signup);
    }

    @Test
    public void signUp() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(32));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("gloria1225@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(500);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("gloria02");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

    @Test
    public void signUp_1CharacterInFirstName() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(1));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(500);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo1");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());

    }

    @Test
    public void signUp_2CharactersInFirstName() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(2));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo3@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(500);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo3");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

    @Test
    public void signUp_EmptyFirstNameInput() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(0));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo4@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo4");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "First Name must be between 1 and 32 characters!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUp_33CharactersFirstNameInput() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(33));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo6@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo6");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "First Name must be between 1 and 32 characters!", this.signupPage.getWarningMessage());

    }

    @Test
    public void signUp_EmptyEmailField() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(32));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput(" ");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo7");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());

    }

    @Test
    public void signUpInvalidMail_onlyUsername() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput(this.utilsHandler.getStringWithLength(5));
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidEmail_withoutSymbol() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("abcd gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidMail_withoutMailServer() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("abcd@a.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void signUpInvalidMail_gapsInStructure() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("ab cd@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }

    @Test
    public void singUpInvalidMail_withoutDot() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("abcd@gmailcom");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }
    @Test
    public void singUpInvalidMail_withCapitalLetters() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("ABCD@gmailcom");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Email Address does not appear to be valid!", this.signupPage.getWarningMessage());
    }
    @Test
    public void singUpInvalidMail_withDuplicatedMail() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("gloria1225@gmail.com");
        this.signupPage.setAddressInput("Calea abc 22");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo8");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Error: E-Mail Address is already registered!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_3CharactersInAddress() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo10@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo10");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_128CharactersInAddress() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo13@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(128));
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo13");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }
    @Test
    public void signUp_2CharactersInAddress() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo16@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(2));
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo16");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_129CharactersInAddress() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(129));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo15@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(128));
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo15");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }


    @Test
    public void singUp_EmptyAddress() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo9@gmail.com");
        this.signupPage.setAddressInput(" ");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo9");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Address 1 must be between 3 and 128 characters!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_NoRegionSelected() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo18@gmail.com");
        this.signupPage.setAddressInput("Romania");
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("");
        this.signupPage.setZipCodeInput("123456");
        this.signupPage.setLoginNameInput("demo18");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("×\n" +
                "Please select a region / state!", this.signupPage.getWarningMessage());
    }
    @Test
    public void signUp_3charactersZIPCode() throws InterruptedException {
        this.signupPage.setFirstNameInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setLastNameInput("Amara");
        this.signupPage.setEmailInput("demo20@gmail.com");
        this.signupPage.setAddressInput(this.utilsHandler.getStringWithLength(8));
        this.signupPage.setCityInput("Timisoara");
        this.signupPage.setCountryInput("Romania");
        Thread.sleep(700);
        this.signupPage.setRegionInput("Timis");
        this.signupPage.setZipCodeInput(this.utilsHandler.getStringWithLength(3));
        this.signupPage.setLoginNameInput("demo20");
        this.signupPage.setPasswordInput("pass");
        this.signupPage.setPasswordConfirmInput("pass");
        this.signupPage.clickPrivacyPolicyCheckBox();
        this.signupPage.clickContinueButton();
        Thread.sleep(500);
        Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!", this.successSignUpPage.getSuccessPageTitle());
    }

}

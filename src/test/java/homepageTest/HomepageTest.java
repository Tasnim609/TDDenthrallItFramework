package homepageTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import pages.HomePage;

public class HomepageTest extends BaseClass {
	@Test
	public void clickLogInFromTollberTest() throws InterruptedException {
		Thread.sleep(5000);
		homePage.clickLogInFromTollber();
//	Thread.sleep(4000);
//	homePage.sendKeysUserId();
//	Thread.sleep(3000);
//	homePage.sendKeysPassWord();
//	Thread.sleep(3000);
//	homePage.clickLogInButton();
//	Thread.sleep(5000);
//	homePage.clickAutomation();
//	Thread.sleep(3000);
//	homePage.clickEnrollNow();
	}

	@Test
	public void clickLogoTest() {
		homePage.clickLogo();
	}

	@Test
	public void SendKeysPasswordTest() {
		homePage.sendKeysPassWord();
	}

	@Test
	public void clickLogInButtonTest() {
		homePage.clickLogInButton();
	}

	@Test(groups = { "regressionTest" })
	public void applicationTest() {
		homePage.applicationOpen();

	}

	@Test

	public void clickAutomationTest() {
		homePage.clickLogInButton();
		homePage.clickAutomation();
	}

	@Test

	public void firstNameValidationTest() {

		homePage.firstNameValidation();
	}

	@Test
	public void lastNameValidationTest() {
		homePage.clickLogInFromTollber();
		homePage.lastNameValidation();
	}

	@Test
	public void OppenApplicationPageandClickSubmitButtonTest() {
		homePage.clickLogInFromTollber();
		homePage.OppenApplicationPageandClickSubmitButton();
	}

	@Test

	public void openApplicationPageClickBackButtonTest() {
		homePage.clickLogInFromTollber();
		homePage.openApplicationPageClickBackButton();
	}

	@Test
	public void openApplicationPageClickCancelButtonTest() {
		homePage.clickLogInFromTollber();
		homePage.openApplicationPageClickCancelButton();
	}

	@Test
	public void imValidationTest() {
		homePage.imValidation();
	}

	@Test
	public void verifyCourseWishToEnrollITest() {
		homePage.verifyCourseWishToEnroll();
	}

	@Test
	public void verifyPhoneNumberTest() {
		homePage.verifyPhoneNumber();
	}

	@Test

	public void verifyPasswordTest() {
		homePage.verifyPassword();
	}

	@Test
	public void personalImageAndPhotoIdValidationTest() {
		homePage.personalImageAndPhotoIdValidation();
	}

	@Test
	public void enrollmentPageErrorMassaTest() {
		homePage.clickLogInFromTollber();
		homePage.enrollmentPageErrorMassa();
	}
}
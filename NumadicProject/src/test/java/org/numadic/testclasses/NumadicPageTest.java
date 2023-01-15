package org.taxblock.testclasses;

import org.mockito.internal.matchers.NotNull;
import org.numadic.base.TestBase;
import org.numadic.pages.NumadicPage;
import org.numadic.util.TestListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class) //We should tell this class we have implemented listener

public class NumadicPageTest extends TestBase{
	NumadicPage numadicpage;

	@BeforeMethod
	public void setup() {

		initialization();
		numadicpage=new NumadicPage();

	}

	@Test
	public void verifyHeaderTextTest() {

		String expTitle="JOIN OUR CREW";
		System.out.println("Expected Header Title -> " + expTitle);
		String actTitle = numadicpage.verifyHeaderText();
		System.out.println("Actual Header Title -> " + actTitle);

		Assert.assertEquals(actTitle, expTitle,"Header Title Mismatched");

	}


	@Test
	public void verifyFilterDropdownSelectsValueTest() throws InterruptedException {

		String expResult="Engineering";
		String actResult=numadicpage.verifyFilterDropdownSelectsValue();
		Assert.assertEquals(actResult, expResult);
	}


	@Test
	public void verifyFilterDropdownShouldntSelectsMultipleValuesTest() throws InterruptedException {

		numadicpage.verifyFilterDropdownShouldntSelectsMultipleValues();

	}



	
	@Test
	public void verifyCliclOnQAEngineerTabTest() throws InterruptedException  {

		numadicpage.verifyCliclOnQAEngineerTab();

	}

	
	@Test
	public void verifyPageTitleTest() {

		String expTitle="Numadic Iot Pvt. Ltd. - QA Engineer in";
		System.out.println("Expected Page Title -> " + expTitle);
		String actTitle = numadicpage.verifyPageTitle();
		System.out.println("Actual Page Title -> " + actTitle);

		Assert.assertEquals(actTitle, expTitle,"Page Title Mismatched");

	}

	
	@Test()
	public void verifyIminterestedButtonIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyIminterestedButtonIsEnabled();
		Assert.assertTrue(actResult, "Im interested Button is NOT Enabled");

	}


	@Test
	public void verifyClickOnIminterestedButtonTest() throws InterruptedException {

		numadicpage.verifyClickOnIminterestedButton();

	}

	
	@Test
	public void verifyUploadResumeTest() throws InterruptedException {


		String expResult="Resume parsed successfully. Carefully review your information before submitting the application.";   
		String actResult=numadicpage.uploadResume();
		Assert.assertEquals(actResult, expResult);
		System.out.println("Resume Uploaded Successfully");

	}


	//Fields After Resume Upload

	@Test
	public void verifySalutationDropdownSelectsValueTest() throws InterruptedException  {

		String expResult="Mr.";
		String actResult=numadicpage.verifySalutationDropdownSelectsValue();
		Assert.assertEquals(actResult, expResult);
		System.out.println("Salutation dropdown selects only one value ");
	}


	@Test
	public void verifySalutationDropdownShouldntSelectsMultipleValuesTest() throws InterruptedException {

		numadicpage.verifySalutationDropdownShouldntSelectsMultipleValues();

	}

	@Test
	public void verifySalutationDropdownShouldntBlankTest() throws InterruptedException {

		numadicpage.verifySalutationDropdownShouldntBlank();

	}


	//First Name====================================

	@Test
	public void verifyFirstNameLabelSpellingTest() throws InterruptedException {

		String expResult = "First Name";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyFirstNameLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	@Test()
	public void verifyFirstNameIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyFirstNameIsEnabled();
		Assert.assertTrue(actResult, "First Name is NOT Enabled");

	}
	@Test
	public void verifyFirstNameTakesUserInputTest() throws InterruptedException {

		String expResult ="Rahul";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyFirstNameTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifyFirstNameShouldntAcceptNumbersTest() throws InterruptedException {

		String expResult = "";
		String TestData="12345";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyFirstNameShouldntAcceptNumbers(TestData);
		Assert.assertEquals(actResult,expResult);	
		System.out.println("First Name Field Shouldnt Accept Numbers");
	}


	@Test
	public void verifyFirstNameShouldntAcceptSpecialCharTest() throws InterruptedException {

		String expResult = "";
		String TestData="!@#$%^&*()";
		System.out.println("Expected Result is: " + expResult);
		String actResult=numadicpage.verifyFirstNameShouldntAcceptSpecialChar(TestData);
		Assert.assertEquals(actResult,expResult);
		System.out.println("First Name Field Shouldnt Accept Special Characters");
	}


	@Test
	public void verifySystemShowsErrorIfFieldEmptyTest() throws InterruptedException {


		String expResult="First Name cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}


	//Last Name

	@Test
	public void verifyLastNameLabelSpellingTest() throws InterruptedException {

		String expResult = "Last Name";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyLastNameLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	@Test()
	public void verifyLastNameIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyFirstNameIsEnabled();
		Assert.assertTrue(actResult, "Last Name is NOT Enabled");

	}
	@Test
	public void verifyLastNameTakesUserInputTest() throws InterruptedException {

		String expResult ="Kadam";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyLastNameTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifyLastNameShouldntAcceptNumbersTest() throws InterruptedException {

		String expResult = "";
		String TestData="12345";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyLastNameShouldntAcceptNumbers(TestData);
		Assert.assertEquals(actResult,expResult);	
		System.out.println("Last Name Field Shouldnt Accept Numbers");
	}


	@Test
	public void verifyLastNameShouldntAcceptSpecialCharTest() throws InterruptedException {

		String expResult = "";
		String TestData="!@#$%^&*()";
		System.out.println("Expected Result is: " + expResult);
		String actResult=numadicpage.verifyLastNameShouldntAcceptSpecialChar(TestData);
		Assert.assertEquals(actResult,expResult);
		System.out.println("Last Name Field Shouldnt Accept Special Characters");
	}


	@Test
	public void verifySystemShowsErrorIfLastNameFieldEmptyTest() throws InterruptedException {


		String expResult="Last Name cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfLastNameFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}

	//Email Field

	@Test()
	public void verifyEmailIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyEmailIsEnabled();
		Assert.assertTrue(actResult, "Email is NOT Enabled");

	}

	@Test
	public void verifyEmailTakesUserInputTest() throws InterruptedException {

		String expResult ="rahulkadam1618@gmail.com";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyEmailTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifySystemShowsErrorIfEmailFieldEmptyTest() throws InterruptedException {


		String expResult="Email cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfEmailFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}

	@Test
	public void verifySystemShowsErrorForInvalidEmailFormatTest() throws InterruptedException {


		String testData="rahulkadam.comdfsdfs";
		boolean actResult=numadicpage.verifySystemShowsErrorForInvalidEmailFormat(testData);
		Assert.assertTrue(actResult, "Please enter a valid Email.");	
	}


	//Mobile Number=======================================================================

	@Test()
	public void verifyMobileNoIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyMobileNoIsEnabled();
		Assert.assertTrue(actResult, "Mobile No is NOT Enabled");

	}

	@Test
	public void verifyMobileNoTakesUserInputTest() throws InterruptedException {

		String expResult ="9552585100";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyMobileNoTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifyMobileNoDoesntAcceptCharAndSpecialCharTest() throws InterruptedException {

		String expResult = "";
		String TestData="abcd!@#$%^&*()";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyMobileNoShouldntAcceptCharAndSpecialChar(TestData);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifyMobileNoAcceptsOnly10DigitsTest() throws InterruptedException {


		String testData="99999999995555";
		int  expResult = 10;
		System.out.println("Expected Result is: " + expResult);

		int actResult= numadicpage.verifyMobileNoAcceptsOnly10Digits(testData);
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifySystemShowsErrorIfMobileNoIsLessThan10DigitsTest() throws InterruptedException {


		String testData="995955";
		boolean actResult=numadicpage.verifySystemShowsErrorIfMobileNoIsLessThan10Digits(testData);
		Assert.assertTrue(actResult, "System Doesn't Show any Error for Mobile No Less than 10 Digits");	
	}	

	@Test
	public void verifyMobielNoLabelSpellingTest() throws InterruptedException {

		String expResult = "Mobile";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyMobielNoLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifySystemShowsErrorIfMobielNoFieldEmptyTest() throws InterruptedException {


		String expResult="Mobile cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfMobielNoFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}

	//Street=========================================================================
	@Test()
	public void verifyStreetIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyStreetIsEnabled();
		Assert.assertTrue(actResult, "Street is NOT Enabled");

	}

	@Test
	public void verifyStreetTakesUserInputTest() throws InterruptedException {

		String expResult ="Sinhgad Institute road";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyStreetTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifyStreetLabelSpellingTest() throws InterruptedException {

		String expResult = "Street";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyStreetLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	//City=========================================================================
	@Test()
	public void verifyCityIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyCityIsEnabled();
		Assert.assertTrue(actResult, "Street is NOT Enabled");

	}

	@Test
	public void verifyCityTakesUserInputTest() throws InterruptedException {

		String expResult ="Pune";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCityTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifyCityLabelSpellingTest() throws InterruptedException {

		String expResult = "City";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCityLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}


	//State or Province=========================================================================
	@Test()
	public void verifyStateOrProvinceIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyStateOrProvinceIsEnabled();
		Assert.assertTrue(actResult, "StateOrProvince is NOT Enabled");

	}

	@Test
	public void verifyStateOrProvinceTakesUserInputTest() throws InterruptedException {

		String expResult ="Maharashtra";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyStateOrProvinceTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifyStateOrProvinceLabelSpellingTest() throws InterruptedException {

		String expResult = "State/Province";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyStateOrProvinceLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifyStateOrProvinceShouldntAcceptNumbersTest() throws InterruptedException {

		String expResult = "";
		String TestData="12345";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyStateOrProvinceShouldntAcceptNumbers(TestData);
		Assert.assertEquals(actResult,expResult);	
		System.out.println("StateOrProvince Field Shouldnt Accept Numbers");
	}


	@Test
	public void verifyStateOrProvinceShouldntAcceptSpecialCharTest() throws InterruptedException {

		String expResult = "";
		String TestData="#$%^&*()";
		System.out.println("Expected Result is: " + expResult);
		String actResult=numadicpage.verifyStateOrProvinceShouldntAcceptSpecialChar(TestData);
		Assert.assertEquals(actResult,expResult);
		System.out.println("StateOrProvince Field Shouldnt Accept Special Characters");
	}		



	@Test()
	public void verifyZIPOrPostalIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyZIPOrPostalIsEnabled();
		Assert.assertTrue(actResult, "ZIPOrPostal is NOT Enabled");

	}

	@Test
	public void verifyZIPOrPostalTakesUserInputTest() throws InterruptedException {

		String expResult ="411046";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyZIPOrPostalTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}			



	@Test
	public void verifyZIPOrPostalShouldntAcceptCharacterTest() throws InterruptedException {

		String expResult = "";
		String TestData="wqwrqwr";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyZIPOrPostalShouldntAcceptCharacter(TestData);
		Assert.assertEquals(actResult,expResult);	
		System.out.println("ZIPOrPostal Field should not accept characters");
	}


	@Test
	public void verifyZIPOrPostalAcceptsOnly6DigitsTest() throws InterruptedException {


		String testData="41104600000";
		int  expResult = 6;
		System.out.println("Expected Result is: " + expResult);

		int actResult= numadicpage.verifyZIPOrPostalAcceptsOnly6Digits(testData);
		Assert.assertEquals(actResult,expResult);		
	}


	//Country=============================================
	@Test
	public void verifyCountryLabelSpellingTest() throws InterruptedException {

		String expResult = "Country";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCountryLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	@Test()
	public void verifyCountryIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyCountryIsEnabled();
		Assert.assertTrue(actResult, "Country is NOT Enabled");

	}
	@Test
	public void verifyCountryTakesUserInputTest() throws InterruptedException {

		String expResult ="India";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCountryTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}

	@Test
	public void verifyCountryShouldntAcceptNumbersTest() throws InterruptedException {

		String expResult = "";
		String TestData="54345";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCountryShouldntAcceptNumbers(TestData);
		Assert.assertEquals(actResult,expResult);	
		System.out.println("Country Field Shouldnt Accept Numbers");
	}


	@Test
	public void verifyCountryShouldntAcceptSpecialCharTest() throws InterruptedException {

		String expResult = "";
		String TestData="%%$$$%^&*()";
		System.out.println("Expected Result is: " + expResult);
		String actResult=numadicpage.verifyCountryShouldntAcceptSpecialChar(TestData);
		Assert.assertEquals(actResult,expResult);
		System.out.println("Country Field Shouldnt Accept Special Characters");
	}


	//Current Employer=============================

	@Test
	public void verifyCurrentEmployerLabelSpellingTest() throws InterruptedException {

		String expResult = "Current Employer";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCurrentEmployerLabelSpelling();
		Assert.assertEquals(actResult,expResult);		
	}

	@Test()
	public void verifyCurrentEmployerIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyCurrentEmployerIsEnabled();
		Assert.assertTrue(actResult, "Current Employer is NOT Enabled");

	}
	@Test
	public void verifyCurrentEmployerTakesUserInputTest() throws InterruptedException {

		String expResult ="Taxblock India Pvt. Ltd, Pune";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCurrentEmployerTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}


	@Test
	public void verifySystemShowsErrorIfCurrentEmployerFieldEmptyTest() throws InterruptedException {


		String expResult="Current Employer cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfCurrentEmployerFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}

	//Current Job Title==================================================

	@Test
	public void verifyCurrentJobTitleDropdownSelectsValueTest() throws InterruptedException  {

		String expResult="Fresher";
		String actResult=numadicpage.verifyCurrentJobTitleDropdownSelectsValue();
		Assert.assertEquals(actResult, expResult);
		System.out.println("Current Job Title dropdown selects only one value ");
	}


	@Test
	public void verifyCurrentJobTitleDropdownShouldntSelectsMultipleValuesTest() throws InterruptedException {

		numadicpage.verifyCurrentJobTitleDropdownShouldntSelectsMultipleValues();

	}

	@Test
	public void verifyCurrentJobTitleDropdownShouldntBlankTest() throws InterruptedException  {

		String expResult="Current Job Title cannot be empty.";
		String actResult=numadicpage.verifyCurrentJobTitleDropdownShouldntBlank();
		Assert.assertEquals(actResult, expResult);
		System.out.println("Current Job Title dropdown Should not Blank ");
	}


	//Add Skills===========================================
	@Test()
	public void verifyAddSkillsIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyAddSkillsIsEnabled();
		Assert.assertTrue(actResult, "Add Skills is NOT Enabled");

	}
	@Test
	public void verifyAddSkillsTakesUserInputTest() throws InterruptedException {

		String expResult ="Automation Testing";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyAddSkillsTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}

	//Current CTC===========================================
	@Test()
	public void verifyCurrentCTCIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyCurrentCTCIsEnabled();
		Assert.assertTrue(actResult, "CurrentCTC is NOT Enabled");

	}
	@Test
	public void verifyCurrentCTCTakesUserInputTest() throws InterruptedException {

		String expResult ="6.2LPA";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyCurrentCTCTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}			


	@Test
	public void verifySystemShowsErrorIfCurrentCTCFieldEmptyTest() throws InterruptedException {


		String expResult="Current CTC cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfCurrentCTCEmpty();
		Assert.assertEquals(actResult, expResult);

	}	


	//Expected CTC===========================================
	@Test()
	public void verifyExpectedCTCIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyExpectedCTCIsEnabled();
		Assert.assertTrue(actResult, "Expected is NOT Enabled");

	}
	@Test
	public void verifyExpectedCTCTakesUserInputTest() throws InterruptedException {

		String expResult ="8LPA";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyExpectedCTCTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}			


	@Test
	public void verifySystemShowsErrorIfExpectedCTCFieldEmptyTest() throws InterruptedException {


		String expResult="Expected CTC cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfExpectedCTCEmpty();
		Assert.assertEquals(actResult, expResult);

	}			


	//Notice Period===========================================
	@Test()
	public void verifyNoticePeriodIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyNoticePeriodIsEnabled();
		Assert.assertTrue(actResult, "NoticePeriod is NOT Enabled");

	}
	@Test
	public void verifyNoticePeriodTakesUserInputTest() throws InterruptedException {

		String expResult ="15 Days";
		System.out.println("Expected Result is: " + expResult);
		String actResult= numadicpage.verifyNoticePeriodTakesUserInput(expResult);
		Assert.assertEquals(actResult,expResult);		
	}			


	@Test
	public void verifySystemShowsErrorIfNoticePeriodFieldisEmptyTest() throws InterruptedException {


		numadicpage.verifySystemShowsErrorIfNoticePeriodEmpty();

	}	

	//Cancel Button
	@Test()
	public void verifyCancelButtonIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifyCancelButtonIsEnabled();
		Assert.assertTrue(actResult, "Cancel Button is NOT Enabled");

	}			

	//Submit Application Button=======================

	@Test()
	public void verifySubmitButtonIsEnabledTest() throws InterruptedException {

		boolean actResult=numadicpage.verifySubmitButtonIsEnabled();
		Assert.assertTrue(actResult, "Submit Application Button is NOT Enabled");

	}						

	@Test
	public void verifySystemShowsErrorIfNoticePeriodFieldEmptyTest() throws InterruptedException  {


		String expResult="Notice Period (days) cannot be empty.";   
		String actResult=numadicpage.verifySystemShowsErrorIfNoticePeriodFieldEmpty();
		Assert.assertEquals(actResult, expResult);

	}	



	@AfterMethod
	public void tearDown() {

		numadicpage=null;
		driver.quit();
		System.gc();	
	}
}

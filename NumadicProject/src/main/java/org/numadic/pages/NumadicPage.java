package org.taxblock.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.numadic.base.TestBase;
import org.testng.Assert;


public class NumadicPage extends TestBase {
	
	// Page Factory (Object Repository) ->
	
    @FindBy(xpath="//*[text()='JOIN OUR CREW']")
       WebElement headerText;
    
    @FindBy(xpath="//*[@class=\"lyteMarginRight lyteDropdownLabel\"]")
       WebElement filterDropdown;
    
    @FindBy(xpath="(//a[@class=\"cw-1-title\"])[1]")
    WebElement QAEngineer;
    
    @FindBy(xpath="(//button[@type=\"button\"])[2]")
    WebElement iaminterestedButton ;
    
    @FindBy(xpath="//a[text()='Upload your resume']")
    WebElement uploadResume;
    
    @FindBy(xpath="//input[@class=\"fileuploadInput \"]")
    WebElement inputResume;
    
    @FindBy(xpath="//div[@class=\"crc-resume-progress disN\"]")
    WebElement msgResumeUpload;
    
    @FindBy(xpath="(//span[@class=\"lyteDropPlaceholderNormal\"])[1]")
    WebElement salutationDropdown;
    
    @FindBy(xpath="(//a[text()='Clear'])[1]")
    WebElement clear;
    
    @FindBy(xpath="//*[text()='First Name']")
    WebElement firstNameLabel ;
    @FindBy(xpath="(//input[@type=\"text\"])[1]")
    WebElement firstName;
    @FindBy(xpath="//span[@data-zcqa=\"First_NameError\"]")
    WebElement firstNameError;
    
    @FindBy(xpath="//*[text()='Last Name']")
    WebElement lastNameLabel ;
    @FindBy(xpath="(//input[@type=\"text\"])[2]")
    WebElement lastName;
    @FindBy(xpath="//span[@data-zcqa=\"Last_NameError\"]")
    WebElement lastNameError;
    
    @FindBy(xpath="(//input[@type=\"text\"])[3]")
    WebElement email;
    @FindBy(xpath="//span[@data-zcqa=\"EmailError\"]")
    WebElement emailError;
    @FindBy(xpath="//span[@data-zcqa=\"EmailError\"]")
    WebElement invalidEmailError ;
     
    @FindBy(xpath="(//input[@type=\"text\"])[4]")
    WebElement mobileNo;
    @FindBy(xpath="//span[@data-zcqa=\"MobileError\"]")
    WebElement mobileNoError;
    @FindBy(xpath="//label[text()=\"Mobile\"]")
    WebElement mobileLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[5]")
    WebElement street;
    @FindBy(xpath="//label[text()='Street']")
    WebElement streetLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[6]")
    WebElement city;
    @FindBy(xpath="//label[text()='City']")
    WebElement cityLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[7]")
    WebElement stateProvince;
    @FindBy(xpath="//label[text()='State/Province']")
    WebElement stateProvinceLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[8]")
    WebElement zipPostalCode;
    @FindBy(xpath="//label[text()='Zip/Postal Code']")
    WebElement zipPostalCodeLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[9]")
    WebElement country;
    @FindBy(xpath="//label[text()='Country']")
    WebElement countryLabel;
    
    @FindBy(xpath="(//input[@type=\"text\"])[10]")
    WebElement currentEmployer;
    @FindBy(xpath="//label[text()='Current Employer']")
    WebElement currentEmployerLabel;
    @FindBy(xpath="//span[@data-zcqa=\"Current_EmployerError\"]")
    WebElement currentEmployerError;
    
    @FindBy(xpath="//*[@data-zcqa=\"manual_Current_Job_Title\"]")
    WebElement currentJobTitleDD;
    @FindBy(xpath="//span[@data-zcqa=\"Current_Job_TitleError\"]")
    WebElement jobTitleError;
    @FindBy(xpath="(//span[text()='-None-'])[2]")
    WebElement blankJobTitle;
    
    @FindBy(xpath="//input[@id=\"addSkills\"]")
    WebElement addSkills;
    
    @FindBy(xpath="(//input[@type=\"text\"])[12]")
    WebElement currentCTC;
    @FindBy(xpath="//span[@data-zcqa=\"Current_CTCError\"]")
    WebElement currentCTCError;
    
    @FindBy(xpath="(//input[@type=\"text\"])[13]")
    WebElement expectedCTC;
    @FindBy(xpath="//span[@data-zcqa=\"Expected_CTCError\"]")
    WebElement expectedCTCError;
    
    @FindBy(xpath="(//input[@type=\"text\"])[14]")
    WebElement noticePeriod;
    @FindBy(xpath="//span[@data-zcqa=\"Notice_PeriodError\"]")
    WebElement noticePeriodError;
    
    @FindBy(xpath="//button[@type=\"button\"]")
    WebElement cancelButton;
    
    @FindBy(xpath="//button[@type=\"submit\"]")
    WebElement submitApplication;
    
    
      
  //Actions ->	
    
    
    public String verifyHeaderText() {
    	
   	 String headerTitle=headerText.getText();
   	return headerTitle;
     }

    public String verifyFilterDropdownSelectsValue() throws InterruptedException {
    	
    	filterDropdown.click();
    	
    	Thread.sleep(3000);
    	Select filterby=new Select(filterDropdown);
    	filterby.selectByVisibleText("Engineering");
    	String result=filterDropdown.getAttribute("value");
    	System.out.println("You Selected="+result);
        return result;
    	
    }
    
    public void verifyFilterDropdownShouldntSelectsMultipleValues()  {
    	
    	Select filterby=new Select(filterDropdown);
    	    	
    	if(filterby.isMultiple()) {
    		
    		System.out.println("It supports for Select Multiple values from Dropdown");
    	}
    	
    	else {
    		System.out.println("Not Supported for select Multiple Values from Dropdown");
    	}
    	
    	}
    
    
    public void verifyCliclOnQAEngineerTab() throws InterruptedException {
    	
    	
    	Thread.sleep(5000);
    	QAEngineer.click();
    	System.out.println("Clicked on QAEngineer Tab");
    }
    
    
         
   public String verifyPageTitle() {
	
	String pageTitle=driver.getTitle();
	return pageTitle;
}

   public boolean verifyIminterestedButtonIsEnabled() {
		
		boolean result=iaminterestedButton.isEnabled();
		System.out.println("Im interested button is Enabled? Status-> "+ result);
		return result;
		}


   public void verifyClickOnIminterestedButton() throws InterruptedException {
   	
	   iaminterestedButton.click();
   	System.out.println("Clicked on Im interested Button");
   }
   
   public String uploadResume() throws InterruptedException  {
	   	
	   uploadResume.click();
	   Thread.sleep(3000);
	   
	   WebElement selectresume=inputResume;
	   selectresume.sendKeys("C:\\Users\\Dell\\Desktop\\Rahul_QA_SoftwareTestEngg2023.pdf");
	   Thread.sleep(15000);
	   
	   String result=msgResumeUpload.getText();
	   System.out.println(result);
	   return result;
   }
   
   
   //After uploading the Resume all information is parsed in all fields automatically
   //I wrote Test script by click on clear button
   
   public String verifySalutationDropdownSelectsValue() throws InterruptedException {
   	
	   clear.clear();
	   Thread.sleep(2000);
	   salutationDropdown.click();
   	
   	Thread.sleep(3000);
   	Select salut=new Select(salutationDropdown);
   	salut.selectByVisibleText("Mr.");
   	String result=salutationDropdown.getAttribute("value");
   	System.out.println("You Selected="+result);
       return result;
   	
   }
   
   public void verifySalutationDropdownShouldntSelectsMultipleValues()  {
   	
   	Select salut=new Select(salutationDropdown);
   	    	
   	if(salut.isMultiple()) {
   		
   		System.out.println("It supports for Select Multiple values from Dropdown");
   	}
   	
   	else {
   		System.out.println("Not Supported for select Multiple Values from Dropdown");
   	}
   	
   	}  
   
   
   public void verifySalutationDropdownShouldntBlank() throws InterruptedException {
		
	   salutationDropdown.click();
		
		Thread.sleep(3000);
		Select salutetitle=new Select(salutationDropdown);
		salutetitle.selectByVisibleText("-None-");
		Thread.sleep(3000);
		System.out.println("Salutation Should not keep blank");
		
	}
   
   //First Name========================================================================================
   
   
   public String verifyFirstNameLabelSpelling() throws InterruptedException {
		
		String result=firstNameLabel.getText();
		System.out.println("Actual Result is: "+ result);
		return result;

	}
   public boolean verifyFirstNameIsEnabled() throws InterruptedException {
		
		Thread.sleep(2000);
		boolean result=firstName.isEnabled();
		System.out.println("First Name is Enabled? Status-> "+ result);
		return result;

	}
   
   public String verifyFirstNameTakesUserInput(String name) throws InterruptedException {
		
		Thread.sleep(1500);
		firstName.clear();
		
		firstName.sendKeys(name);
		Thread.sleep(2000);
		
		String result=firstName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}
   
   public String verifyFirstNameShouldntAcceptNumbers(String TestData) throws InterruptedException {
		
		Thread.sleep(1500);
		firstName.clear();
		
		firstName.sendKeys(TestData);
		Thread.sleep(2000);
		
		String result=firstName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}
   
   public String verifyFirstNameShouldntAcceptSpecialChar(String TestData) throws InterruptedException {
		
		Thread.sleep(1500);
		firstName.clear();
		
		firstName.sendKeys(TestData);
		Thread.sleep(2000);
		
		String result=firstName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}

   
   public String verifySystemShowsErrorIfFieldEmpty() throws InterruptedException {
		
		Thread.sleep(3000);
		firstName.click();
		
		Thread.sleep(3000);
		String result=firstNameError.getText();
		System.out.println(result);
		return result;
				
		}

   //Last Name===========================================================================================
   
   public String verifyLastNameLabelSpelling() throws InterruptedException {
		
		String result=lastNameLabel.getText();
		System.out.println("Actual Result is: "+ result);
		return result;

	}
  public boolean verifyLastNameIsEnabled() throws InterruptedException {
		
		Thread.sleep(2000);
		boolean result=lastName.isEnabled();
		System.out.println("Last Name is Enabled? Status-> "+ result);
		return result;

	}
  
  public String verifyLastNameTakesUserInput(String name) throws InterruptedException {
		
		Thread.sleep(1500);
		lastName.clear();
		
		lastName.sendKeys(name);
		Thread.sleep(2000);
		
		String result=lastName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}
  
  public String verifyLastNameShouldntAcceptNumbers(String TestData) throws InterruptedException {
		
		Thread.sleep(1500);
		lastName.clear();
		
		lastName.sendKeys(TestData);
		Thread.sleep(2000);
		
		String result=lastName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}
  
  public String verifyLastNameShouldntAcceptSpecialChar(String TestData) throws InterruptedException {
		
		Thread.sleep(1500);
		lastName.clear();
		
		lastName.sendKeys(TestData);
		Thread.sleep(2000);
		
		String result=lastName.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}

  
  public String verifySystemShowsErrorIfLastNameFieldEmpty() throws InterruptedException {
		
		Thread.sleep(3000);
		lastName.click();
		
		Thread.sleep(3000);
		String result=lastNameError.getText();
		System.out.println(result);
		return result;
				
		}
   
 //Email Field==========================================================================================
  
  public boolean verifyEmailIsEnabled() throws InterruptedException {
		
		Thread.sleep(2000);
		boolean result=email.isEnabled();
		System.out.println("Email is Enabled? Status-> "+ result);
		return result;

	}

public String verifyEmailTakesUserInput(String name) throws InterruptedException {
		
		Thread.sleep(1500);
		email.clear();
		
		email.sendKeys(name);
		Thread.sleep(2000);
		
		String result=email.getAttribute("value");
		System.out.println("Actual Result is: "+ result);
		return result;

	}
  
  
public String verifySystemShowsErrorIfEmailFieldEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	email.click();
	
	Thread.sleep(3000);
	String result=emailError.getText();
	System.out.println(result);
	return result;
			
	}
  
public boolean verifySystemShowsErrorForInvalidEmailFormat(String testData) throws InterruptedException {

	Thread.sleep(1500);
	email.clear();
	
	email.sendKeys(testData);
	Thread.sleep(2000);
	
	boolean result=invalidEmailError.isDisplayed();
	System.out.println("Invalid Email Error Message is Displayed Status-> "+ result);
	return result;

}
  
   
//Mobile Number===============================================================================

public boolean verifyMobileNoIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=mobileNo.isEnabled();
	System.out.println("Mobile No is Enabled? Status-> "+ result);
	return result;

}

public String verifyMobileNoTakesUserInput(String testData) throws InterruptedException {
	
	Thread.sleep(1500);
	mobileNo.clear();
	
	mobileNo.sendKeys(testData);
	Thread.sleep(2000);
	
	String result=mobileNoError.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}


public String verifyMobileNoShouldntAcceptCharAndSpecialChar(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	mobileNo.clear();
	
	mobileNo.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=mobileNo.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public int verifyMobileNoAcceptsOnly10Digits(String testData) throws InterruptedException {
	
	Thread.sleep(1500);
	mobileNo.clear();
	
	mobileNo.sendKeys(testData);
	Thread.sleep(2000);
	
	String result=mobileNo.getAttribute("value");
	System.out.println("User Entered Mobile No is: "+ testData);
	System.out.println("Accepted Mobile No is: "+ result);
	
	int count=0;
	for(int i=0; i<result.length(); i++) {
		
		count++;
	}
	System.out.println("Actual Result is: "+ count);
	return count;
	
}

public boolean verifySystemShowsErrorIfMobileNoIsLessThan10Digits(String testData) throws InterruptedException {

	Thread.sleep(1500);
	mobileNo.clear();
	
	mobileNo.sendKeys(testData);
	System.out.println("Mobiel No is Less than 10 Digits-> "+ testData);
	Thread.sleep(2000);
	boolean result=false;
	
	try {
		
		result=mobileNoError.isDisplayed();
		System.out.println("Mobile No Error Message is Displayed Status-> "+ result);
		return result;		
		
	}catch(Exception e) {
		
		System.out.println("Mobile No Error Message is Displayed Status-> "+ result);
		return result;
	}
	
}

public String verifyMobielNoLabelSpelling() throws InterruptedException {
	
	String result=mobileLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;
}

public String verifySystemShowsErrorIfMobielNoFieldEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	mobileNo.click();
	
	Thread.sleep(3000);
	String result=mobileNoError.getText();
	System.out.println(result);
	return result;
			
	}

//Street=============================================================================================

public boolean verifyStreetIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=street.isEnabled();
	System.out.println("Street is Enabled? Status-> "+ result);
	return result;

}

public String verifyStreetTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	street.clear();
	
	street.sendKeys(name);
	Thread.sleep(2000);
	
	String result=street.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyStreetLabelSpelling() throws InterruptedException {
	
	String result=streetLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;
}


//City================================================================

public boolean verifyCityIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=city.isEnabled();
	System.out.println("City is Enabled? Status-> "+ result);
	return result;

}

public String verifyCityTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	city.clear();
	
	city.sendKeys(name);
	Thread.sleep(2000);
	
	String result=city.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyCityLabelSpelling() throws InterruptedException {
	
	String result=cityLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;
}

//State or Province================================================================

public boolean verifyStateOrProvinceIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=stateProvince.isEnabled();
	System.out.println("State/Province is Enabled? Status-> "+ result);
	return result;

}

public String verifyStateOrProvinceTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	stateProvince.clear();
	
	stateProvince.sendKeys(name);
	Thread.sleep(2000);
	
	String result=stateProvince.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyStateOrProvinceLabelSpelling() throws InterruptedException {
	
	String result=stateProvinceLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;
}

public String verifyStateOrProvinceShouldntAcceptNumbers(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	stateProvince.clear();
	
	stateProvince.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=stateProvince.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyStateOrProvinceShouldntAcceptSpecialChar(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	stateProvince.clear();
	
	stateProvince.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=stateProvince.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

//ZIP or Postal code========================================================

public boolean verifyZIPOrPostalIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=zipPostalCode.isEnabled();
	System.out.println("ZIP Or Postal is Enabled? Status-> "+ result);
	return result;

}

public String verifyZIPOrPostalTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	zipPostalCode.clear();
	
	zipPostalCode.sendKeys(name);
	Thread.sleep(2000);
	
	String result=zipPostalCode.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyZIPOrPostalShouldntAcceptCharacter(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	zipPostalCode.clear();
	
	zipPostalCode.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=zipPostalCode.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;
}


public int verifyZIPOrPostalAcceptsOnly6Digits(String testData) throws InterruptedException {
	
	Thread.sleep(1500);
	zipPostalCode.clear();
	
	zipPostalCode.sendKeys(testData);
	Thread.sleep(2000);
	
	String result=zipPostalCode.getAttribute("value");
	System.out.println("User Entered ZIPOrPostal is: "+ testData);
	System.out.println("Accepted ZIPOrPostal is: "+ result);
	
	int count=0;
	for(int i=0; i<result.length(); i++) {
		
		count++;
	}
	System.out.println("Actual Result is: "+ count);
	return count;
	
}


//Country============================================================

public String verifyCountryLabelSpelling() throws InterruptedException {
	
	String result=countryLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;

}
public boolean verifyCountryIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=country.isEnabled();
	System.out.println("Country is Enabled? Status-> "+ result);
	return result;

}

public String verifyCountryTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	country.clear();
	
	country.sendKeys(name);
	Thread.sleep(2000);
	
	String result=country.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyCountryShouldntAcceptNumbers(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	country.clear();
	
	country.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=country.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

public String verifyCountryShouldntAcceptSpecialChar(String TestData) throws InterruptedException {
	
	Thread.sleep(1500);
	country.clear();
	
	country.sendKeys(TestData);
	Thread.sleep(2000);
	
	String result=country.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

//Current Employer=====================================

public String verifyCurrentEmployerLabelSpelling() throws InterruptedException {
	
	String result=currentEmployerLabel.getText();
	System.out.println("Actual Result is: "+ result);
	return result;

}
public boolean verifyCurrentEmployerIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=currentEmployer.isEnabled();
	System.out.println("CurrentEmployer is Enabled? Status-> "+ result);
	return result;

}

public String verifyCurrentEmployerTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	currentEmployer.clear();
	
	currentEmployer.sendKeys(name);
	Thread.sleep(2000);
	
	String result=currentEmployer.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}



public String verifySystemShowsErrorIfCurrentEmployerFieldEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	currentEmployer.click();
	
	Thread.sleep(3000);
	String result=currentEmployerError.getText();
	System.out.println(result);
	return result;
			
	}

//Current Job Title Dropdown=========================

public String verifyCurrentJobTitleDropdownSelectsValue() throws InterruptedException {
	
	currentJobTitleDD.click();
	
	Thread.sleep(3000);
	Select jobtitle=new Select(currentJobTitleDD);
	jobtitle.selectByVisibleText("Fresher");
	String result=currentJobTitleDD.getAttribute("value");
	System.out.println("You Selected="+result);
    return result;
	
}

public void verifyCurrentJobTitleDropdownShouldntSelectsMultipleValues()  {
	
	Select jobtitle=new Select(currentJobTitleDD);
	    	
	if(jobtitle.isMultiple()) {
		
		System.out.println("It supports for Select Multiple values from Dropdown");
	}
	
	else {
		System.out.println("Not Supported for select Multiple Values from Dropdown");
	}
	
	}

public String verifyCurrentJobTitleDropdownShouldntBlank() throws InterruptedException {
	
	currentJobTitleDD.click();
	
	Thread.sleep(3000);
	Select jobtitle=new Select(currentJobTitleDD);
	jobtitle.selectByVisibleText("-None-");
	Thread.sleep(3000);
	String result=blankJobTitle.getText();
	System.out.println(result);
    return result;
	
}

//Add Skills=========================================================

public boolean verifyAddSkillsIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=addSkills.isEnabled();
	System.out.println("Add Skills is Enabled? Status-> "+ result);
	return result;

}

public String verifyAddSkillsTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	addSkills.clear();
	
	addSkills.sendKeys(name);
	Thread.sleep(2000);
	
	String result=addSkills.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}

//Current CTC=========================================================

public boolean verifyCurrentCTCIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=currentCTC.isEnabled();
	System.out.println("Current CTC is Enabled? Status-> "+ result);
	return result;

}

public String verifyCurrentCTCTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	currentCTC.clear();
	
	currentCTC.sendKeys(name);
	Thread.sleep(2000);
	
	String result=currentCTC.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}


public String verifySystemShowsErrorIfCurrentCTCEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	currentCTC.click();
	
	Thread.sleep(3000);
	String result=currentCTCError.getText();
	System.out.println(result);
	return result;
			
	}

//Expected CTC=========================================================

public boolean verifyExpectedCTCIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=expectedCTC.isEnabled();
	System.out.println("Expected CTC is Enabled? Status-> "+ result);
	return result;

}

public String verifyExpectedCTCTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	expectedCTC.clear();
	
	expectedCTC.sendKeys(name);
	Thread.sleep(2000);
	
	String result=expectedCTC.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}


public String verifySystemShowsErrorIfExpectedCTCEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	expectedCTC.click();
	
	Thread.sleep(3000);
	String result=expectedCTCError.getText();
	System.out.println(result);
	return result;
			
	}


//Notice Period =========================================================

public boolean verifyNoticePeriodIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=noticePeriod.isEnabled();
	System.out.println("Notice Period is Enabled? Status-> "+ result);
	return result;

}

public String verifyNoticePeriodTakesUserInput(String name) throws InterruptedException {
	
	Thread.sleep(1500);
	noticePeriod.clear();
	
	noticePeriod.sendKeys(name);
	Thread.sleep(2000);
	
	String result=noticePeriod.getAttribute("value");
	System.out.println("Actual Result is: "+ result);
	return result;

}


public void verifySystemShowsErrorIfNoticePeriodEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	
	noticePeriod.clear();
	System.out.println("Notice Period Field should not Keep Blank");
			
	}

//Cancel Button
public boolean verifyCancelButtonIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=cancelButton.isEnabled();
	System.out.println("Cancel Button is Enabled? Status-> "+ result);
	return result;

}

//Submit Aplication Button
public boolean verifySubmitButtonIsEnabled() throws InterruptedException {
	
	Thread.sleep(2000);
	boolean result=submitApplication.isEnabled();
	System.out.println("submit Application Button is Enabled? Status-> "+ result);
	return result;

}

public String verifySystemShowsErrorIfNoticePeriodFieldEmpty() throws InterruptedException {
	
	Thread.sleep(3000);
	submitApplication.click();
	
	Thread.sleep(3000);
	String result=noticePeriodError.getText();
	System.out.println(result);
	return result;
			
	}
//Initializing The Page Objects ->

	public NumadicPage() {
		
		PageFactory.initElements(driver, this);
		
	}
}
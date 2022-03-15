package functions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.BaseTest;

public class ElementPage extends BaseTest{
	
	@Test
	public void checkElementsLabels() throws InterruptedException {
		
		List<WebElement> Icons = elements.getIcons();
		elements.getIcons().get(0).click();
		elements.clickTextBoxTab();
		
		SoftAssert softassert = new SoftAssert();
		
		String actualFullNameLabel = elements.getFullNameLabel().getText();
		String actualEmailLabel    = elements.getEmailIdLabel().getText();
		String actualCurrentAddressLabel= elements.getCurrentAddressLabel().getText();
		String actualPermenentAddressLabel = elements.getPermenentAddressLabel().getText();
		
		String expectedFullNameLabel = "Full Name";
		String expectedEmailLabel = "Email";
		String expectedCurrentAddressLabel = "Current Address";
		String expectedPermenentAddressLabel = "Permanent Address";
		
		softassert.assertEquals(actualFullNameLabel, expectedFullNameLabel);
		softassert.assertEquals(actualEmailLabel, expectedEmailLabel);
		softassert.assertEquals(actualCurrentAddressLabel, expectedCurrentAddressLabel);
		softassert.assertEquals(actualPermenentAddressLabel, expectedPermenentAddressLabel);
		softassert.assertAll();
	}
	
	
	@Test
	public void submitTextBoxElements() {
		List<WebElement> Icons = elements.getIcons();
		elements.getIcons().get(0).click();
		elements.clickTextBoxTab();
		
		elements.getFullName().sendKeys("Test1");
		elements.getEmail().sendKeys("test@gmail.com");
		elements.getCurrentAddress().sendKeys("987,Test Rd,Test");
		elements.getPermenentAddress().sendKeys("TestPerAdd,3242");
		utility.scrolTheScreen();
        elements.submitElementDetails();
	}

	
	 @Test
	 public void checkSubmission() {
		submitTextBoxElements();
		 
		SoftAssert softassert = new SoftAssert();
		 
		String actualSubmittedName =  elements.getSubmittedName().getText();
		String actualSubmittedEmail = elements.getSubmittedEmail().getText();
		String actualSubmittedCurrentAddress = elements.getSubmittedCurrentAddress().getText();
		String actualSubmittedPermenentAddress = elements.getSubmittedPermenentAddress().getText();
		
		String expectedSubmittedName = "Name:Test1";
		String expectedSubmittedEmail = "Email:test@gmail.com";
		String expectedSubmittedCurrentAddress = "Current Address :987,Test Rd,Test";
		String expectedSubmittedPermenentAddress = "Permananet Address :TestPerAdd,3242";
		
		softassert.assertEquals(actualSubmittedName, expectedSubmittedName);
		softassert.assertEquals(actualSubmittedEmail, expectedSubmittedEmail);
		softassert.assertEquals(actualSubmittedCurrentAddress, expectedSubmittedCurrentAddress);
		softassert.assertEquals(actualSubmittedPermenentAddress, expectedSubmittedPermenentAddress);

		softassert.assertAll();
	 }
	 
	 @Test
	 public void clickHomeCheckBoxAndVerifyText() {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			elements.clickCheckBoxTab();	
			elements.clickHome();
			
			String expectedText = "You have selected :" + "\n"+ "home" +  "\n" + "desktop" +  "\n" +  "notes" +  "\n" + "commands" +  "\n" + "documents" +  "\n"  + "workspace" +  "\n" + "react" +  "\n" + "angular" +  "\n" + "veu" +  "\n" + "office" +  "\n" + "public"  + "\n" + "private"  + "\n"  + "classified"  + "\n" + "general" +  "\n"  + "downloads"  +"\n" + "wordFile" +   "\n" + "excelFile";
			String actualText = elements.getHomeVerificationActualText().getText();
			
			System.out.println(actualText);
			
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(expectedText, actualText);
			softassert.assertAll();
	
	 }
	 
	 @Test
	 public  void expanTheListAndSelect()  {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			elements.clickCheckBoxTab();
			elements.clickExpanButton().get(0).click();;
			elements.clickExpanButton().get(1).click();
			elements.clickCheckBox().get(2).click();
			
			SoftAssert softassert = new SoftAssert();
			String expectedText = "You have selected :" +"\n" +"notes";
			String actualText = elements.getCheckBoxText().getText();
			softassert.assertEquals(actualText, expectedText);
			System.out.println(expectedText);
			System.out.println(actualText);
			softassert.assertAll();
	 }
	 
	 @Test
	 public void radioButtonPageCheck() {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
	        elements.clickRadioButtonTab();;
	        elements.getYesRadioButton().get(0).click();
	        
	        String expectedRadioText = "You have selected Yes";
	        String actualRadioText = elements.getRadioText().getText();
	        
	        SoftAssert softassert = new SoftAssert();
	        softassert.assertEquals(actualRadioText, expectedRadioText);
	        softassert.assertAll();	
	 }
	 
	 @Test
	 public void addRecordToWebTable() {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			elements.clickWebTablesTab();
			elements.clickAddButtonWebTablePage();
			String actualTextLabel = elements.getRegistrationBoxLabel().getText();
			String expectedTextLabel = "Registration Form";
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(actualTextLabel, expectedTextLabel);

			
			elements.getFirtsNameRegForm().sendKeys("Name1");
			elements.getLastNameRegForm().sendKeys("Name2");
			elements.getEmail().sendKeys("test@gmail.com");
			elements.getAgeRegForm().sendKeys("23");
			elements.getSalaryRegForm().sendKeys("20000");
			elements.getDeptRegForm().sendKeys("ABCDept");
			
			elements.clickSubmitRegForm();
			
			elements.searchInSearchBoxRegForm().sendKeys("Name1");
			String actualValue = elements.searchFieldInRegForm().get(0).getText();
			String expectedValue = "Name1";
			
			softassert.assertEquals(actualValue, expectedValue);
			softassert.assertAll();	
	 }
	 
	 @Test
	 public void editWebTableRecord() {
		 addRecordToWebTable();
		 elements.clickEditButton();
		 elements.getLastNameRegForm().clear();
		 elements.getLastNameRegForm().sendKeys("NameABC");
		 elements.clickSubmitRegForm();
	 }
	 
	 @Test
	 public void deleteWebTableRecord() {
		 editWebTableRecord();
		 elements.clickDeleteButton();
	 }
	 
	 @Test
	 public void clickAndCheckButtonsInButtonTab() throws InterruptedException  {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			Thread.sleep(2000);
			utility.scrolTheScreen();
			Thread.sleep(2000);
			elements.clickButtonsTab();
	 }
	 
	 
	 @Test
	 public void clickdoubleClickButton() throws InterruptedException  {
		 clickAndCheckButtonsInButtonTab();
		 Actions act = new Actions(driver);
		 WebElement ele = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
		 act.doubleClick(ele).perform();
		 SoftAssert softassert = new SoftAssert();
		 String expectedDoubleClickMessage = "You have done a double click";
		 String actualDoubleClickMessage = elements.doubleClickMessage().getText();
		 softassert.assertEquals(actualDoubleClickMessage, expectedDoubleClickMessage);
		 softassert.assertAll();
		 
	 }
	 
	 @Test
	 public void clickRightClickButton() throws InterruptedException {
		 clickAndCheckButtonsInButtonTab();
		 Actions act = new Actions(driver);
		 WebElement ele = driver.findElement(By.id("rightClickBtn"));
		 act.contextClick(ele).perform();
		 SoftAssert softassert = new SoftAssert();
		 String actualRightClickMessage = elements.rightClickMessage().getText();
		 String expectedRightClickMessage = "You have done a double click";
		 softassert.assertEquals(actualRightClickMessage, expectedRightClickMessage);
		 softassert.assertAll();
		 
		 
	 }
	 
	 @Test
	 public void clickDynamicClickButton() throws InterruptedException {
		 clickAndCheckButtonsInButtonTab();
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//button[@id=\"bWt8q\"]"));
		 act.click(ele).perform();
	 }

	 
	 @Test
	 public void clickLinkOpenTabVerification() throws InterruptedException {
			List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			utility.scrolTheScreen();
		    elements.selectLinksTab().click();
		    elements.clickHomeLink();
		    Thread.sleep(2000);
		    List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(browserTabs .get(1));
            String url = driver.getCurrentUrl();
            System.out.println(url);
		    driver.close();
		    driver.switchTo().window(browserTabs.get(0));
		    String url1 = driver.getCurrentUrl();
            System.out.println(url1);
     }
	 
	 
//	 @Test
//	 public void  checkValidImage() {
//			List<WebElement> Icons = elements.getIcons();
//			elements.getIcons().get(0).click();
//			utility.scrolTheScreen();
//		    elements.selectBrokenLinksTab();
//		    
//		    String s = elements.getImage().get(1).getText();
//		    Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", s);
//	        if (!ImagePresent)
//	        {
//	             System.out.println("Image not displayed.");
//	        }
//	        else
//	        {
//	            System.out.println("Image displayed.");
//	        }
//
//	 }
	 
	 @Test
	 public void verifyDownloadDoc() {
		    List<WebElement> Icons = elements.getIcons();
			elements.getIcons().get(0).click();
			utility.scrolTheScreen();
			elements.clickUploadAndDownload();
	 }
	 
	 
	 
}

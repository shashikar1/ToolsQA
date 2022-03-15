package elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	
	  private WebDriver driver = null;

	    public Elements(WebDriver driver){
	        this.driver = driver;
	    }

	    
	   public List<WebElement> getIcons(){
		   return driver.findElements(By.xpath("//div[@class='card mt-4 top-card']"));
	   }
	   
	   public void clickTextBoxTab() {
		   driver.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
	   }
	   
	   public WebElement getFullNameLabel() {
		   return driver.findElement(By.id("userName-label"));
	   }
	   
	   public WebElement getEmailIdLabel() {
		   return driver.findElement(By.id("userEmail-label"));
	   }
	   
	   public WebElement getCurrentAddressLabel() {
		   return driver.findElement(By.id("currentAddress-label"));
	   }
	   
	   public WebElement getPermenentAddressLabel() {
		   return driver.findElement(By.id("permanentAddress-label"));
	   }
	   
	   public WebElement getFullName() {
		   return driver.findElement(By.id("userName"));
	   }
	   
	   public WebElement getEmail() {
		   return driver.findElement(By.id("userEmail"));
	   }
	   
	   
	   public WebElement getCurrentAddress() {
		   return driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
	   }
	   
	   public WebElement getPermenentAddress() {
		   return driver.findElement(By.id("permanentAddress"));
	   }
	   
	   public void submitElementDetails() {
		   driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	   }
	   
	   public WebElement getSubmittedName() {
		   return driver.findElement(By.xpath("//p[@id=\"name\"]"));
	   }
	   
	   public WebElement getSubmittedEmail() {
		   return driver.findElement(By.xpath("//p[@id=\"email\"]"));
	   }
	   
	   public WebElement getSubmittedCurrentAddress() {
		   return driver.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
	   }
	   
	   public WebElement getSubmittedPermenentAddress() {
		   return driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]"));
	   }
	   
	   public void clickCheckBoxTab() {
		    driver.findElement(By.xpath("//li[@id=\"item-1\"]")).click();
	   }
	   
	   public void clickHome() {
		   driver.findElement(By.xpath("//span[@class=\"rct-checkbox\"]")).click();
	   }
	   
	   public WebElement getHomeVerificationActualText() {
		   return driver.findElement(By.xpath("//div[@id=\"result\"]"));
	   }
	   
	   public List<WebElement> clickExpanButton() {
		  return driver.findElements(By.xpath("//button[@class=\"rct-collapse rct-collapse-btn\"]"));
	   }
	   
	   public List<WebElement> clickCheckBox(){
		   return driver.findElements(By.xpath("//span[@class=\"rct-checkbox\"]"));
	   }
	   
	   public WebElement getCheckBoxText() {
		   return driver.findElement(By.xpath("//div[@id=\"result\"]"));
	   }
	   
	   public void clickRadioButtonTab() {
		   driver.findElement(By.xpath("//li[@id=\"item-2\"]")).click();
	   }
	   
	   public List<WebElement> getYesRadioButton(){
		   return driver.findElements(By.xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"]"));
	   }
	   
	   public WebElement getRadioText() {
		   return driver.findElement(By.xpath("//p[@class = \"mt-3\"]"));
	   }
	   
	   public void clickWebTablesTab() {
		   driver.findElement(By.xpath("//li[@id=\"item-3\"]")).click();
	   }
	   
	   public void clickAddButtonWebTablePage() {
		   driver.findElement(By.xpath("//button[@id=\"addNewRecordButton\"]")).click();
	   }
	   
	   public WebElement getRegistrationBoxLabel() {
		   return driver.findElement(By.xpath("//div[@id=\"registration-form-modal\"]"));
	   }
	   
	   public WebElement getFirtsNameRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
	   }
	   
	   public WebElement getLastNameRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	   }
	   
	   public WebElement getEmailRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
	   }
	   
	   public WebElement getAgeRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"age\"]"));
	   }
	   
	   public WebElement getSalaryRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"salary\"]"));
	   }
	   
	   public WebElement getDeptRegForm() {
		   return driver.findElement(By.xpath("//input[@id=\"department\"]"));
	   }
	   
	   public void clickSubmitRegForm() {
		   driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
	   }
	   
	   public WebElement searchInSearchBoxRegForm() {
		  return driver.findElement(By.xpath("//input[@id=\"searchBox\"]"));
	   }
	   
	   public List<WebElement> searchFieldInRegForm(){
		   return driver.findElements(By.xpath("//div[@class=\"rt-td\"]"));
	   }
	   
	   public void clickEditButton() {
		   driver.findElement(By.xpath("//span[@id=\"edit-record-4\"]")).click();
	   }
	   
	   public void clickDeleteButton() {
		   driver.findElement(By.xpath("//span[@id=\"delete-record-4\"]")).click();
	   }
	   
	   public void clickButtonsTab() {
		   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]/span")).click();
	   }
	   
       public WebElement rightClickMessage() {
    	   return driver.findElement(By.id("rightClickMessage"));
       }
       
       public WebElement doubleClickMessage() {
    	   return driver.findElement(By.id("doubleClickBtn"));
       }

       public WebElement selectLinksTab() {
       	return driver.findElement(By.xpath("//li[@id=\"item-5\"]"));
       }

       public void clickHomeLink() {
    	   driver.findElement(By.xpath("//a[@id=\"simpleLink\"]")).click();
       }
       
       public void selectBrokenLinksTab() {
    	    driver.findElement(By.xpath("//*[@id=\"item-6\"]")).click();
       }
       
      //public List<WebElement> getImage() {
      //	   return driver.findElements(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]"));
      // }	
       
       public void clickUploadAndDownload() {
    	   driver.findElement(By.xpath("//*[@id=\"item-7\"]")).click();
       }
}

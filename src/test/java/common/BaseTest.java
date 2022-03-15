package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import elements.Elements;
import help.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	
	protected WebDriver driver = null;
	protected Elements elements;
	protected Utility utility;
	
	@BeforeMethod
	public void webDriverSetUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		driver.get("https://demoqa.com/");
		
		elements = new Elements(driver);
		utility = new Utility(driver);
		
	}
	
	@AfterMethod
	public void webDriverClose() {
		//driver.close();
	}

}

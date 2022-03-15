package help;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Utility {
	
	  private WebDriver driver = null;

	    public Utility(WebDriver driver){
	        this.driver = driver;
	    }
	    
	public void scrolTheScreen() {
     	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

}

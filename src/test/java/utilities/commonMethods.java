package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class commonMethods {
	
	WebDriver driver;
	
	JavascriptExecutor js;
	

	
	public commonMethods(WebDriver driver){
		
		this.driver=driver;
		
		
		
	}
	
	public void scrollDown(int pixels) {
		
		js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,"+pixels+")", "");
	}

}

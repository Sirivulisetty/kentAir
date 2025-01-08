package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDriver {
	
	public WebDriver driver;
	
	
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	public void navigateToUrl(String url) {
		
		driver.get(url);
	}
	
	public void closeDriver() {
		
		driver.close();
	}

}

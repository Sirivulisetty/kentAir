package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	
	WebDriver driver;
	
	
	public homePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="banner-accept-cookies")
	WebElement acceptCookies;
	
	
	public void clickOnAcceptCookies() {
		
		acceptCookies.click();
		
	}

}
